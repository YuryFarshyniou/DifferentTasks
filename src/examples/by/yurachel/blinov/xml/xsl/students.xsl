<?xml version="1.0" encoding="UTF-8" ?>

<!--Преобразование student.xml более долгим путем. -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="xml"/> <!--Конечный документ ,который получится после преобразования,будет xml документ-->

    <xsl:template match="/"> <!-- template Задает шаблон преобразования  -->
        <students>
            <xsl:apply-templates/>
        </students>
    </xsl:template>

    <xsl:template match="student">
        <xsl:element name="student">
            <xsl:attribute name="faculty">
                <xsl:value-of select="@faculty"/>
            </xsl:attribute>
            <name>
                <xsl:value-of select="name"/>
            </name>
            <xsl:element name="address">
                <xsl:attribute name="country">
                    <xsl:value-of select="address/country"/>
                </xsl:attribute>
                <xsl:attribute name="city">
                    <xsl:value-of select="address/city"/>
                </xsl:attribute>
                <xsl:attribute name="street">
                    <xsl:value-of select="address/street"/>
                </xsl:attribute>
                <xsl:element name="telephone">
                    <xsl:attribute name="number">
                        <xsl:value-of select="telephone"/>
                    </xsl:attribute>
                </xsl:element>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>