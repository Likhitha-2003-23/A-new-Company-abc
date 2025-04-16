package com.example.landingpage.model;

import java.util.List;

public class PageContent {
    private String heading;
    private String subheading;
    private String ctaText;
    private List<Feature> features;

    public String getHeading() { return heading; }
    public void setHeading(String heading) { this.heading = heading; }

    public String getSubheading() { return subheading; }
    public void setSubheading(String subheading) { this.subheading = subheading; }

    public String getCtaText() { return ctaText; }
    public void setCtaText(String ctaText) { this.ctaText = ctaText; }

    public List<Feature> getFeatures() { return features; }
    public void setFeatures(List<Feature> features) { this.features = features; }
}