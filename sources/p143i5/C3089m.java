package p143i5;

/* renamed from: i5.m */
/* loaded from: classes.dex */
public final class C3089m extends p088f4.AbstractC2008g implements android.os.Handler.Callback {

    /* renamed from: j0 */
    public final android.os.Handler f12433j0;

    /* renamed from: k0 */
    public final p143i5.InterfaceC3088l f12434k0;

    /* renamed from: l0 */
    public final p143i5.InterfaceC3085i f12435l0;

    /* renamed from: m0 */
    public final androidx.appcompat.widget.C0311x f12436m0;

    /* renamed from: n0 */
    public boolean f12437n0;

    /* renamed from: o0 */
    public boolean f12438o0;

    /* renamed from: p0 */
    public boolean f12439p0;

    /* renamed from: q0 */
    public int f12440q0;

    /* renamed from: r0 */
    public p088f4.C2003e0 f12441r0;

    /* renamed from: s0 */
    public p143i5.InterfaceC3083g f12442s0;

    /* renamed from: t0 */
    public p143i5.C3086j f12443t0;

    /* renamed from: u0 */
    public p143i5.AbstractC3087k f12444u0;

    /* renamed from: v0 */
    public p143i5.AbstractC3087k f12445v0;

    /* renamed from: w0 */
    public int f12446w0;

    /* renamed from: x0 */
    public long f12447x0;

