package com.jptadros.jpsnewsapp.models

class NewsItemViewModel {

    var abstract: String = ""//This is the heading after the title
    fun getAbstractData(): String {
        return abstract
    }

    fun setAbstractData(mAbstract: String) {
        abstract = mAbstract
    }

    var published_date: String = ""//This is the heading after the title
    fun getPublishedDate(): String {
        return abstract
    }

    fun setPublishedDate(mPublishedDate: String) {
        published_date = mPublishedDate
    }//Date

    var section: String = ""//Part of the world
    fun getSectionData(): String {
        return section
    }

    fun setSectionData(mSection: String) {
        section = mSection
    }

    var subsection: String = ""//Politics, Sport, Business....
    fun getSubSection(): String {
        return subsection
    }

    fun setSubSection(mSubSection: String) {
        subsection = mSubSection
    }

    var title: String = "" // This is the title
    fun getTitleData(): String {
        return title
    }

    fun setTitleData(mTitle: String) {
        title = mTitle
    }

    var url: String = "" //Open this in webView.
    fun getUrlData(): String {
        return url
    }

    fun setUrlData(mUrl: String) {
        url = mUrl
    }

    var byline: String = "" //Author
    fun getByLine(): String {
        return byline
    }

    fun setByLine(mByLine: String) {
        byline = mByLine
    }


}
