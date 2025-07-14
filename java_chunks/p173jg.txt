package p173jg;

/* renamed from: jg.a */
/* loaded from: classes.dex */
public final class C3609a {

    /* renamed from: a */
    public final java.lang.String f15871a;

    /* renamed from: b */
    public final double f15872b;

    /* renamed from: c */
    public final java.lang.String f15873c;

    /* renamed from: d */
    public final int f15874d;

    public C3609a(java.lang.String r2, double r3, java.lang.String r5, int r6) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f15871a = r2
            r1.f15872b = r3
            r1.f15873c = r5
            r1.f15874d = r6
            return
    }

    /* renamed from: a */
    public final java.lang.String m8037a() {
            r5 = this;
            java.lang.String r0 = r5.f15873c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            r3 = 2
            java.lang.String r4 = "http"
            boolean r0 = p362uh.C6463i.m13061R(r0, r4, r2, r3)
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            java.lang.String r0 = r5.f15873c
            goto L37
        L17:
            java.lang.String r0 = r5.f15873c
            if (r0 == 0) goto L23
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L28
            java.lang.String r0 = ""
            goto L37
        L28:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r5.f15873c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L37:
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p173jg.C3609a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jg.a r6 = (p173jg.C3609a) r6
            java.lang.String r1 = r5.f15871a
            java.lang.String r3 = r6.f15871a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            double r3 = r5.f15872b
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f15872b
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            java.lang.String r1 = r5.f15873c
            java.lang.String r3 = r6.f15873c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L35
            return r2
        L35:
            int r1 = r5.f15874d
            int r6 = r6.f15874d
            if (r1 == r6) goto L3c
            return r2
        L3c:
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f15871a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            double r1 = r5.f15872b
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.f15873c
            if (r1 != 0) goto L1d
            r1 = 0
            goto L21
        L1d:
            int r1 = r1.hashCode()
        L21:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.f15874d
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ExtractorUI(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f15871a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            double r1 = r3.f15872b
            r0.append(r1)
            java.lang.String r1 = ", image="
            r0.append(r1)
            java.lang.String r1 = r3.f15873c
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            int r1 = r3.f15874d
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
