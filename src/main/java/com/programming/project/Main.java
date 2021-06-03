/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programming.project;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @author gayanec
 */

@SpringBootApplication
@EnableMongoRepositories("com.programming.project.repository")
@ComponentScan(basePackages = {"com.programming.project"})
@EntityScan("com.programming.project.domain")
@EnableAsync
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);

        Scanner scanner = new Scanner(System.in);
        Programming program;
        
        System.out.println("What programming lenguage you like?");
        System.out.println("(1=Python) or (2=Java)");
        
        int choice = scanner.nextInt();
        
        if(choice ==1){
        
            program = new Python();
            program.LearnProgramming();
        }
        else if(choice ==2){
        
            program = new Java();
            program.LearnProgramming();
        }
        else{
            
            program = new Programming();
            program.LearnProgramming();
        
        }
        
        scanner = new Scanner(System.in);
        
        
        System.out.println("I try overloadding 1st version");
        String choice1 = scanner.nextLine();
        
        program.LearnProgramming(choice1);
        
        
        
        
    }
    
}



