package p084f0;

/* renamed from: f0.k */
/* loaded from: classes.dex */
public class C1948k {

    /* renamed from: a */
    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    public java.util.concurrent.ConcurrentHashMap<java.lang.Long, p065e0.C1501f.b> f8506a;

    public C1948k() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f8506a = r0
            return
    }

    /* renamed from: a */
    public android.graphics.Typeface mo4842a(android.content.Context r1, p065e0.C1501f.b r2, android.content.res.Resources r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public android.graphics.Typeface mo4843b(android.content.Context r1, android.os.CancellationSignal r2, p178k0.C3636l[] r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: c */
    public android.graphics.Typeface mo4856c(android.content.Context r2, java.io.InputStream r3) {
            r1 = this;
            java.io.File r2 = p084f0.C1949l.m4860c(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r3 = p084f0.C1949l.m4859b(r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r3 != 0) goto L12
            r2.delete()
            return r0
        L12:
            java.lang.String r3 = r2.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r2.delete()
            return r3
        L1e:
            r3 = move-exception
            r2.delete()
            throw r3
        L23:
            r2.delete()
            return r0
    }

    /* renamed from: d */
    public android.graphics.Typeface mo4847d(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r1 = p084f0.C1949l.m4860c(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = p084f0.C1949l.m4858a(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
    }

    /* renamed from: e */
    public p178k0.C3636l mo4857e(p178k0.C3636l[] r11, int r12) {
            r10 = this;
            r0 = r12 & 1
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L9
        L7:
            r0 = 700(0x2bc, float:9.81E-43)
        L9:
            r12 = r12 & 2
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L11
            r12 = 1
            goto L12
        L11:
            r12 = 0
        L12:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r11.length
            r6 = 0
        L18:
            if (r6 >= r5) goto L36
            r7 = r11[r6]
            int r8 = r7.f16036c
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r7.f16037d
            if (r9 != r12) goto L2b
            r9 = 0
            goto L2c
        L2b:
            r9 = 1
        L2c:
            int r8 = r8 + r9
            if (r3 == 0) goto L31
            if (r4 <= r8) goto L33
        L31:
            r3 = r7
            r4 = r8
        L33:
            int r6 = r6 + 1
            goto L18
        L36:
            return r3
    }
}
