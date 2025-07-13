package p352u5;

/* renamed from: u5.l */
/* loaded from: classes.dex */
public final class C6323l {

    /* renamed from: a */
    public final android.net.Uri f24704a;

    /* renamed from: b */
    public final long f24705b;

    /* renamed from: c */
    public final int f24706c;

    /* renamed from: d */
    public final byte[] f24707d;

    /* renamed from: e */
    public final java.util.Map<java.lang.String, java.lang.String> f24708e;

    /* renamed from: f */
    public final long f24709f;

    /* renamed from: g */
    public final long f24710g;

    /* renamed from: h */
    public final java.lang.String f24711h;

    /* renamed from: i */
    public final int f24712i;

    /* renamed from: j */
    public final java.lang.Object f24713j;

    /* renamed from: u5.l$a */
    public static /* synthetic */ class a {
    }

    static {
            java.lang.String r0 = "goog.exo.datasource"
            p088f4.C1997c0.m5181a(r0)
            return
    }

    public C6323l(android.net.Uri r16, long r17, int r19, byte[] r20, java.util.Map r21, long r22, long r24, java.lang.String r26, int r27, java.lang.Object r28, p352u5.C6323l.a r29) {
            r15 = this;
            r0 = r15
            r1 = r17
            r3 = r20
            r4 = r22
            r6 = r24
            r15.<init>()
            long r8 = r1 + r4
            r10 = 1
            r11 = 0
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L18
            r8 = 1
            goto L19
        L18:
            r8 = 0
        L19:
            p371v5.C6549a.m13288b(r8)
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 < 0) goto L22
            r8 = 1
            goto L23
        L22:
            r8 = 0
        L23:
            p371v5.C6549a.m13288b(r8)
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 > 0) goto L32
            r8 = -1
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 != 0) goto L31
            goto L32
        L31:
            r10 = 0
        L32:
            p371v5.C6549a.m13288b(r10)
            r8 = r16
            r0.f24704a = r8
            r0.f24705b = r1
            r1 = r19
            r0.f24706c = r1
            if (r3 == 0) goto L46
            int r1 = r3.length
            if (r1 == 0) goto L46
            r1 = r3
            goto L47
        L46:
            r1 = 0
        L47:
            r0.f24707d = r1
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r21
            r1.<init>(r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.f24708e = r1
            r0.f24709f = r4
            r0.f24710g = r6
            r1 = r26
            r0.f24711h = r1
            r1 = r27
            r0.f24712i = r1
            r1 = r28
            r0.f24713j = r1
            return
    }

    /* renamed from: a */
    public static java.lang.String m12965a(int r1) {
            r0 = 1
            if (r1 == r0) goto L15
            r0 = 2
            if (r1 == r0) goto L12
            r0 = 3
            if (r1 != r0) goto Lc
            java.lang.String r1 = "HEAD"
            return r1
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L12:
            java.lang.String r1 = "POST"
            return r1
        L15:
            java.lang.String r1 = "GET"
            return r1
    }

    public java.lang.String toString() {
            r11 = this;
            int r0 = r11.f24706c
            java.lang.String r0 = m12965a(r0)
            android.net.Uri r1 = r11.f24704a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            long r2 = r11.f24709f
            long r4 = r11.f24710g
            java.lang.String r6 = r11.f24711h
            int r7 = r11.f24712i
            int r8 = r0.length()
            int r8 = r8 + 70
            int r9 = r1.length()
            int r9 = r9 + r8
            int r8 = p064e.C1489c.m4038a(r6, r9)
            java.lang.String r9 = "DataSpec["
            java.lang.String r10 = " "
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r8, r9, r0, r10, r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
