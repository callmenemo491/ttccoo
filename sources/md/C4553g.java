package md;

/* renamed from: md.g */
/* loaded from: classes.dex */
public final class C4553g {
    private final java.util.List<md.C4553g.a> data;
    private final java.lang.String link;
    private final int start;
    private final int verified;

    /* renamed from: md.g$a */
    public static final class a {
        private final java.lang.String key;
        private final java.lang.String value;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.key = r2
                r1.value = r3
                return
        }

        public static /* synthetic */ md.C4553g.a copy$default(md.C4553g.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.value
            Lc:
                md.g$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public final md.C4553g.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                md.g$a r0 = new md.g$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof md.C4553g.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                md.g$a r5 = (md.C4553g.a) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.value
                java.lang.String r5 = r5.value
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.key
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.value
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Data(key="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.key
                r0.append(r1)
                java.lang.String r1 = ", value="
                r0.append(r1)
                java.lang.String r1 = r3.value
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C4553g(java.util.List<md.C4553g.a> r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "link"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.data = r2
            r1.link = r3
            r1.start = r4
            r1.verified = r5
            return
    }

    public static /* synthetic */ md.C4553g copy$default(md.C4553g r0, java.util.List r1, java.lang.String r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.util.List<md.g$a> r1 = r0.data
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.link
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.start
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.verified
        L18:
            md.g r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.util.List<md.C4553g.a> component1() {
            r1 = this;
            java.util.List<md.g$a> r0 = r1.data
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.start
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.verified
            return r0
    }

    public final md.C4553g copy(java.util.List<md.C4553g.a> r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "link"
            p214m2.C4339q.m9706k(r3, r0)
            md.g r0 = new md.g
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4553g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.g r5 = (md.C4553g) r5
            java.util.List<md.g$a> r1 = r4.data
            java.util.List<md.g$a> r3 = r5.data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.link
            java.lang.String r3 = r5.link
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.start
            int r3 = r5.start
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.verified
            int r5 = r5.verified
            if (r1 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final java.util.List<md.C4553g.a> getData() {
            r1 = this;
            java.util.List<md.g$a> r0 = r1.data
            return r0
    }

    public final java.lang.String getLink() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    public final int getStart() {
            r1 = this;
            int r0 = r1.start
            return r0
    }

    public final int getVerified() {
            r1 = this;
            int r0 = r1.verified
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.List<md.g$a> r0 = r3.data
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.link
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.start
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.verified
            int r0 = r0 + r1
            return r0
    }

    public final md.C4557i toBannerUI() {
            r5 = this;
            java.util.List<md.g$a> r0 = r5.data
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            r3 = r1
            md.g$a r3 = (md.C4553g.a) r3
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "mobile"
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L6
            goto L22
        L21:
            r1 = r2
        L22:
            md.g$a r1 = (md.C4553g.a) r1
            if (r1 == 0) goto L2b
            java.lang.String r0 = r1.getValue()
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r0 == 0) goto L3b
            md.i r2 = new md.i
            java.lang.String r1 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.String r0 = p064e.C1493g.m4049a(r1, r0)
            java.lang.String r1 = r5.link
            r2.<init>(r0, r1)
        L3b:
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BannerModel(data="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<md.g$a> r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", link="
            r0.append(r1)
            java.lang.String r1 = r3.link
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r3.start
            r0.append(r1)
            java.lang.String r1 = ", verified="
            r0.append(r1)
            int r1 = r3.verified
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
