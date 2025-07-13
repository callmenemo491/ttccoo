package cg;

/* renamed from: cg.b */
/* loaded from: classes.dex */
public final class C0960b {

    /* renamed from: h */
    public static final androidx.recyclerview.widget.C0604o.e<cg.C0960b> f4960h = null;

    /* renamed from: a */
    public final java.lang.String f4961a;

    /* renamed from: b */
    public final java.lang.String f4962b;

    /* renamed from: c */
    public final java.lang.String f4963c;

    /* renamed from: d */
    public final android.net.Uri f4964d;

    /* renamed from: e */
    public final boolean f4965e;

    /* renamed from: f */
    public final java.lang.Long f4966f;

    /* renamed from: g */
    public int f4967g;

    /* renamed from: cg.b$a */
    public static final class a extends androidx.recyclerview.widget.C0604o.e<cg.C0960b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C0604o.e
        /* renamed from: a */
        public boolean mo2099a(cg.C0960b r3, cg.C0960b r4) {
                r2 = this;
                cg.b r3 = (cg.C0960b) r3
                cg.b r4 = (cg.C0960b) r4
                java.lang.String r0 = r3.f4961a
                java.lang.String r1 = r4.f4961a
                boolean r0 = p214m2.C4339q.m9702c(r0, r1)
                if (r0 == 0) goto L16
                int r3 = r3.f4967g
                int r4 = r4.f4967g
                if (r3 != r4) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                return r3
        }

        @Override // androidx.recyclerview.widget.C0604o.e
        /* renamed from: b */
        public boolean mo2100b(cg.C0960b r1, cg.C0960b r2) {
                r0 = this;
                cg.b r1 = (cg.C0960b) r1
                cg.b r2 = (cg.C0960b) r2
                java.lang.String r1 = r1.f4961a
                java.lang.String r2 = r2.f4961a
                boolean r1 = p214m2.C4339q.m9702c(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.C0604o.e
        /* renamed from: c */
        public java.lang.Object mo2101c(cg.C0960b r1, cg.C0960b r2) {
                r0 = this;
                cg.b r1 = (cg.C0960b) r1
                cg.b r2 = (cg.C0960b) r2
                int r1 = r1.f4967g
                int r2 = r2.f4967g
                if (r1 == r2) goto L10
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }
    }

    static {
            cg.b$a r0 = new cg.b$a
            r0.<init>()
            cg.C0960b.f4960h = r0
            return
    }

    public C0960b(java.lang.String r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5, boolean r6, java.lang.Long r7, int r8) {
            r1 = this;
            java.lang.String r0 = "subtitle"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f4961a = r2
            r1.f4962b = r3
            r1.f4963c = r4
            r1.f4964d = r5
            r1.f4965e = r6
            r1.f4966f = r7
            r1.f4967g = r8
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof cg.C0960b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cg.b r5 = (cg.C0960b) r5
            java.lang.String r1 = r4.f4961a
            java.lang.String r3 = r5.f4961a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4962b
            java.lang.String r3 = r5.f4962b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f4963c
            java.lang.String r3 = r5.f4963c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            android.net.Uri r1 = r4.f4964d
            android.net.Uri r3 = r5.f4964d
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.f4965e
            boolean r3 = r5.f4965e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            java.lang.Long r1 = r4.f4966f
            java.lang.Long r3 = r5.f4966f
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            int r1 = r4.f4967g
            int r5 = r5.f4967g
            if (r1 == r5) goto L51
            return r2
        L51:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4961a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f4962b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4963c
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            android.net.Uri r1 = r3.f4964d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.f4965e
            if (r0 == 0) goto L24
            r0 = 1
        L24:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Long r0 = r3.f4966f
            if (r0 != 0) goto L2d
            r0 = 0
            goto L31
        L2d:
            int r0 = r0.hashCode()
        L31:
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.f4967g
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MediaItemData(mediaId="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f4961a
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r3.f4962b
            r0.append(r1)
            java.lang.String r1 = ", subtitle="
            r0.append(r1)
            java.lang.String r1 = r3.f4963c
            r0.append(r1)
            java.lang.String r1 = ", albumArtUri="
            r0.append(r1)
            android.net.Uri r1 = r3.f4964d
            r0.append(r1)
            java.lang.String r1 = ", browsable="
            r0.append(r1)
            boolean r1 = r3.f4965e
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            java.lang.Long r1 = r3.f4966f
            r0.append(r1)
            java.lang.String r1 = ", playbackState="
            r0.append(r1)
            int r1 = r3.f4967g
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
