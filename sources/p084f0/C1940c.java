package p084f0;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class C1940c {

    /* renamed from: e */
    public static final p084f0.C1940c f8480e = null;

    /* renamed from: a */
    public final int f8481a;

    /* renamed from: b */
    public final int f8482b;

    /* renamed from: c */
    public final int f8483c;

    /* renamed from: d */
    public final int f8484d;

    static {
            f0.c r0 = new f0.c
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            p084f0.C1940c.f8480e = r0
            return
    }

    public C1940c(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f8481a = r1
            r0.f8482b = r2
            r0.f8483c = r3
            r0.f8484d = r4
            return
    }

    /* renamed from: a */
    public static p084f0.C1940c m4827a(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            f0.c r1 = p084f0.C1940c.f8480e
            return r1
        Lb:
            f0.c r0 = new f0.c
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: b */
    public static p084f0.C1940c m4828b(android.graphics.Insets r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            f0.c r3 = m4827a(r0, r1, r2, r3)
            return r3
    }

    /* renamed from: c */
    public android.graphics.Insets m4829c() {
            r4 = this;
            int r0 = r4.f8481a
            int r1 = r4.f8482b
            int r2 = r4.f8483c
            int r3 = r4.f8484d
            android.graphics.Insets r0 = android.graphics.Insets.of(r0, r1, r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<f0.c> r2 = p084f0.C1940c.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            f0.c r5 = (p084f0.C1940c) r5
            int r2 = r4.f8484d
            int r3 = r5.f8484d
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f8481a
            int r3 = r5.f8481a
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.f8483c
            int r3 = r5.f8483c
            if (r2 == r3) goto L27
            return r1
        L27:
            int r2 = r4.f8482b
            int r5 = r5.f8482b
            if (r2 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f8481a
            int r0 = r0 * 31
            int r1 = r2.f8482b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f8483c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f8484d
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Insets{left="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f8481a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r3.f8482b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r3.f8483c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r1 = r3.f8484d
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
