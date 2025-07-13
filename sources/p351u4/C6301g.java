package p351u4;

/* renamed from: u4.g */
/* loaded from: classes.dex */
public final class C6301g extends p351u4.AbstractC6302h {

    /* renamed from: o */
    public static final byte[] f24593o = null;

    /* renamed from: n */
    public boolean f24594n;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [79, 112, 117, 115, 72, 101, 97, 100} // fill-array
            p351u4.C6301g.f24593o = r0
            return
    }

    public C6301g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: c */
    public long mo12933c(p371v5.C6571u r7) {
            r6 = this;
            byte[] r7 = r7.f25710a
            r0 = 0
            r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r0 & 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L17
            if (r1 == r2) goto L17
            r7 = r7[r3]
            r2 = r7 & 63
            goto L17
        L16:
            r2 = 1
        L17:
            r7 = 3
            int r0 = r0 >> r7
            r1 = r0 & 3
            r4 = 16
            if (r0 < r4) goto L23
            r7 = 2500(0x9c4, float:3.503E-42)
            int r7 = r7 << r1
            goto L36
        L23:
            r4 = 12
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r4) goto L2e
            r7 = r1 & 1
            int r7 = r5 << r7
            goto L36
        L2e:
            if (r1 != r7) goto L34
            r7 = 60000(0xea60, float:8.4078E-41)
            goto L36
        L34:
            int r7 = r5 << r1
        L36:
            long r0 = (long) r2
            long r2 = (long) r7
            long r0 = r0 * r2
            long r0 = r6.m12942a(r0)
            return r0
    }

    @Override // p351u4.AbstractC6302h
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo12934d(p371v5.C6571u r3, long r4, p351u4.AbstractC6302h.b r6) {
            r2 = this;
            boolean r4 = r2.f24594n
            r5 = 1
            if (r4 != 0) goto L32
            byte[] r4 = r3.f25710a
            int r3 = r3.f25712c
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r4 = 9
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.util.List r3 = p064e.C1487a.m4024b(r3)
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r1 = "audio/opus"
            r0.f8927k = r1
            r0.f8940x = r4
            r4 = 48000(0xbb80, float:6.7262E-41)
            r0.f8941y = r4
            r0.f8929m = r3
            f4.e0 r3 = r0.m5193a()
            r6.f24608a = r3
            r2.f24594n = r5
            return r5
        L32:
            f4.e0 r4 = r6.f24608a
            java.util.Objects.requireNonNull(r4)
            int r4 = r3.m13403f()
            r6 = 1332770163(0x4f707573, float:4.034229E9)
            r0 = 0
            if (r4 != r6) goto L42
            goto L43
        L42:
            r5 = 0
        L43:
            r3.m13396F(r0)
            return r5
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: e */
    public void mo12935e(boolean r1) {
            r0 = this;
            super.mo12935e(r1)
            if (r1 == 0) goto L8
            r1 = 0
            r0.f24594n = r1
        L8:
            return
    }
}
