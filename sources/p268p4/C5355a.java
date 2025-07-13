package p268p4;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public final class C5355a extends p268p4.AbstractC5358d {

    /* renamed from: e */
    public static final int[] f21264e = null;

    /* renamed from: b */
    public boolean f21265b;

    /* renamed from: c */
    public boolean f21266c;

    /* renamed from: d */
    public int f21267d;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [5512, 11025, 22050, 44100} // fill-array
            p268p4.C5355a.f21264e = r0
            return
    }

    public C5355a(p216m4.InterfaceC4381z r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: b */
    public boolean mo11659b(p371v5.C6571u r4) {
            r3 = this;
            boolean r0 = r3.f21265b
            r1 = 1
            if (r0 != 0) goto L64
            int r4 = r4.m13418u()
            int r0 = r4 >> 4
            r0 = r0 & 15
            r3.f21267d = r0
            r2 = 2
            if (r0 != r2) goto L25
            int r4 = r4 >> r2
            r4 = r4 & 3
            int[] r0 = p268p4.C5355a.f21264e
            r4 = r0[r4]
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r2 = "audio/mpeg"
            r0.f8927k = r2
            r0.f8940x = r1
            goto L54
        L25:
            r4 = 7
            if (r0 == r4) goto L42
            r2 = 8
            if (r0 != r2) goto L2d
            goto L42
        L2d:
            r4 = 10
            if (r0 != r4) goto L32
            goto L61
        L32:
            p4.d$a r4 = new p4.d$a
            int r0 = r3.f21267d
            r1 = 39
            java.lang.String r2 = "Audio format not supported: "
            java.lang.String r0 = p064e.C1490d.m4039a(r1, r2, r0)
            r4.<init>(r0)
            throw r4
        L42:
            if (r0 != r4) goto L47
            java.lang.String r4 = "audio/g711-alaw"
            goto L49
        L47:
            java.lang.String r4 = "audio/g711-mlaw"
        L49:
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            r0.f8927k = r4
            r0.f8940x = r1
            r4 = 8000(0x1f40, float:1.121E-41)
        L54:
            r0.f8941y = r4
            f4.e0 r4 = r0.m5193a()
            m4.z r0 = r3.f21287a
            r0.mo5973e(r4)
            r3.f21266c = r1
        L61:
            r3.f21265b = r1
            goto L67
        L64:
            r4.m13397G(r1)
        L67:
            return r1
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: c */
    public boolean mo11660c(p371v5.C6571u r13, long r14) {
            r12 = this;
            int r0 = r12.f21267d
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L19
            int r7 = r13.m13398a()
            m4.z r0 = r12.f21287a
            r0.mo5972d(r13, r7)
            m4.z r3 = r12.f21287a
            r6 = 1
            r8 = 0
            r9 = 0
            r4 = r14
            r3.mo5971c(r4, r6, r7, r8, r9)
            return r1
        L19:
            int r0 = r13.m13418u()
            r2 = 0
            if (r0 != 0) goto L61
            boolean r3 = r12.f21266c
            if (r3 != 0) goto L61
            int r14 = r13.m13398a()
            byte[] r15 = new byte[r14]
            byte[] r0 = r13.f25710a
            int r3 = r13.f25711b
            java.lang.System.arraycopy(r0, r3, r15, r2, r14)
            int r0 = r13.f25711b
            int r0 = r0 + r14
            r13.f25711b = r0
            h4.a$b r13 = p121h4.C2455a.m6236c(r15)
            f4.e0$b r14 = new f4.e0$b
            r14.<init>()
            java.lang.String r0 = "audio/mp4a-latm"
            r14.f8927k = r0
            java.lang.String r0 = r13.f10958c
            r14.f8924h = r0
            int r0 = r13.f10957b
            r14.f8940x = r0
            int r13 = r13.f10956a
            r14.f8941y = r13
            java.util.List r13 = java.util.Collections.singletonList(r15)
            r14.f8929m = r13
            f4.e0 r13 = r14.m5193a()
            m4.z r14 = r12.f21287a
            r14.mo5973e(r13)
            r12.f21266c = r1
            return r2
        L61:
            int r3 = r12.f21267d
            r4 = 10
            if (r3 != r4) goto L6b
            if (r0 != r1) goto L6a
            goto L6b
        L6a:
            return r2
        L6b:
            int r9 = r13.m13398a()
            m4.z r0 = r12.f21287a
            r0.mo5972d(r13, r9)
            m4.z r5 = r12.f21287a
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r14
            r5.mo5971c(r6, r8, r9, r10, r11)
            return r1
    }
}