    public C3089m(p143i5.InterfaceC3088l r3, android.os.Looper r4) {
            r2 = this;
            i5.i r0 = p143i5.InterfaceC3085i.f12429a
            r1 = 3
            r2.<init>(r1)
            java.util.Objects.requireNonNull(r3)
            r2.f12434k0 = r3
            if (r4 != 0) goto Lf
            r3 = 0
            goto L16
        Lf:
            int r3 = p371v5.C6552b0.f25624a
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r4, r2)
        L16:
            r2.f12433j0 = r3
            r2.f12435l0 = r0
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r4 = 7
            r3.<init>(r4)
            r2.f12436m0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f12447x0 = r3
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r3 = this;
            r0 = 0
            r3.f12441r0 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f12447x0 = r1
            r3.m7544L()
            r3.m7548P()
            i5.g r1 = r3.f12442s0
            java.util.Objects.requireNonNull(r1)
            r1.release()
            r3.f12442s0 = r0
            r0 = 0
            r3.f12440q0 = r0
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r1, boolean r3) {
            r0 = this;
            r0.m7544L()
            r1 = 0
            r0.f12437n0 = r1
            r0.f12438o0 = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f12447x0 = r1
            int r1 = r0.f12440q0
            if (r1 == 0) goto L17
            r0.m7549Q()
            goto L22
        L17:
            r0.m7548P()
            i5.g r1 = r0.f12442s0
            java.util.Objects.requireNonNull(r1)
            r1.flush()
        L22:
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: J */
    public void mo5250J(p088f4.C2003e0[] r1, long r2, long r4) {
            r0 = this;
            r2 = 0
            r1 = r1[r2]
            r0.f12441r0 = r1
            i5.g r1 = r0.f12442s0
            if (r1 == 0) goto Ld
            r1 = 1
            r0.f12440q0 = r1
            goto L10
        Ld:
            r0.m7547O()
        L10:
            return
    }

    /* renamed from: L */
    public final void m7544L() {
            r3 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            android.os.Handler r1 = r3.f12433j0
            if (r1 == 0) goto L11
            r2 = 0
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
            goto L16
        L11:
            i5.l r1 = r3.f12434k0
            r1.mo5292d(r0)
        L16:
            return
    }

    /* renamed from: M */
    public final long m7545M() {
            r5 = this;
            int r0 = r5.f12446w0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = -1
            if (r0 != r3) goto Lb
            return r1
        Lb:
            i5.k r0 = r5.f12444u0
            java.util.Objects.requireNonNull(r0)
            int r0 = r5.f12446w0
            i5.k r3 = r5.f12444u0
            i5.f r3 = r3.f12431a0
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.mo7540k()
            if (r0 < r3) goto L20
            goto L30
        L20:
            i5.k r0 = r5.f12444u0
            int r1 = r5.f12446w0
            i5.f r2 = r0.f12431a0
            java.util.Objects.requireNonNull(r2)
            long r1 = r2.mo7538g(r1)
            long r3 = r0.f12432b0
            long r1 = r1 + r3
        L30:
            return r1
    }

    /* renamed from: N */
    public final void m7546N(p143i5.C3084h r4) {
            r3 = this;
            f4.e0 r0 = r3.f12441r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Subtitle decoding failed. streamFormat="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "TextRenderer"
            p371v5.C6565o.m13369b(r1, r0, r4)
            r3.m7544L()
            r3.m7549Q()
            return
    }

    /* renamed from: O */
    public final void m7547O() {
            r5 = this;
            r0 = 1
            r5.f12439p0 = r0
            i5.i r1 = r5.f12435l0
            f4.e0 r2 = r5.f12441r0
            java.util.Objects.requireNonNull(r2)
            i5.i$a r1 = (p143i5.InterfaceC3085i.a) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r2.f8896j0
            if (r1 == 0) goto Lfe
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1351681404: goto L9d;
                case -1248334819: goto L93;
                case -1026075066: goto L88;
                case -1004728940: goto L7d;
                case 691401887: goto L72;
                case 822864842: goto L67;
                case 930165504: goto L5c;
                case 1201784583: goto L51;
                case 1566015601: goto L45;
                case 1566016562: goto L38;
                case 1668750253: goto L2b;
                case 1693976202: goto L1e;
                default: goto L1b;
            }
        L1b:
            r0 = -1
            goto La8
        L1e:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L27
            goto L1b
        L27:
            r0 = 11
            goto La8
        L2b:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            goto L1b
        L34:
            r0 = 10
            goto La8
        L38:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L1b
        L41:
            r0 = 9
            goto La8
        L45:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4e
            goto L1b
        L4e:
            r0 = 8
            goto La8
        L51:
            java.lang.String r0 = "text/x-exoplayer-cues"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            goto L1b
        L5a:
            r0 = 7
            goto La8
        L5c:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L65
            goto L1b
        L65:
            r0 = 6
            goto La8
        L67:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L70
            goto L1b
        L70:
            r0 = 5
            goto La8
        L72:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            goto L1b
        L7b:
            r0 = 4
            goto La8
        L7d:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            goto L1b
        L86:
            r0 = 3
            goto La8
        L88:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L91
            goto L1b
        L91:
            r0 = 2
            goto La8
        L93:
            java.lang.String r4 = "application/pgs"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La8
            goto L1b
        L9d:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La7
            goto L1b
        La7:
            r0 = 0
        La8:
            switch(r0) {
                case 0: goto Lf4;
                case 1: goto Lee;
                case 2: goto Le8;
                case 3: goto Le2;
                case 4: goto Lda;
                case 5: goto Ld2;
                case 6: goto Lc8;
                case 7: goto Lc2;
                case 8: goto Lc8;
                case 9: goto Lb8;
                case 10: goto Lb2;
                case 11: goto Lac;
                default: goto Lab;
            }
        Lab:
            goto Lfe
        Lac:
            p5.c r0 = new p5.c
            r0.<init>()
            goto Lfb
        Lb2:
            o5.a r0 = new o5.a
            r0.<init>()
            goto Lfb
        Lb8:
            j5.c r0 = new j5.c
            int r1 = r2.f8882B0
            java.util.List<byte[]> r2 = r2.f8898l0
            r0.<init>(r1, r2)
            goto Lfb
        Lc2:
            i5.c r0 = new i5.c
            r0.<init>()
            goto Lfb
        Lc8:
            j5.a r0 = new j5.a
            int r2 = r2.f8882B0
            r3 = 16000(0x3e80, double:7.905E-320)
            r0.<init>(r1, r2, r3)
            goto Lfb
        Ld2:
            n5.a r0 = new n5.a
            java.util.List<byte[]> r1 = r2.f8898l0
            r0.<init>(r1)
            goto Lfb
        Lda:
            q5.a r0 = new q5.a
            java.util.List<byte[]> r1 = r2.f8898l0
            r0.<init>(r1)
            goto Lfb
        Le2:
            r5.g r0 = new r5.g
            r0.<init>()
            goto Lfb
        Le8:
            r5.a r0 = new r5.a
            r0.<init>()
            goto Lfb
        Lee:
            l5.a r0 = new l5.a
            r0.<init>()
            goto Lfb
        Lf4:
            k5.a r0 = new k5.a
            java.util.List<byte[]> r1 = r2.f8898l0
            r0.<init>(r1)
        Lfb:
            r5.f12442s0 = r0
            return
        Lfe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L111
            java.lang.String r1 = r2.concat(r1)
            goto L116
        L111:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L116:
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: P */
    public final void m7548P() {
            r2 = this;
            r0 = 0
            r2.f12443t0 = r0
            r1 = -1
            r2.f12446w0 = r1
            i5.k r1 = r2.f12444u0
            if (r1 == 0) goto Lf
            r1.mo7527t()
            r2.f12444u0 = r0
        Lf:
            i5.k r1 = r2.f12445v0
            if (r1 == 0) goto L18
            r1.mo7527t()
            r2.f12445v0 = r0
        L18:
            return
    }

    /* renamed from: Q */
    public final void m7549Q() {
            r1 = this;
            r1.m7548P()
            i5.g r0 = r1.f12442s0
            java.util.Objects.requireNonNull(r0)
            r0.release()
            r0 = 0
            r1.f12442s0 = r0
            r0 = 0
            r1.f12440q0 = r0
            r1.m7547O()
            return
    }

    @Override // p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1
    /* renamed from: a */
    public java.lang.String mo5195a() {
            r1 = this;
            java.lang.String r0 = "TextRenderer"
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: d */
    public boolean mo5197d() {
            r1 = this;
            boolean r0 = r1.f12438o0
            return r0
    }

    @Override // p088f4.InterfaceC2007f1
    /* renamed from: f */
    public int mo5239f(p088f4.C2003e0 r5) {
            r4 = this;
            i5.i r0 = r4.f12435l0
            i5.i$a r0 = (p143i5.InterfaceC3085i.a) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = r5.f8896j0
            java.lang.String r1 = "text/vtt"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L6e
            java.lang.String r1 = "text/x-ssa"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/x-mp4-vtt"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/x-quicktime-tx3g"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/cea-608"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/x-mp4-cea-608"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/cea-708"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "application/pgs"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "text/x-exoplayer-cues"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            goto L6e
        L6c:
            r0 = 0
            goto L6f
        L6e:
            r0 = 1
        L6f:
            if (r0 == 0) goto L7b
            int r5 = r5.f8883C0
            if (r5 != 0) goto L77
            r5 = 4
            goto L78
        L77:
            r5 = 2
        L78:
            r5 = r5 | r3
            r5 = r5 | r3
            return r5
        L7b:
            java.lang.String r5 = r5.f8896j0
            boolean r5 = p371v5.C6567q.m13379i(r5)
            if (r5 == 0) goto L84
            return r2
        L84:
            return r3
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r2.what
            if (r0 != 0) goto Lf
            java.lang.Object r2 = r2.obj
            java.util.List r2 = (java.util.List) r2
            i5.l r0 = r1.f12434k0
            r0.mo5292d(r2)
            r2 = 1
            return r2
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: i */
    public boolean mo5200i() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: m */
    public void mo5203m(long r9, long r11) {
            r8 = this;
            boolean r11 = r8.f8956h0
            r12 = 1
            if (r11 == 0) goto L19
            long r0 = r8.f12447x0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L19
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 < 0) goto L19
            r8.m7548P()
            r8.f12438o0 = r12
        L19:
            boolean r11 = r8.f12438o0
            if (r11 == 0) goto L1e
            return
        L1e:
            i5.k r11 = r8.f12445v0
            if (r11 != 0) goto L3d
            i5.g r11 = r8.f12442s0
            java.util.Objects.requireNonNull(r11)
            r11.mo7536a(r9)
            i5.g r11 = r8.f12442s0     // Catch: p143i5.C3084h -> L38
            java.util.Objects.requireNonNull(r11)     // Catch: p143i5.C3084h -> L38
            java.lang.Object r11 = r11.mo7520c()     // Catch: p143i5.C3084h -> L38
            i5.k r11 = (p143i5.AbstractC3087k) r11     // Catch: p143i5.C3084h -> L38
            r8.f12445v0 = r11     // Catch: p143i5.C3084h -> L38
            goto L3d
        L38:
            r9 = move-exception
            r8.m7546N(r9)
            return
        L3d:
            int r11 = r8.f8951c0
            r0 = 2
            if (r11 == r0) goto L43
            return
        L43:
            i5.k r11 = r8.f12444u0
            r1 = 0
            if (r11 == 0) goto L5c
            long r2 = r8.m7545M()
            r11 = 0
        L4d:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L5d
            int r11 = r8.f12446w0
            int r11 = r11 + r12
            r8.f12446w0 = r11
            long r2 = r8.m7545M()
            r11 = 1
            goto L4d
        L5c:
            r11 = 0
        L5d:
            i5.k r2 = r8.f12445v0
            r3 = 0
            if (r2 == 0) goto La6
            boolean r4 = r2.m7517r()
            if (r4 == 0) goto L85
            if (r11 != 0) goto La6
            long r4 = r8.m7545M()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto La6
            int r2 = r8.f12440q0
            if (r2 != r0) goto L7f
            r8.m7549Q()
            goto La6
        L7f:
            r8.m7548P()
            r8.f12438o0 = r12
            goto La6
        L85:
            long r4 = r2.f12364Z
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 > 0) goto La6
            i5.k r11 = r8.f12444u0
            if (r11 == 0) goto L92
            r11.mo7527t()
        L92:
            i5.f r11 = r2.f12431a0
            java.util.Objects.requireNonNull(r11)
            long r4 = r2.f12432b0
            long r4 = r9 - r4
            int r11 = r11.mo7537e(r4)
            r8.f12446w0 = r11
            r8.f12444u0 = r2
            r8.f12445v0 = r3
            r11 = 1
        La6:
            if (r11 == 0) goto Lcc
            i5.k r11 = r8.f12444u0
            java.util.Objects.requireNonNull(r11)
            i5.k r11 = r8.f12444u0
            i5.f r2 = r11.f12431a0
            java.util.Objects.requireNonNull(r2)
            long r4 = r11.f12432b0
            long r9 = r9 - r4
            java.util.List r9 = r2.mo7539h(r9)
            android.os.Handler r10 = r8.f12433j0
            if (r10 == 0) goto Lc7
            android.os.Message r9 = r10.obtainMessage(r1, r9)
            r9.sendToTarget()
            goto Lcc
        Lc7:
            i5.l r10 = r8.f12434k0
            r10.mo5292d(r9)
        Lcc:
            int r9 = r8.f12440q0
            if (r9 != r0) goto Ld1
            return
        Ld1:
            boolean r9 = r8.f12437n0     // Catch: p143i5.C3084h -> L142
            if (r9 != 0) goto L146
            i5.j r9 = r8.f12443t0     // Catch: p143i5.C3084h -> L142
            if (r9 != 0) goto Le9
            i5.g r9 = r8.f12442s0     // Catch: p143i5.C3084h -> L142
            java.util.Objects.requireNonNull(r9)     // Catch: p143i5.C3084h -> L142
            java.lang.Object r9 = r9.mo7521d()     // Catch: p143i5.C3084h -> L142
            i5.j r9 = (p143i5.C3086j) r9     // Catch: p143i5.C3084h -> L142
            if (r9 != 0) goto Le7
            return
        Le7:
            r8.f12443t0 = r9     // Catch: p143i5.C3084h -> L142
        Le9:
            int r10 = r8.f12440q0     // Catch: p143i5.C3084h -> L142
            if (r10 != r12) goto Lfd
            r10 = 4
            r9.f12333Y = r10     // Catch: p143i5.C3084h -> L142
            i5.g r10 = r8.f12442s0     // Catch: p143i5.C3084h -> L142
            java.util.Objects.requireNonNull(r10)     // Catch: p143i5.C3084h -> L142
            r10.mo7519b(r9)     // Catch: p143i5.C3084h -> L142
            r8.f12443t0 = r3     // Catch: p143i5.C3084h -> L142
            r8.f12440q0 = r0     // Catch: p143i5.C3084h -> L142
            return
        Lfd:
            androidx.appcompat.widget.x r10 = r8.f12436m0     // Catch: p143i5.C3084h -> L142
            int r10 = r8.m5251K(r10, r9, r1)     // Catch: p143i5.C3084h -> L142
            r11 = -4
            if (r10 != r11) goto L13e
            boolean r10 = r9.m7517r()     // Catch: p143i5.C3084h -> L142
            if (r10 == 0) goto L111
            r8.f12437n0 = r12     // Catch: p143i5.C3084h -> L142
            r8.f12439p0 = r1     // Catch: p143i5.C3084h -> L142
            goto L12f
        L111:
            androidx.appcompat.widget.x r10 = r8.f12436m0     // Catch: p143i5.C3084h -> L142
            java.lang.Object r10 = r10.f1482a0     // Catch: p143i5.C3084h -> L142
            f4.e0 r10 = (p088f4.C2003e0) r10     // Catch: p143i5.C3084h -> L142
            if (r10 != 0) goto L11a
            return
        L11a:
            long r10 = r10.f8900n0     // Catch: p143i5.C3084h -> L142
            r9.f12430g0 = r10     // Catch: p143i5.C3084h -> L142
            r9.m7525w()     // Catch: p143i5.C3084h -> L142
            boolean r10 = r8.f12439p0     // Catch: p143i5.C3084h -> L142
            boolean r11 = r9.m7518s()     // Catch: p143i5.C3084h -> L142
            if (r11 != 0) goto L12b
            r11 = 1
            goto L12c
        L12b:
            r11 = 0
        L12c:
            r10 = r10 & r11
            r8.f12439p0 = r10     // Catch: p143i5.C3084h -> L142
        L12f:
            boolean r10 = r8.f12439p0     // Catch: p143i5.C3084h -> L142
            if (r10 != 0) goto Ld1
            i5.g r10 = r8.f12442s0     // Catch: p143i5.C3084h -> L142
            java.util.Objects.requireNonNull(r10)     // Catch: p143i5.C3084h -> L142
            r10.mo7519b(r9)     // Catch: p143i5.C3084h -> L142
            r8.f12443t0 = r3     // Catch: p143i5.C3084h -> L142
            goto Ld1
        L13e:
            r9 = -3
            if (r10 != r9) goto Ld1
            return
        L142:
            r9 = move-exception
            r8.m7546N(r9)
        L146:
            return
    }
}
