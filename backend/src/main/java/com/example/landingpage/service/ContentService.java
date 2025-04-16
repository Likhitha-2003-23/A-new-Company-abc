package com.example.landingpage.service;

import com.example.landingpage.model.Feature;
import com.example.landingpage.model.PageContent;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ContentService {
    public PageContent getPageContent() {
        PageContent content = new PageContent();
        content.setHeading("Hyper boost your Revenue Management, Marketing and Commercial Functions with Business Ready AI");
        content.setSubheading("Powerful AI solutions that go beyond mere data sorting and exploration. Use our array of AI enabled solutions that understand your business and recommend the optimal way forward.");
        content.setCtaText("Get started");

        content.setFeatures(Arrays.asList(
            new Feature("Ready to Go Algos", "We have ready accelerators embedded with learnings from hundreds of past projects, generating actionable results."),
            new Feature("Internal capability building", "We productize all our work, enhance them with the latest AI technology, and train your internal teams to leverage them."),
            new Feature("Multi-source data", "Our solutions work with old, new, or incomplete datasets, in different formats, and from varied sources."),
            new Feature("Stakeholder alignment", "No black boxes. Stakeholders understand the 'how', 'so what' and 'now what', leading to clear decision-making trade offs."),
            new Feature("Continuous engagement", "We engage in the long-term to enhance, course-correct, and adapt new models to continuously refine your work.")
        ));

        return content;
    }
}