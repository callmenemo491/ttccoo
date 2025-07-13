package p119h2;

/* renamed from: h2.j */
/* loaded from: classes.dex */
public class C2448j extends p105g2.AbstractC2220n<java.lang.String> {

    /* renamed from: n0 */
    public final java.lang.Object f10945n0;

    /* renamed from: o0 */
    public p105g2.C2222p.b<java.lang.String> f10946o0;

    public C2448j(int r1, java.lang.String r2, p105g2.C2222p.b<java.lang.String> r3, p105g2.C2222p.a r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f10945n0 = r1
            r0.f10946o0 = r3
            return
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: g */
    public void mo5802g() {
            r2 = this;
            super.mo5802g()
            java.lang.Object r0 = r2.f10945n0
            monitor-enter(r0)
            r1 = 0
            r2.f10946o0 = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: h */
    public void mo5803h(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r2.f10945n0
            monitor-enter(r0)
            g2.p$b<java.lang.String> r1 = r2.f10946o0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.mo117a(r3)
        Ld:
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: v */
    public p105g2.C2222p<java.lang.String> mo5812v(p105g2.C2218l r22) {
            r21 = this;
            r0 = r22
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L10
            byte[] r2 = r0.f10136b     // Catch: java.io.UnsupportedEncodingException -> L10
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f10137c     // Catch: java.io.UnsupportedEncodingException -> L10
            java.lang.String r3 = p119h2.C2443e.m6214b(r3)     // Catch: java.io.UnsupportedEncodingException -> L10
            r1.<init>(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L10
            goto L17
        L10:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.f10136b
            r1.<init>(r2)
        L17:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f10137c
            if (r4 != 0) goto L21
            goto L9c
        L21:
            java.lang.String r5 = "Date"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L30
            long r8 = p119h2.C2443e.m6215c(r5)
            goto L32
        L30:
            r8 = 0
        L32:
            java.lang.String r5 = "Cache-Control"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r11 = 0
            if (r5 == 0) goto La2
            java.lang.String r12 = ","
            java.lang.String[] r5 = r5.split(r12, r11)
            r12 = 0
            r13 = 0
            r15 = 0
        L48:
            int r10 = r5.length
            if (r11 >= r10) goto L9f
            r10 = r5[r11]
            java.lang.String r10 = r10.trim()
            java.lang.String r6 = "no-cache"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L9c
            java.lang.String r6 = "no-store"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L62
            goto L9c
        L62:
            java.lang.String r6 = "max-age="
            boolean r6 = r10.startsWith(r6)
            if (r6 == 0) goto L75
            r6 = 8
            java.lang.String r6 = r10.substring(r6)     // Catch: java.lang.Exception -> L99
            long r13 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L99
            goto L99
        L75:
            java.lang.String r6 = "stale-while-revalidate="
            boolean r6 = r10.startsWith(r6)
            if (r6 == 0) goto L88
            r6 = 23
            java.lang.String r6 = r10.substring(r6)     // Catch: java.lang.Exception -> L99
            long r15 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L99
            goto L99
        L88:
            java.lang.String r6 = "must-revalidate"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L98
            java.lang.String r6 = "proxy-revalidate"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L99
        L98:
            r12 = 1
        L99:
            int r11 = r11 + 1
            goto L48
        L9c:
            r0 = 0
            goto L111
        L9f:
            r11 = r12
            r10 = 1
            goto La7
        La2:
            r10 = 0
            r13 = 0
            r15 = 0
        La7:
            java.lang.String r5 = "Expires"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Lb6
            long r5 = p119h2.C2443e.m6215c(r5)
            goto Lb8
        Lb6:
            r5 = 0
        Lb8:
            java.lang.String r7 = "Last-Modified"
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lc9
            long r17 = p119h2.C2443e.m6215c(r7)
            r19 = r17
            goto Lcb
        Lc9:
            r19 = 0
        Lcb:
            java.lang.String r7 = "ETag"
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r10 == 0) goto Le6
            r5 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r5
            long r13 = r13 + r2
            if (r11 == 0) goto Lde
            r15 = r13
            goto Le4
        Lde:
            java.lang.Long.signum(r15)
            long r15 = r15 * r5
            long r15 = r15 + r13
        Le4:
            r2 = r15
            goto Lf5
        Le6:
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto Lf3
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 < 0) goto Lf3
            long r5 = r5 - r8
            long r2 = r2 + r5
            goto Lf4
        Lf3:
            r2 = r10
        Lf4:
            r13 = r2
        Lf5:
            g2.b$a r5 = new g2.b$a
            r5.<init>()
            byte[] r6 = r0.f10136b
            r5.f10104a = r6
            r5.f10105b = r7
            r5.f10109f = r13
            r5.f10108e = r2
            r5.f10106c = r8
            r2 = r19
            r5.f10107d = r2
            r5.f10110g = r4
            java.util.List<g2.h> r0 = r0.f10138d
            r5.f10111h = r0
            r0 = r5
        L111:
            g2.p r2 = new g2.p
            r2.<init>(r1, r0)
            return r2
    }
}
