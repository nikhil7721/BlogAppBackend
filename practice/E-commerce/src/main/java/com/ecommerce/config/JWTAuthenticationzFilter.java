package com.ecommerce.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JWTAuthenticationzFilter extends OncePerRequestFilter{

	@Autowired
    private UserDetailsService userDetailsService;
	
    @Autowired
    private JWTTokenHelper jwtTokenHelper;
    
    @Autowired
    public JWTAuthenticationzFilter(UserDetailsService userDetailsService,JWTTokenHelper jwtTokenHelper) {
        this.userDetailsService=userDetailsService;
        this.jwtTokenHelper=jwtTokenHelper;

    }


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authToken=jwtTokenHelper.getToken(httpServletRequest);

        if(null!=authToken) {

            String userName=jwtTokenHelper.getUsernameFromToken(authToken);

            if(null!=userName) {

                UserDetails userDetails=userDetailsService.loadUserByUsername(userName);

                if(jwtTokenHelper.validateToken(authToken, userDetails)) {
                    UsernamePasswordAuthenticationToken authentication=new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetails(httpServletRequest));
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }

            }

        }

        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

}
