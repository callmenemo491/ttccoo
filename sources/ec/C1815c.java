package ec;

/* renamed from: ec.c */
/* loaded from: classes.dex */
public final class C1815c {

    /* renamed from: a */
    public final java.lang.String f7924a;

    /* renamed from: b */
    public ec.EnumC1818f f7925b;

    /* renamed from: c */
    public sb.C6010d f7926c;

    /* renamed from: d */
    public sb.C6010d f7927d;

    /* renamed from: e */
    public final java.lang.StringBuilder f7928e;

    /* renamed from: f */
    public int f7929f;

    /* renamed from: g */
    public int f7930g;

    /* renamed from: h */
    public ec.C1817e f7931h;

    /* renamed from: i */
    public int f7932i;

    public C1815c(java.lang.String r8) {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r0 = r8.getBytes(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L35
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r5 = 63
            if (r4 != r5) goto L2f
            char r6 = r8.charAt(r3)
            if (r6 != r5) goto L27
            goto L2f
        L27:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message contains characters outside ISO-8859-1 encoding."
            r8.<init>(r0)
            throw r8
        L2f:
            r1.append(r4)
            int r3 = r3 + 1
            goto L15
        L35:
            java.lang.String r0 = r1.toString()
            r7.f7924a = r0
            ec.f r0 = ec.EnumC1818f.f7946Y
            r7.f7925b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8.length()
            r0.<init>(r8)
            r7.f7928e = r0
            r8 = -1
            r7.f7930g = r8
            return
    }

    /* renamed from: a */
    public int m4570a() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f7928e
            int r0 = r0.length()
            return r0
    }

    /* renamed from: b */
    public char m4571b() {
            r2 = this;
            java.lang.String r0 = r2.f7924a
            int r1 = r2.f7929f
            char r0 = r0.charAt(r1)
            return r0
    }

    /* renamed from: c */
    public int m4572c() {
            r2 = this;
            java.lang.String r0 = r2.f7924a
            int r0 = r0.length()
            int r1 = r2.f7932i
            int r0 = r0 - r1
            int r1 = r2.f7929f
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: d */
    public boolean m4573d() {
            r3 = this;
            int r0 = r3.f7929f
            java.lang.String r1 = r3.f7924a
            int r1 = r1.length()
            int r2 = r3.f7932i
            int r1 = r1 - r2
            if (r0 >= r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public void m4574e() {
            r1 = this;
            int r0 = r1.m4570a()
            r1.m4575f(r0)
            return
    }

    /* renamed from: f */
    public void m4575f(int r5) {
            r4 = this;
            ec.e r0 = r4.f7931h
            if (r0 == 0) goto L8
            int r0 = r0.f7939b
            if (r5 <= r0) goto L15
        L8:
            ec.f r0 = r4.f7925b
            sb.d r1 = r4.f7926c
            sb.d r2 = r4.f7927d
            r3 = 1
            ec.e r5 = ec.C1817e.m4577i(r5, r0, r1, r2, r3)
            r4.f7931h = r5
        L15:
            return
    }
}
