package com.google.android.exoplayer2.p044ui;

/* renamed from: com.google.android.exoplayer2.ui.b */
/* loaded from: classes.dex */
public final class C1054b {

    /* renamed from: a */
    public static final java.util.regex.Pattern f5318a = null;

    /* renamed from: com.google.android.exoplayer2.ui.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$b */
    public static class b {

        /* renamed from: a */
        public final java.lang.String f5319a;

        /* renamed from: b */
        public final java.util.Map<java.lang.String, java.lang.String> f5320b;

        public b(java.lang.String r1, java.util.Map r2, com.google.android.exoplayer2.p044ui.C1054b.a r3) {
                r0 = this;
                r0.<init>()
                r0.f5319a = r1
                r0.f5320b = r2
                return
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$c */
    public static final class c {

        /* renamed from: e */
        public static final java.util.Comparator<com.google.android.exoplayer2.p044ui.C1054b.c> f5321e = null;

        /* renamed from: f */
        public static final java.util.Comparator<com.google.android.exoplayer2.p044ui.C1054b.c> f5322f = null;

        /* renamed from: a */
        public final int f5323a;

        /* renamed from: b */
        public final int f5324b;

        /* renamed from: c */
        public final java.lang.String f5325c;

        /* renamed from: d */
        public final java.lang.String f5326d;

        static {
                s5.b r0 = p325s5.C5962b.f22924a0
                com.google.android.exoplayer2.p044ui.C1054b.c.f5321e = r0
                e5.d r0 = p070e5.C1519d.f7378a0
                com.google.android.exoplayer2.p044ui.C1054b.c.f5322f = r0
                return
        }

        public c(int r1, int r2, java.lang.String r3, java.lang.String r4, com.google.android.exoplayer2.p044ui.C1054b.a r5) {
                r0 = this;
                r0.<init>()
                r0.f5323a = r1
                r0.f5324b = r2
                r0.f5325c = r3
                r0.f5326d = r4
                return
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$d */
    public static final class d {

        /* renamed from: a */
        public final java.util.List<com.google.android.exoplayer2.p044ui.C1054b.c> f5327a;

        /* renamed from: b */
        public final java.util.List<com.google.android.exoplayer2.p044ui.C1054b.c> f5328b;

        public d() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5327a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f5328b = r0
                return
        }
    }

    static {
            java.lang.String r0 = "(&#13;)?&#10;"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.p044ui.C1054b.f5318a = r0
            return
    }

    /* renamed from: a */
    public static java.lang.String m2920a(java.lang.CharSequence r1) {
            java.lang.String r1 = android.text.Html.escapeHtml(r1)
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.p044ui.C1054b.f5318a
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = "<br>"
            java.lang.String r1 = r1.replaceAll(r0)
            return r1
    }
}
