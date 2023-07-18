package OnlineResumeBuilder;

import java.util.Scanner;

class ResumeBuilder {
    private String name;
    private String email;
    private String phoneNumber;
    private String education;
    private String experience;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void displayResume() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);
    }
}

public class OnlineResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResumeBuilder resumeBuilder = new ResumeBuilder();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        resumeBuilder.setName(name);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        resumeBuilder.setEmail(email);

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        resumeBuilder.setPhoneNumber(phoneNumber);

        System.out.print("Enter your education: ");
        String education = scanner.nextLine();
        resumeBuilder.setEducation(education);

        System.out.print("Enter your experience: ");
        String experience = scanner.nextLine();
        resumeBuilder.setExperience(experience);

        System.out.println("\nYour Resume:");
        resumeBuilder.displayResume();
    }
}

