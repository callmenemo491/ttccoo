package p377vd;

/* renamed from: vd.t */
/* loaded from: classes.dex */
public final class C6651t {

    /* renamed from: a */
    public final boolean f25858a;

    /* renamed from: b */
    public final java.lang.String f25859b;

    /* renamed from: c */
    public final java.lang.String f25860c;

    /* renamed from: d */
    public final int f25861d;

    public C6651t(boolean r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f25858a = r1
            r0.f25859b = r2
            r0.f25860c = r3
            r0.f25861d = r4
            return
    }

    public C6651t(boolean r1, java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r0 = this;
            r3 = 0
            r5 = r5 & 8
            if (r5 == 0) goto L6
            r4 = 0
        L6:
            r0.<init>()
            r0.f25858a = r1
            r0.f25859b = r2
            r0.f25860c = r3
            r0.f25861d = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p377vd.C6651t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vd.t r5 = (p377vd.C6651t) r5
            boolean r1 = r4.f25858a
            boolean r3 = r5.f25858a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f25859b
            java.lang.String r3 = r5.f25859b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f25860c
            java.lang.String r3 = r5.f25860c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            int r1 = r4.f25861d
            int r5 = r5.f25861d
            if (r1 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.f25858a
            if (r0 == 0) goto L5
            r0 = 1
        L5:
            int r0 = r0 * 31
            java.lang.String r1 = r3.f25859b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f25860c
            if (r1 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            int r1 = r1.hashCode()
        L19:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f25861d
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "StateButtonTaco(isEnabled="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r3.f25858a
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r3.f25859b
            r0.append(r1)
            java.lang.String r1 = ", time="
            r0.append(r1)
            java.lang.String r1 = r3.f25860c
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            int r1 = r3.f25861d
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
