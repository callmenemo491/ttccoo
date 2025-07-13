package p268p4;

/* renamed from: p4.e */
/* loaded from: classes.dex */
public final class C5359e extends p268p4.AbstractC5358d {

    /* renamed from: b */
    public final p371v5.C6571u f21288b;

    /* renamed from: c */
    public final p371v5.C6571u f21289c;

    /* renamed from: d */
    public int f21290d;

    /* renamed from: e */
    public boolean f21291e;

    /* renamed from: f */
    public boolean f21292f;

    /* renamed from: g */
    public int f21293g;

    public C5359e(p216m4.InterfaceC4381z r2) {
            r1 = this;
            r1.<init>(r2)
            v5.u r2 = new v5.u
            byte[] r0 = p371v5.C6568r.f25674a
            r2.<init>(r0)
            r1.f21288b = r2
            v5.u r2 = new v5.u
            r0 = 4
            r2.<init>(r0)
            r1.f21289c = r2
            return
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: b */
    public boolean mo11659b(p371v5.C6571u r4) {
            r3 = this;
            int r4 = r4.m13418u()
            int r0 = r4 >> 4
            r0 = r0 & 15
            r4 = r4 & 15
            r1 = 7
            if (r4 != r1) goto L16
            r3.f21293g = r0
            r4 = 5
            if (r0 == r4) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            return r4
        L16:
            p4.d$a r0 = new p4.d$a
            r1 = 39
            java.lang.String r2 = "Video format not supported: "
            java.lang.String r4 = p064e.C1490d.m4039a(r1, r2, r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // p268p4.AbstractC5358d
    /* renamed from: c */
    public boolean mo11660c(p371v5.C6571u r11, long r12) {
            r10 = this;
            int r0 = r11.m13418u()
            byte[] r1 = r11.f25710a
            int r2 = r11.f25711b
            int r3 = r2 + 1
            r11.f25711b = r3
            r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r2 = r2 >> 8
            int r4 = r3 + 1
            r11.f25711b = r4
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r4 + 1
            r11.f25711b = r3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            long r1 = (long) r1
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            long r4 = r1 + r12
            r12 = 1
            r13 = 0
            if (r0 != 0) goto L7c
            boolean r1 = r10.f21291e
            if (r1 != 0) goto L7c
            v5.u r0 = new v5.u
            int r1 = r11.m13398a()
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            byte[] r1 = r0.f25710a
            int r2 = r11.m13398a()
            r11.m13402e(r1, r13, r2)
            w5.a r11 = p387w5.C6798a.m13827b(r0)
            int r0 = r11.f26397b
            r10.f21290d = r0
            f4.e0$b r0 = new f4.e0$b
            r0.<init>()
            java.lang.String r1 = "video/avc"
            r0.f8927k = r1
            java.lang.String r1 = r11.f26401f
            r0.f8924h = r1
            int r1 = r11.f26398c
            r0.f8932p = r1
            int r1 = r11.f26399d
            r0.f8933q = r1
            float r1 = r11.f26400e
            r0.f8936t = r1
            java.util.List<byte[]> r11 = r11.f26396a
            r0.f8929m = r11
            f4.e0 r11 = r0.m5193a()
            m4.z r0 = r10.f21287a
            r0.mo5973e(r11)
            r10.f21291e = r12
            return r13
        L7c:
            if (r0 != r12) goto Lda
            boolean r0 = r10.f21291e
            if (r0 == 0) goto Lda
            int r0 = r10.f21293g
            if (r0 != r12) goto L88
            r6 = 1
            goto L89
        L88:
            r6 = 0
        L89:
            boolean r0 = r10.f21292f
            if (r0 != 0) goto L90
            if (r6 != 0) goto L90
            return r13
        L90:
            v5.u r0 = r10.f21289c
            byte[] r0 = r0.f25710a
            r0[r13] = r13
            r0[r12] = r13
            r1 = 2
            r0[r1] = r13
            int r0 = r10.f21290d
            r1 = 4
            int r0 = 4 - r0
            r7 = 0
        La1:
            int r2 = r11.m13398a()
            if (r2 <= 0) goto Ld0
            v5.u r2 = r10.f21289c
            byte[] r2 = r2.f25710a
            int r3 = r10.f21290d
            r11.m13402e(r2, r0, r3)
            v5.u r2 = r10.f21289c
            r2.m13396F(r13)
            v5.u r2 = r10.f21289c
            int r2 = r2.m13421x()
            v5.u r3 = r10.f21288b
            r3.m13396F(r13)
            m4.z r3 = r10.f21287a
            v5.u r8 = r10.f21288b
            r3.mo5972d(r8, r1)
            int r7 = r7 + 4
            m4.z r3 = r10.f21287a
            r3.mo5972d(r11, r2)
            int r7 = r7 + r2
            goto La1
        Ld0:
            m4.z r3 = r10.f21287a
            r8 = 0
            r9 = 0
            r3.mo5971c(r4, r6, r7, r8, r9)
            r10.f21292f = r12
            return r12
        Lda:
            return r13
    }
}
