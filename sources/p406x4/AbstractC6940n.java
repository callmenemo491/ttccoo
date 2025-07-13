package p406x4;

/* renamed from: x4.n */
/* loaded from: classes.dex */
public abstract class AbstractC6940n extends p088f4.AbstractC2008g {

    /* renamed from: B1 */
    public static final byte[] f27026B1 = null;

    /* renamed from: A0 */
    public p162j4.InterfaceC3400e f27027A0;

    /* renamed from: A1 */
    public int f27028A1;

    /* renamed from: B0 */
    public android.media.MediaCrypto f27029B0;

    /* renamed from: C0 */
    public boolean f27030C0;

    /* renamed from: D0 */
    public long f27031D0;

    /* renamed from: E0 */
    public float f27032E0;

    /* renamed from: F0 */
    public float f27033F0;

    /* renamed from: G0 */
    public p406x4.InterfaceC6937k f27034G0;

    /* renamed from: H0 */
    public p088f4.C2003e0 f27035H0;

    /* renamed from: I0 */
    public android.media.MediaFormat f27036I0;

    /* renamed from: J0 */
    public boolean f27037J0;

    /* renamed from: K0 */
    public float f27038K0;

    /* renamed from: L0 */
    public java.util.ArrayDeque<p406x4.C6939m> f27039L0;

    /* renamed from: M0 */
    public p406x4.AbstractC6940n.a f27040M0;

    /* renamed from: N0 */
    public p406x4.C6939m f27041N0;

    /* renamed from: O0 */
    public int f27042O0;

    /* renamed from: P0 */
    public boolean f27043P0;

    /* renamed from: Q0 */
    public boolean f27044Q0;

    /* renamed from: R0 */
    public boolean f27045R0;

    /* renamed from: S0 */
    public boolean f27046S0;

    /* renamed from: T0 */
    public boolean f27047T0;

    /* renamed from: U0 */
    public boolean f27048U0;

    /* renamed from: V0 */
    public boolean f27049V0;

    /* renamed from: W0 */
    public boolean f27050W0;

    /* renamed from: X0 */
    public boolean f27051X0;

    /* renamed from: Y0 */
    public boolean f27052Y0;

    /* renamed from: Z0 */
    public p406x4.C6934h f27053Z0;

    /* renamed from: a1 */
    public long f27054a1;

    /* renamed from: b1 */
    public int f27055b1;

    /* renamed from: c1 */
    public int f27056c1;

    /* renamed from: d1 */
    public java.nio.ByteBuffer f27057d1;

    /* renamed from: e1 */
    public boolean f27058e1;

    /* renamed from: f1 */
    public boolean f27059f1;

    /* renamed from: g1 */
    public boolean f27060g1;

    /* renamed from: h1 */
    public boolean f27061h1;

    /* renamed from: i1 */
    public boolean f27062i1;

    /* renamed from: j0 */
    public final p406x4.InterfaceC6937k.b f27063j0;

    /* renamed from: j1 */
    public boolean f27064j1;

    /* renamed from: k0 */
    public final p406x4.InterfaceC6942p f27065k0;

    /* renamed from: k1 */
    public int f27066k1;

    /* renamed from: l0 */
    public final boolean f27067l0;

    /* renamed from: l1 */
    public int f27068l1;

    /* renamed from: m0 */
    public final float f27069m0;

    /* renamed from: m1 */
    public int f27070m1;

    /* renamed from: n0 */
    public final p142i4.C3073g f27071n0;

    /* renamed from: n1 */
    public boolean f27072n1;

    /* renamed from: o0 */
    public final p142i4.C3073g f27073o0;

    /* renamed from: o1 */
    public boolean f27074o1;

    /* renamed from: p0 */
    public final p142i4.C3073g f27075p0;

    /* renamed from: p1 */
    public boolean f27076p1;

    /* renamed from: q0 */
    public final p406x4.C6933g f27077q0;

    /* renamed from: q1 */
    public long f27078q1;

    /* renamed from: r0 */
    public final p371v5.C6575y<p088f4.C2003e0> f27079r0;

    /* renamed from: r1 */
    public long f27080r1;

    /* renamed from: s0 */
    public final java.util.ArrayList<java.lang.Long> f27081s0;

    /* renamed from: s1 */
    public boolean f27082s1;

    /* renamed from: t0 */
    public final android.media.MediaCodec.BufferInfo f27083t0;

    /* renamed from: t1 */
    public boolean f27084t1;

    /* renamed from: u0 */
    public final long[] f27085u0;

    /* renamed from: u1 */
    public boolean f27086u1;

    /* renamed from: v0 */
    public final long[] f27087v0;

    /* renamed from: v1 */
    public boolean f27088v1;

    /* renamed from: w0 */
    public final long[] f27089w0;

    /* renamed from: w1 */
    public p088f4.C2038q f27090w1;

    /* renamed from: x0 */
    public p088f4.C2003e0 f27091x0;

    /* renamed from: x1 */
    public p142i4.C3071e f27092x1;

    /* renamed from: y0 */
    public p088f4.C2003e0 f27093y0;

    /* renamed from: y1 */
    public long f27094y1;

    /* renamed from: z0 */
    public p162j4.InterfaceC3400e f27095z0;

    /* renamed from: z1 */
    public long f27096z1;

    /* renamed from: x4.n$a */
    public static class a extends java.lang.Exception {

        /* renamed from: Y */
        public final java.lang.String f27097Y;

        /* renamed from: Z */
        public final boolean f27098Z;

        /* renamed from: a0 */
        public final p406x4.C6939m f27099a0;

        /* renamed from: b0 */
        public final java.lang.String f27100b0;

        public a(p088f4.C2003e0 r12, java.lang.Throwable r13, boolean r14, int r15) {
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f8896j0
                if (r15 >= 0) goto L2a
                java.lang.String r12 = "neg_"
                goto L2c
            L2a:
                java.lang.String r12 = ""
            L2c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
        }

        public a(java.lang.String r1, java.lang.Throwable r2, java.lang.String r3, boolean r4, p406x4.C6939m r5, java.lang.String r6, p406x4.AbstractC6940n.a r7) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f27097Y = r3
                r0.f27098Z = r4
                r0.f27099a0 = r5
                r0.f27100b0 = r6
                return
        }
    }

    static {
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120} // fill-array
            p406x4.AbstractC6940n.f27026B1 = r0
            return
    }

    public AbstractC6940n(int r2, p406x4.InterfaceC6937k.b r3, p406x4.InterfaceC6942p r4, boolean r5, float r6) {
            r1 = this;
            r1.<init>(r2)
            r1.f27063j0 = r3
            java.util.Objects.requireNonNull(r4)
            r1.f27065k0 = r4
            r1.f27067l0 = r5
            r1.f27069m0 = r6
            i4.g r2 = new i4.g
            r3 = 0
            r2.<init>(r3)
            r1.f27071n0 = r2
            i4.g r2 = new i4.g
            r2.<init>(r3)
            r1.f27073o0 = r2
            i4.g r2 = new i4.g
            r4 = 2
            r2.<init>(r4)
            r1.f27075p0 = r2
            x4.g r2 = new x4.g
            r2.<init>()
            r1.f27077q0 = r2
            v5.y r4 = new v5.y
            r4.<init>()
            r1.f27079r0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f27081s0 = r4
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            r1.f27083t0 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f27032E0 = r4
            r1.f27033F0 = r4
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f27031D0 = r4
            r6 = 10
            long[] r0 = new long[r6]
            r1.f27085u0 = r0
            long[] r0 = new long[r6]
            r1.f27087v0 = r0
            long[] r6 = new long[r6]
            r1.f27089w0 = r6
            r1.f27094y1 = r4
            r1.f27096z1 = r4
            r2.m7524v(r3)
            java.nio.ByteBuffer r2 = r2.f12358a0
            java.nio.ByteOrder r6 = java.nio.ByteOrder.nativeOrder()
            r2.order(r6)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f27038K0 = r2
            r1.f27042O0 = r3
            r1.f27066k1 = r3
            r2 = -1
            r1.f27055b1 = r2
            r1.f27056c1 = r2
            r1.f27054a1 = r4
            r1.f27078q1 = r4
            r1.f27080r1 = r4
            r1.f27068l1 = r3
            r1.f27070m1 = r3
            return
    }

    /* renamed from: A0 */
    public abstract int mo6334A0(p406x4.InterfaceC6942p r1, p088f4.C2003e0 r2);

    /* renamed from: B0 */
    public final boolean m14071B0(p088f4.C2003e0 r5) {
            r4 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 1
            r2 = 23
            if (r0 >= r2) goto L8
            return r1
        L8:
            x4.k r0 = r4.f27034G0
            if (r0 == 0) goto L50
            int r0 = r4.f27070m1
            r2 = 3
            if (r0 == r2) goto L50
            int r0 = r4.f8951c0
            if (r0 != 0) goto L16
            goto L50
        L16:
            float r0 = r4.f27033F0
            f4.e0[] r2 = r4.f8953e0
            java.util.Objects.requireNonNull(r2)
            float r5 = r4.mo6338X(r0, r5, r2)
            float r0 = r4.f27038K0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L28
            return r1
        L28:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 != 0) goto L33
            r4.m14076P()
            r5 = 0
            return r5
        L33:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            float r0 = r4.f27069m0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3e
            goto L3f
        L3e:
            return r1
        L3f:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "operating-rate"
            r0.putFloat(r2, r5)
            x4.k r2 = r4.f27034G0
            r2.mo14039i(r0)
            r4.f27038K0 = r5
        L50:
            return r1
    }

    /* renamed from: C0 */
    public final void m14072C0() {
            r4 = this;
            r0 = 0
            android.media.MediaCrypto r1 = r4.f27029B0     // Catch: android.media.MediaCryptoException -> L18
            j4.e r2 = r4.f27027A0     // Catch: android.media.MediaCryptoException -> L18
            j4.r r2 = r4.m14083Z(r2)     // Catch: android.media.MediaCryptoException -> L18
            byte[] r2 = r2.f14757b     // Catch: android.media.MediaCryptoException -> L18
            r1.setMediaDrmSession(r2)     // Catch: android.media.MediaCryptoException -> L18
            j4.e r1 = r4.f27027A0
            r4.m14092v0(r1)
            r4.f27068l1 = r0
            r4.f27070m1 = r0
            return
        L18:
            r1 = move-exception
            f4.e0 r2 = r4.f27091x0
            r3 = 6006(0x1776, float:8.416E-42)
            f4.q r0 = r4.m5242B(r1, r2, r0, r3)
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r2 = this;
            r0 = 0
            r2.f27091x0 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f27094y1 = r0
            r2.f27096z1 = r0
            r0 = 0
            r2.f27028A1 = r0
            r2.m14081U()
            return
    }

    /* renamed from: D0 */
    public final void m14073D0(long r2) {
            r1 = this;
            v5.y<f4.e0> r0 = r1.f27079r0
            java.lang.Object r2 = r0.m13439k(r2)
            f4.e0 r2 = (p088f4.C2003e0) r2
            if (r2 != 0) goto L23
            boolean r3 = r1.f27037J0
            if (r3 == 0) goto L23
            v5.y<f4.e0> r2 = r1.f27079r0
            monitor-enter(r2)
            int r3 = r2.f25725e     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L17
            r3 = 0
            goto L1b
        L17:
            java.lang.Object r3 = r2.m13440l()     // Catch: java.lang.Throwable -> L20
        L1b:
            monitor-exit(r2)
            r2 = r3
            f4.e0 r2 = (p088f4.C2003e0) r2
            goto L23
        L20:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L23:
            r3 = 0
            if (r2 == 0) goto L2a
            r1.f27093y0 = r2
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            if (r2 != 0) goto L35
            boolean r2 = r1.f27037J0
            if (r2 == 0) goto L3e
            f4.e0 r2 = r1.f27093y0
            if (r2 == 0) goto L3e
        L35:
            f4.e0 r2 = r1.f27093y0
            android.media.MediaFormat r0 = r1.f27036I0
            r1.mo6345j0(r2, r0)
            r1.f27037J0 = r3
        L3e:
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r4, boolean r6) {
            r3 = this;
            r4 = 0
            r3.f27082s1 = r4
            r3.f27084t1 = r4
            r3.f27088v1 = r4
            boolean r5 = r3.f27060g1
            if (r5 == 0) goto L18
            x4.g r5 = r3.f27077q0
            r5.mo7522t()
            i4.g r5 = r3.f27075p0
            r5.mo7522t()
            r3.f27061h1 = r4
            goto L21
        L18:
            boolean r5 = r3.m14081U()
            if (r5 == 0) goto L21
            r3.m14085d0()
        L21:
            v5.y<f4.e0> r5 = r3.f27079r0
            monitor-enter(r5)
            int r6 = r5.f25725e     // Catch: java.lang.Throwable -> L47
            monitor-exit(r5)
            r5 = 1
            if (r6 <= 0) goto L2c
            r3.f27086u1 = r5
        L2c:
            v5.y<f4.e0> r6 = r3.f27079r0
            r6.m13430b()
            int r6 = r3.f27028A1
            if (r6 == 0) goto L46
            long[] r0 = r3.f27087v0
            int r1 = r6 + (-1)
            r1 = r0[r1]
            r3.f27096z1 = r1
            long[] r0 = r3.f27085u0
            int r6 = r6 - r5
            r5 = r0[r6]
            r3.f27094y1 = r5
            r3.f27028A1 = r4
        L46:
            return
        L47:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: J */
    public void mo5250J(p088f4.C2003e0[] r6, long r7, long r9) {
            r5 = this;
            long r0 = r5.f27096z1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            long r0 = r5.f27094y1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            goto L14
        L13:
            r6 = 0
        L14:
            p371v5.C6549a.m13291e(r6)
            r5.f27094y1 = r7
            r5.f27096z1 = r9
            goto L57
        L1c:
            int r0 = r5.f27028A1
            long[] r1 = r5.f27087v0
            int r2 = r1.length
            if (r0 != r2) goto L3f
            int r0 = r0 - r6
            r0 = r1[r0]
            r2 = 65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Too many stream changes, so dropping offset: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "MediaCodecRenderer"
            android.util.Log.w(r1, r0)
            goto L42
        L3f:
            int r0 = r0 + r6
            r5.f27028A1 = r0
        L42:
            long[] r0 = r5.f27085u0
            int r1 = r5.f27028A1
            int r2 = r1 + (-1)
            r0[r2] = r7
            long[] r7 = r5.f27087v0
            int r8 = r1 + (-1)
            r7[r8] = r9
            long[] r7 = r5.f27089w0
            int r1 = r1 - r6
            long r8 = r5.f27078q1
            r7[r1] = r8
        L57:
            return
    }

    /* renamed from: L */
    public final boolean m14074L(long r19, long r21) {
            r18 = this;
            r15 = r18
            boolean r0 = r15.f27084t1
            r14 = 1
            r0 = r0 ^ r14
            p371v5.C6549a.m13291e(r0)
            x4.g r0 = r15.f27077q0
            boolean r0 = r0.m14058z()
            r13 = 0
            if (r0 == 0) goto L4b
            r5 = 0
            x4.g r0 = r15.f27077q0
            java.nio.ByteBuffer r6 = r0.f12358a0
            int r7 = r15.f27056c1
            r8 = 0
            int r9 = r0.f27004h0
            long r10 = r0.f12360c0
            boolean r12 = r0.m7516q()
            x4.g r0 = r15.f27077q0
            boolean r16 = r0.m7517r()
            f4.e0 r3 = r15.f27093y0
            r0 = r18
            r1 = r19
            r17 = r3
            r3 = r21
            r13 = r16
            r14 = r17
            boolean r0 = r0.mo6348o0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L49
            x4.g r0 = r15.f27077q0
            long r0 = r0.f27003g0
            r15.mo13869k0(r0)
            x4.g r0 = r15.f27077q0
            r0.mo7522t()
            goto L4b
        L49:
            r0 = 0
            return r0
        L4b:
            r0 = 0
            boolean r1 = r15.f27082s1
            if (r1 == 0) goto L54
            r1 = 1
            r15.f27084t1 = r1
            return r0
        L54:
            r1 = 1
            boolean r2 = r15.f27061h1
            if (r2 == 0) goto L66
            x4.g r2 = r15.f27077q0
            i4.g r3 = r15.f27075p0
            boolean r2 = r2.m14057y(r3)
            p371v5.C6549a.m13291e(r2)
            r15.f27061h1 = r0
        L66:
            boolean r2 = r15.f27062i1
            if (r2 == 0) goto L80
            x4.g r2 = r15.f27077q0
            boolean r2 = r2.m14058z()
            if (r2 == 0) goto L73
            return r1
        L73:
            r18.m14075O()
            r15.f27062i1 = r0
            r18.m14085d0()
            boolean r2 = r15.f27060g1
            if (r2 != 0) goto L80
            return r0
        L80:
            boolean r2 = r15.f27082s1
            r2 = r2 ^ r1
            p371v5.C6549a.m13291e(r2)
            androidx.appcompat.widget.x r2 = r18.m5243C()
            i4.g r3 = r15.f27075p0
            r3.mo7522t()
        L8f:
            i4.g r3 = r15.f27075p0
            r3.mo7522t()
            i4.g r3 = r15.f27075p0
            int r3 = r15.m5251K(r2, r3, r0)
            r4 = -5
            if (r3 == r4) goto Ld8
            r4 = -4
            if (r3 == r4) goto Laa
            r2 = -3
            if (r3 != r2) goto La4
            goto Ldb
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Laa:
            i4.g r3 = r15.f27075p0
            boolean r3 = r3.m7517r()
            if (r3 == 0) goto Lb5
            r15.f27082s1 = r1
            goto Ldb
        Lb5:
            boolean r3 = r15.f27086u1
            if (r3 == 0) goto Lc6
            f4.e0 r3 = r15.f27091x0
            java.util.Objects.requireNonNull(r3)
            r15.f27093y0 = r3
            r4 = 0
            r15.mo6345j0(r3, r4)
            r15.f27086u1 = r0
        Lc6:
            i4.g r3 = r15.f27075p0
            r3.m7525w()
            x4.g r3 = r15.f27077q0
            i4.g r4 = r15.f27075p0
            boolean r3 = r3.m14057y(r4)
            if (r3 != 0) goto L8f
            r15.f27061h1 = r1
            goto Ldb
        Ld8:
            r15.mo6344i0(r2)
        Ldb:
            x4.g r2 = r15.f27077q0
            boolean r2 = r2.m14058z()
            if (r2 == 0) goto Le8
            x4.g r2 = r15.f27077q0
            r2.m7525w()
        Le8:
            x4.g r2 = r15.f27077q0
            boolean r2 = r2.m14058z()
            if (r2 != 0) goto Lfb
            boolean r2 = r15.f27082s1
            if (r2 != 0) goto Lfb
            boolean r2 = r15.f27062i1
            if (r2 == 0) goto Lf9
            goto Lfb
        Lf9:
            r14 = 0
            goto Lfc
        Lfb:
            r14 = 1
        Lfc:
            return r14
    }

    /* renamed from: M */
    public abstract p142i4.C3075i mo6337M(p406x4.C6939m r1, p088f4.C2003e0 r2, p088f4.C2003e0 r3);

    /* renamed from: N */
    public p406x4.C6938l mo13855N(java.lang.Throwable r2, p406x4.C6939m r3) {
            r1 = this;
            x4.l r0 = new x4.l
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: O */
    public final void m14075O() {
            r2 = this;
            r0 = 0
            r2.f27062i1 = r0
            x4.g r1 = r2.f27077q0
            r1.mo7522t()
            i4.g r1 = r2.f27075p0
            r1.mo7522t()
            r2.f27061h1 = r0
            r2.f27060g1 = r0
            return
    }

    /* renamed from: P */
    public final void m14076P() {
            r1 = this;
            boolean r0 = r1.f27072n1
            if (r0 == 0) goto Lb
            r0 = 1
            r1.f27068l1 = r0
            r0 = 3
            r1.f27070m1 = r0
            goto L11
        Lb:
            r1.m14089q0()
            r1.m14085d0()
        L11:
            return
    }

    @android.annotation.TargetApi(23)
    /* renamed from: Q */
    public final boolean m14077Q() {
            r2 = this;
            boolean r0 = r2.f27072n1
            r1 = 1
            if (r0 == 0) goto L19
            r2.f27068l1 = r1
            boolean r0 = r2.f27044Q0
            if (r0 != 0) goto L14
            boolean r0 = r2.f27046S0
            if (r0 == 0) goto L10
            goto L14
        L10:
            r0 = 2
            r2.f27070m1 = r0
            goto L1c
        L14:
            r0 = 3
            r2.f27070m1 = r0
            r0 = 0
            return r0
        L19:
            r2.m14072C0()
        L1c:
            return r1
    }

    /* renamed from: R */
    public final boolean m14078R(long r20, long r22) {
            r19 = this;
            r15 = r19
            int r0 = r15.f27056c1
            r14 = 1
            r13 = 0
            if (r0 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 != 0) goto L10f
            boolean r0 = r15.f27047T0
            if (r0 == 0) goto L2a
            boolean r0 = r15.f27074o1
            if (r0 == 0) goto L2a
            x4.k r0 = r15.f27034G0     // Catch: java.lang.IllegalStateException -> L1e
            android.media.MediaCodec$BufferInfo r1 = r15.f27083t0     // Catch: java.lang.IllegalStateException -> L1e
            int r0 = r0.mo14031a(r1)     // Catch: java.lang.IllegalStateException -> L1e
            goto L32
        L1e:
            r19.m14087n0()
            boolean r0 = r15.f27084t1
            if (r0 == 0) goto L29
            r19.m14089q0()
        L29:
            return r13
        L2a:
            x4.k r0 = r15.f27034G0
            android.media.MediaCodec$BufferInfo r1 = r15.f27083t0
            int r0 = r0.mo14031a(r1)
        L32:
            if (r0 >= 0) goto L77
            r1 = -2
            if (r0 != r1) goto L66
            r15.f27076p1 = r14
            x4.k r0 = r15.f27034G0
            android.media.MediaFormat r0 = r0.mo14035e()
            int r1 = r15.f27042O0
            if (r1 == 0) goto L58
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L58
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L58
            r15.f27051X0 = r14
            goto L65
        L58:
            boolean r1 = r15.f27049V0
            if (r1 == 0) goto L61
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L61:
            r15.f27036I0 = r0
            r15.f27037J0 = r14
        L65:
            return r14
        L66:
            boolean r0 = r15.f27052Y0
            if (r0 == 0) goto L76
            boolean r0 = r15.f27082s1
            if (r0 != 0) goto L73
            int r0 = r15.f27068l1
            r1 = 2
            if (r0 != r1) goto L76
        L73:
            r19.m14087n0()
        L76:
            return r13
        L77:
            boolean r1 = r15.f27051X0
            if (r1 == 0) goto L83
            r15.f27051X0 = r13
            x4.k r1 = r15.f27034G0
            r1.mo14033c(r0, r13)
            return r14
        L83:
            android.media.MediaCodec$BufferInfo r1 = r15.f27083t0
            int r2 = r1.size
            if (r2 != 0) goto L93
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L93
            r19.m14087n0()
            return r13
        L93:
            r15.f27056c1 = r0
            x4.k r1 = r15.f27034G0
            java.nio.ByteBuffer r0 = r1.mo14041k(r0)
            r15.f27057d1 = r0
            if (r0 == 0) goto Lb2
            android.media.MediaCodec$BufferInfo r1 = r15.f27083t0
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f27057d1
            android.media.MediaCodec$BufferInfo r1 = r15.f27083t0
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        Lb2:
            boolean r0 = r15.f27048U0
            if (r0 == 0) goto Ld3
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Ld3
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto Ld3
            long r1 = r15.f27078q1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld3
            r0.presentationTimeUs = r1
        Ld3:
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r15.f27081s0
            int r2 = r2.size()
            r3 = 0
        Lde:
            if (r3 >= r2) goto Lfa
            java.util.ArrayList<java.lang.Long> r4 = r15.f27081s0
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto Lf7
            java.util.ArrayList<java.lang.Long> r0 = r15.f27081s0
            r0.remove(r3)
            r0 = 1
            goto Lfb
        Lf7:
            int r3 = r3 + 1
            goto Lde
        Lfa:
            r0 = 0
        Lfb:
            r15.f27058e1 = r0
            long r0 = r15.f27080r1
            android.media.MediaCodec$BufferInfo r2 = r15.f27083t0
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L109
            r0 = 1
            goto L10a
        L109:
            r0 = 0
        L10a:
            r15.f27059f1 = r0
            r15.m14073D0(r2)
        L10f:
            boolean r0 = r15.f27047T0
            if (r0 == 0) goto L150
            boolean r0 = r15.f27074o1
            if (r0 == 0) goto L150
            x4.k r5 = r15.f27034G0     // Catch: java.lang.IllegalStateException -> L143
            java.nio.ByteBuffer r6 = r15.f27057d1     // Catch: java.lang.IllegalStateException -> L143
            int r7 = r15.f27056c1     // Catch: java.lang.IllegalStateException -> L143
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0     // Catch: java.lang.IllegalStateException -> L143
            int r8 = r0.flags     // Catch: java.lang.IllegalStateException -> L143
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L143
            boolean r12 = r15.f27058e1     // Catch: java.lang.IllegalStateException -> L143
            boolean r3 = r15.f27059f1     // Catch: java.lang.IllegalStateException -> L143
            f4.e0 r4 = r15.f27093y0     // Catch: java.lang.IllegalStateException -> L143
            r0 = r19
            r1 = r20
            r16 = r3
            r17 = r4
            r3 = r22
            r18 = 0
            r13 = r16
            r16 = 1
            r14 = r17
            boolean r0 = r0.mo6348o0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch: java.lang.IllegalStateException -> L141
            goto L171
        L141:
            goto L145
        L143:
            r18 = 0
        L145:
            r19.m14087n0()
            boolean r0 = r15.f27084t1
            if (r0 == 0) goto L14f
            r19.m14089q0()
        L14f:
            return r18
        L150:
            r16 = 1
            r18 = 0
            x4.k r5 = r15.f27034G0
            java.nio.ByteBuffer r6 = r15.f27057d1
            int r7 = r15.f27056c1
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f27058e1
            boolean r13 = r15.f27059f1
            f4.e0 r14 = r15.f27093y0
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo6348o0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L171:
            if (r0 == 0) goto L191
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0
            long r0 = r0.presentationTimeUs
            r15.mo13869k0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f27083t0
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L184
            r14 = 1
            goto L185
        L184:
            r14 = 0
        L185:
            r0 = -1
            r15.f27056c1 = r0
            r0 = 0
            r15.f27057d1 = r0
            if (r14 != 0) goto L18e
            return r16
        L18e:
            r19.m14087n0()
        L191:
            return r18
    }

    /* renamed from: S */
    public final boolean m14079S() {
            r15 = this;
            x4.k r0 = r15.f27034G0
            r1 = 0
            if (r0 == 0) goto L28d
            int r2 = r15.f27068l1
            r3 = 2
            if (r2 == r3) goto L28d
            boolean r2 = r15.f27082s1
            if (r2 == 0) goto L10
            goto L28d
        L10:
            int r2 = r15.f27055b1
            if (r2 >= 0) goto L2c
            int r0 = r0.mo14044n()
            r15.f27055b1 = r0
            if (r0 >= 0) goto L1d
            return r1
        L1d:
            i4.g r2 = r15.f27073o0
            x4.k r4 = r15.f27034G0
            java.nio.ByteBuffer r0 = r4.mo14036f(r0)
            r2.f12358a0 = r0
            i4.g r0 = r15.f27073o0
            r0.mo7522t()
        L2c:
            int r0 = r15.f27068l1
            r2 = 1
            if (r0 != r2) goto L4a
            boolean r0 = r15.f27052Y0
            if (r0 == 0) goto L36
            goto L47
        L36:
            r15.f27074o1 = r2
            x4.k r4 = r15.f27034G0
            int r5 = r15.f27055b1
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.mo14038h(r5, r6, r7, r8, r10)
            r15.m14091u0()
        L47:
            r15.f27068l1 = r3
            return r1
        L4a:
            boolean r0 = r15.f27050W0
            if (r0 == 0) goto L6b
            r15.f27050W0 = r1
            i4.g r0 = r15.f27073o0
            java.nio.ByteBuffer r0 = r0.f12358a0
            byte[] r1 = p406x4.AbstractC6940n.f27026B1
            r0.put(r1)
            x4.k r3 = r15.f27034G0
            int r4 = r15.f27055b1
            r5 = 0
            int r6 = r1.length
            r7 = 0
            r9 = 0
            r3.mo14038h(r4, r5, r6, r7, r9)
            r15.m14091u0()
            r15.f27072n1 = r2
            return r2
        L6b:
            int r0 = r15.f27066k1
            if (r0 != r2) goto L90
            r0 = 0
        L70:
            f4.e0 r4 = r15.f27035H0
            java.util.List<byte[]> r4 = r4.f8898l0
            int r4 = r4.size()
            if (r0 >= r4) goto L8e
            f4.e0 r4 = r15.f27035H0
            java.util.List<byte[]> r4 = r4.f8898l0
            java.lang.Object r4 = r4.get(r0)
            byte[] r4 = (byte[]) r4
            i4.g r5 = r15.f27073o0
            java.nio.ByteBuffer r5 = r5.f12358a0
            r5.put(r4)
            int r0 = r0 + 1
            goto L70
        L8e:
            r15.f27066k1 = r3
        L90:
            i4.g r0 = r15.f27073o0
            java.nio.ByteBuffer r0 = r0.f12358a0
            int r0 = r0.position()
            androidx.appcompat.widget.x r4 = r15.m5243C()
            i4.g r5 = r15.f27073o0     // Catch: p142i4.C3073g.a -> L282
            int r5 = r15.m5251K(r4, r5, r1)     // Catch: p142i4.C3073g.a -> L282
            boolean r6 = r15.mo5201j()
            if (r6 == 0) goto Lac
            long r6 = r15.f27078q1
            r15.f27080r1 = r6
        Lac:
            r6 = -3
            if (r5 != r6) goto Lb0
            return r1
        Lb0:
            r6 = -5
            if (r5 != r6) goto Lc2
            int r0 = r15.f27066k1
            if (r0 != r3) goto Lbe
            i4.g r0 = r15.f27073o0
            r0.mo7522t()
            r15.f27066k1 = r2
        Lbe:
            r15.mo6344i0(r4)
            return r2
        Lc2:
            i4.g r4 = r15.f27073o0
            boolean r4 = r4.m7517r()
            if (r4 == 0) goto L106
            int r0 = r15.f27066k1
            if (r0 != r3) goto Ld5
            i4.g r0 = r15.f27073o0
            r0.mo7522t()
            r15.f27066k1 = r2
        Ld5:
            r15.f27082s1 = r2
            boolean r0 = r15.f27072n1
            if (r0 != 0) goto Ldf
            r15.m14087n0()
            return r1
        Ldf:
            boolean r0 = r15.f27052Y0     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            if (r0 == 0) goto Le4
            goto Lf5
        Le4:
            r15.f27074o1 = r2     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            x4.k r3 = r15.f27034G0     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            int r4 = r15.f27055b1     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 4
            r3.mo14038h(r4, r5, r6, r7, r9)     // Catch: android.media.MediaCodec.CryptoException -> Lf6
            r15.m14091u0()     // Catch: android.media.MediaCodec.CryptoException -> Lf6
        Lf5:
            return r1
        Lf6:
            r0 = move-exception
            f4.e0 r2 = r15.f27091x0
            int r3 = r0.getErrorCode()
            int r3 = p371v5.C6552b0.m13323p(r3)
            f4.q r0 = r15.m5242B(r0, r2, r1, r3)
            throw r0
        L106:
            boolean r4 = r15.f27072n1
            if (r4 != 0) goto L11e
            i4.g r4 = r15.f27073o0
            boolean r4 = r4.m7518s()
            if (r4 != 0) goto L11e
            i4.g r0 = r15.f27073o0
            r0.mo7522t()
            int r0 = r15.f27066k1
            if (r0 != r3) goto L11d
            r15.f27066k1 = r2
        L11d:
            return r2
        L11e:
            i4.g r3 = r15.f27073o0
            boolean r3 = r3.m7526x()
            if (r3 == 0) goto L143
            i4.g r4 = r15.f27073o0
            i4.c r4 = r4.f12357Z
            java.util.Objects.requireNonNull(r4)
            if (r0 != 0) goto L130
            goto L143
        L130:
            int[] r5 = r4.f12337d
            if (r5 != 0) goto L13c
            int[] r5 = new int[r2]
            r4.f12337d = r5
            android.media.MediaCodec$CryptoInfo r6 = r4.f12342i
            r6.numBytesOfClearData = r5
        L13c:
            int[] r4 = r4.f12337d
            r5 = r4[r1]
            int r5 = r5 + r0
            r4[r1] = r5
        L143:
            boolean r0 = r15.f27043P0
            if (r0 == 0) goto L198
            if (r3 != 0) goto L198
            i4.g r0 = r15.f27073o0
            java.nio.ByteBuffer r0 = r0.f12358a0
            byte[] r4 = p371v5.C6568r.f25674a
            int r4 = r0.position()
            r5 = 0
            r6 = 0
        L155:
            int r7 = r5 + 1
            if (r7 >= r4) goto L188
            byte r8 = r0.get(r5)
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 3
            if (r6 != r9) goto L17f
            if (r8 != r2) goto L183
            byte r10 = r0.get(r7)
            r10 = r10 & 31
            r11 = 7
            if (r10 != r11) goto L183
            java.nio.ByteBuffer r6 = r0.duplicate()
            int r5 = r5 - r9
            r6.position(r5)
            r6.limit(r4)
            r0.position(r1)
            r0.put(r6)
            goto L18b
        L17f:
            if (r8 != 0) goto L183
            int r6 = r6 + 1
        L183:
            if (r8 == 0) goto L186
            r6 = 0
        L186:
            r5 = r7
            goto L155
        L188:
            r0.clear()
        L18b:
            i4.g r0 = r15.f27073o0
            java.nio.ByteBuffer r0 = r0.f12358a0
            int r0 = r0.position()
            if (r0 != 0) goto L196
            return r2
        L196:
            r15.f27043P0 = r1
        L198:
            i4.g r0 = r15.f27073o0
            long r4 = r0.f12360c0
            x4.h r6 = r15.f27053Z0
            if (r6 == 0) goto L204
            f4.e0 r7 = r15.f27091x0
            long r8 = r6.f27007b
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L1ac
            r6.f27006a = r4
        L1ac:
            boolean r8 = r6.f27008c
            if (r8 == 0) goto L1b1
            goto L1ee
        L1b1:
            java.nio.ByteBuffer r4 = r0.f12358a0
            java.util.Objects.requireNonNull(r4)
            r5 = 0
            r8 = 0
        L1b8:
            r9 = 4
            if (r5 >= r9) goto L1c7
            int r8 = r8 << 8
            byte r9 = r4.get(r5)
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r5 = r5 + 1
            goto L1b8
        L1c7:
            int r4 = p121h4.C2485z.m6356d(r8)
            r5 = -1
            if (r4 != r5) goto L1e0
            r6.f27008c = r2
            r6.f27007b = r10
            long r4 = r0.f12360c0
            r6.f27006a = r4
            java.lang.String r4 = "C2Mp3TimestampTracker"
            java.lang.String r5 = "MPEG audio header is invalid."
            android.util.Log.w(r4, r5)
            long r4 = r0.f12360c0
            goto L1ee
        L1e0:
            int r0 = r7.f8910x0
            long r7 = (long) r0
            long r7 = r6.m14059a(r7)
            long r9 = r6.f27007b
            long r4 = (long) r4
            long r9 = r9 + r4
            r6.f27007b = r9
            r4 = r7
        L1ee:
            long r6 = r15.f27078q1
            x4.h r0 = r15.f27053Z0
            f4.e0 r8 = r15.f27091x0
            java.util.Objects.requireNonNull(r0)
            int r8 = r8.f8910x0
            long r8 = (long) r8
            long r8 = r0.m14059a(r8)
            long r6 = java.lang.Math.max(r6, r8)
            r15.f27078q1 = r6
        L204:
            r12 = r4
            i4.g r0 = r15.f27073o0
            boolean r0 = r0.m7516q()
            if (r0 == 0) goto L216
            java.util.ArrayList<java.lang.Long> r0 = r15.f27081s0
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r0.add(r4)
        L216:
            boolean r0 = r15.f27086u1
            if (r0 == 0) goto L223
            v5.y<f4.e0> r0 = r15.f27079r0
            f4.e0 r4 = r15.f27091x0
            r0.m13429a(r12, r4)
            r15.f27086u1 = r1
        L223:
            long r4 = r15.f27078q1
            long r4 = java.lang.Math.max(r4, r12)
            r15.f27078q1 = r4
            i4.g r0 = r15.f27073o0
            r0.m7525w()
            i4.g r0 = r15.f27073o0
            boolean r0 = r0.m7515p()
            if (r0 == 0) goto L23d
            i4.g r0 = r15.f27073o0
            r15.mo13868b0(r0)
        L23d:
            i4.g r0 = r15.f27073o0
            r15.mo6347m0(r0)
            if (r3 == 0) goto L252
            x4.k r8 = r15.f27034G0     // Catch: android.media.MediaCodec.CryptoException -> L272
            int r9 = r15.f27055b1     // Catch: android.media.MediaCodec.CryptoException -> L272
            r10 = 0
            i4.g r0 = r15.f27073o0     // Catch: android.media.MediaCodec.CryptoException -> L272
            i4.c r11 = r0.f12357Z     // Catch: android.media.MediaCodec.CryptoException -> L272
            r14 = 0
            r8.mo14042l(r9, r10, r11, r12, r14)     // Catch: android.media.MediaCodec.CryptoException -> L272
            goto L263
        L252:
            x4.k r8 = r15.f27034G0     // Catch: android.media.MediaCodec.CryptoException -> L272
            int r9 = r15.f27055b1     // Catch: android.media.MediaCodec.CryptoException -> L272
            r10 = 0
            i4.g r0 = r15.f27073o0     // Catch: android.media.MediaCodec.CryptoException -> L272
            java.nio.ByteBuffer r0 = r0.f12358a0     // Catch: android.media.MediaCodec.CryptoException -> L272
            int r11 = r0.limit()     // Catch: android.media.MediaCodec.CryptoException -> L272
            r14 = 0
            r8.mo14038h(r9, r10, r11, r12, r14)     // Catch: android.media.MediaCodec.CryptoException -> L272
        L263:
            r15.m14091u0()
            r15.f27072n1 = r2
            r15.f27066k1 = r1
            i4.e r0 = r15.f27092x1
            int r1 = r0.f12348c
            int r1 = r1 + r2
            r0.f12348c = r1
            return r2
        L272:
            r0 = move-exception
            f4.e0 r2 = r15.f27091x0
            int r3 = r0.getErrorCode()
            int r3 = p371v5.C6552b0.m13323p(r3)
            f4.q r0 = r15.m5242B(r0, r2, r1, r3)
            throw r0
        L282:
            r0 = move-exception
            r15.mo6341f0(r0)
            r15.m14088p0(r1)
            r15.m14080T()
            return r2
        L28d:
            return r1
    }

    /* renamed from: T */
    public final void m14080T() {
            r1 = this;
            x4.k r0 = r1.f27034G0     // Catch: java.lang.Throwable -> L9
            r0.flush()     // Catch: java.lang.Throwable -> L9
            r1.mo13870s0()
            return
        L9:
            r0 = move-exception
            r1.mo13870s0()
            throw r0
    }

    /* renamed from: U */
    public boolean m14081U() {
            r3 = this;
            x4.k r0 = r3.f27034G0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.f27070m1
            r2 = 3
            if (r0 == r2) goto L24
            boolean r0 = r3.f27044Q0
            if (r0 != 0) goto L24
            boolean r0 = r3.f27045R0
            if (r0 == 0) goto L17
            boolean r0 = r3.f27076p1
            if (r0 == 0) goto L24
        L17:
            boolean r0 = r3.f27046S0
            if (r0 == 0) goto L20
            boolean r0 = r3.f27074o1
            if (r0 == 0) goto L20
            goto L24
        L20:
            r3.m14080T()
            return r1
        L24:
            r3.m14089q0()
            r0 = 1
            return r0
    }

    /* renamed from: V */
    public final java.util.List<p406x4.C6939m> m14082V(boolean r6) {
            r5 = this;
            x4.p r0 = r5.f27065k0
            f4.e0 r1 = r5.f27091x0
            java.util.List r0 = r5.mo6339Y(r0, r1, r6)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L48
            if (r6 == 0) goto L48
            x4.p r6 = r5.f27065k0
            f4.e0 r0 = r5.f27091x0
            r1 = 0
            java.util.List r0 = r5.mo6339Y(r6, r0, r1)
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L48
            f4.e0 r6 = r5.f27091x0
            java.lang.String r6 = r6.f8896j0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r2 = 99
            int r2 = p064e.C1489c.m4038a(r6, r2)
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = "Drm session requires secure decoder for "
            java.lang.String r4 = ", but no secure decoder available. Trying to proceed with "
            java.lang.StringBuilder r6 = p064e.C1491e.m4040a(r3, r2, r6, r4, r1)
            java.lang.String r1 = "."
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MediaCodecRenderer"
            android.util.Log.w(r1, r6)
        L48:
            return r0
    }

    /* renamed from: W */
    public boolean mo13865W() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: X */
    public abstract float mo6338X(float r1, p088f4.C2003e0 r2, p088f4.C2003e0[] r3);

    /* renamed from: Y */
    public abstract java.util.List<p406x4.C6939m> mo6339Y(p406x4.InterfaceC6942p r1, p088f4.C2003e0 r2, boolean r3);

    /* renamed from: Z */
    public final p162j4.C3413r m14083Z(p162j4.InterfaceC3400e r4) {
            r3 = this;
            i4.b r4 = r4.mo7795g()
            if (r4 == 0) goto L35
            boolean r0 = r4 instanceof p162j4.C3413r
            if (r0 == 0) goto Lb
            goto L35
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            int r1 = r1 + 43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Expecting FrameworkCryptoConfig but found: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            f4.e0 r4 = r3.f27091x0
            r1 = 6001(0x1771, float:8.409E-42)
            r2 = 0
            f4.q r4 = r3.m5242B(r0, r4, r2, r1)
            throw r4
        L35:
            j4.r r4 = (p162j4.C3413r) r4
            return r4
    }

    /* renamed from: a0 */
    public abstract p406x4.InterfaceC6937k.a mo6340a0(p406x4.C6939m r1, p088f4.C2003e0 r2, android.media.MediaCrypto r3, float r4);

    /* renamed from: b0 */
    public void mo13868b0(p142i4.C3073g r1) {
            r0 = this;
            return
    }

    /* renamed from: c0 */
    public final void m14084c0(p406x4.C6939m r17, android.media.MediaCrypto r18) {
            r16 = this;
            r6 = r16
            r0 = r17
            java.lang.String r1 = r0.f27019a
            int r2 = p371v5.C6552b0.f25624a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 23
            if (r2 >= r4) goto L11
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L1e
        L11:
            float r5 = r6.f27033F0
            f4.e0 r7 = r6.f27091x0
            f4.e0[] r8 = r6.f8953e0
            java.util.Objects.requireNonNull(r8)
            float r5 = r6.mo6338X(r5, r7, r8)
        L1e:
            float r7 = r6.f27069m0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L25
            goto L26
        L25:
            r3 = r5
        L26:
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r5 = "createCodec:"
            java.lang.String r9 = java.lang.String.valueOf(r1)
            int r10 = r9.length()
            if (r10 == 0) goto L3b
            java.lang.String r5 = r5.concat(r9)
            goto L41
        L3b:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r5)
            r5 = r9
        L41:
            p371v5.C6549a.m13287a(r5)
            f4.e0 r5 = r6.f27091x0
            r9 = r18
            x4.k$a r5 = r6.mo6340a0(r0, r5, r9, r3)
            x4.k$b r9 = r6.f27063j0
            x4.k r5 = r9.mo14046a(r5)
            r6.f27034G0 = r5
            long r9 = android.os.SystemClock.elapsedRealtime()
            r6.f27041N0 = r0
            r6.f27038K0 = r3
            f4.e0 r3 = r6.f27091x0
            r6.f27035H0 = r3
            java.lang.String r5 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 1
            if (r2 > r11) goto L91
            boolean r14 = r5.equals(r1)
            if (r14 == 0) goto L91
            java.lang.String r14 = p371v5.C6552b0.f25627d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L8f
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L8f
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L8f
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L91
        L8f:
            r14 = 2
            goto Lca
        L91:
            r14 = 24
            if (r2 >= r14) goto Lc9
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r1)
            if (r14 != 0) goto La5
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto Lc9
        La5:
            java.lang.String r14 = p371v5.C6552b0.f25625b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto Lc7
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto Lc7
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto Lc7
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto Lc9
        Lc7:
            r14 = 1
            goto Lca
        Lc9:
            r14 = 0
        Lca:
            r6.f27042O0 = r14
            f4.e0 r14 = r6.f27035H0
            r15 = 21
            if (r2 >= r15) goto Le4
            java.util.List<byte[]> r14 = r14.f8898l0
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto Le4
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto Le4
            r14 = 1
            goto Le5
        Le4:
            r14 = 0
        Le5:
            r6.f27043P0 = r14
            r14 = 19
            r12 = 18
            if (r2 < r12) goto L11c
            if (r2 != r12) goto Lff
            java.lang.String r3 = "OMX.SEC.avc.dec"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L11c
            java.lang.String r3 = "OMX.SEC.avc.dec.secure"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L11c
        Lff:
            if (r2 != r14) goto L11a
            java.lang.String r3 = p371v5.C6552b0.f25627d
            java.lang.String r11 = "SM-G800"
            boolean r3 = r3.startsWith(r11)
            if (r3 == 0) goto L11a
            java.lang.String r3 = "OMX.Exynos.avc.dec"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L11c
            boolean r3 = r5.equals(r1)
            if (r3 == 0) goto L11a
            goto L11c
        L11a:
            r3 = 0
            goto L11d
        L11c:
            r3 = 1
        L11d:
            r6.f27044Q0 = r3
            r3 = 29
            if (r2 != r3) goto L12d
            java.lang.String r5 = "c2.android.aac.decoder"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L12d
            r5 = 1
            goto L12e
        L12d:
            r5 = 0
        L12e:
            r6.f27045R0 = r5
            if (r2 > r4) goto L13a
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L15e
        L13a:
            if (r2 > r14) goto L160
            java.lang.String r4 = p371v5.C6552b0.f25625b
            java.lang.String r5 = "hb2000"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L14e
            java.lang.String r5 = "stvm8"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L160
        L14e:
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L15e
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L160
        L15e:
            r4 = 1
            goto L161
        L160:
            r4 = 0
        L161:
            r6.f27046S0 = r4
            if (r2 != r15) goto L16f
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L16f
            r4 = 1
            goto L170
        L16f:
            r4 = 0
        L170:
            r6.f27047T0 = r4
            if (r2 >= r15) goto L1ba
            java.lang.String r4 = "OMX.SEC.mp3.dec"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L1ba
            java.lang.String r4 = p371v5.C6552b0.f25626c
            java.lang.String r5 = "samsung"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1ba
            java.lang.String r4 = p371v5.C6552b0.f25625b
            java.lang.String r5 = "baffin"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L1b8
            java.lang.String r5 = "grand"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L1b8
            java.lang.String r5 = "fortuna"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L1b8
            java.lang.String r5 = "gprimelte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L1b8
            java.lang.String r5 = "j2y18lte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L1b8
            java.lang.String r5 = "ms01"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L1ba
        L1b8:
            r4 = 1
            goto L1bb
        L1ba:
            r4 = 0
        L1bb:
            r6.f27048U0 = r4
            f4.e0 r4 = r6.f27035H0
            if (r2 > r12) goto L1cf
            int r4 = r4.f8909w0
            if (r4 != r13) goto L1cf
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L1cf
            r4 = 1
            goto L1d0
        L1cf:
            r4 = 0
        L1d0:
            r6.f27049V0 = r4
            java.lang.String r4 = r0.f27019a
            r5 = 25
            if (r2 > r5) goto L1e0
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L216
        L1e0:
            r5 = 17
            if (r2 > r5) goto L1ec
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L216
        L1ec:
            if (r2 > r3) goto L1fe
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L216
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L216
        L1fe:
            java.lang.String r2 = p371v5.C6552b0.f25626c
            java.lang.String r3 = "Amazon"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L218
            java.lang.String r2 = p371v5.C6552b0.f25627d
            java.lang.String r3 = "AFTS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L218
            boolean r2 = r0.f27024f
            if (r2 == 0) goto L218
        L216:
            r2 = 1
            goto L219
        L218:
            r2 = 0
        L219:
            if (r2 != 0) goto L224
            boolean r2 = r16.mo13865W()
            if (r2 == 0) goto L222
            goto L224
        L222:
            r2 = 0
            goto L225
        L224:
            r2 = 1
        L225:
            r6.f27052Y0 = r2
            x4.k r2 = r6.f27034G0
            boolean r2 = r2.mo14032b()
            if (r2 == 0) goto L23c
            r6.f27064j1 = r13
            r6.f27066k1 = r13
            int r2 = r6.f27042O0
            if (r2 == 0) goto L239
            r12 = 1
            goto L23a
        L239:
            r12 = 0
        L23a:
            r6.f27050W0 = r12
        L23c:
            java.lang.String r0 = r0.f27019a
            java.lang.String r2 = "c2.android.mp3.decoder"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L24d
            x4.h r0 = new x4.h
            r0.<init>()
            r6.f27053Z0 = r0
        L24d:
            int r0 = r6.f8951c0
            r2 = 2
            if (r0 != r2) goto L25b
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 + r4
            r6.f27054a1 = r2
        L25b:
            i4.e r0 = r6.f27092x1
            int r2 = r0.f12346a
            int r2 = r2 + r13
            r0.f12346a = r2
            long r4 = r9 - r7
            r0 = r16
            r2 = r9
            r0.mo6342g0(r1, r2, r4)
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: d */
    public boolean mo5197d() {
            r1 = this;
            boolean r0 = r1.f27084t1
            return r0
    }

    /* renamed from: d0 */
    public final void m14085d0() {
            r7 = this;
            x4.k r0 = r7.f27034G0
            if (r0 != 0) goto Lcd
            boolean r0 = r7.f27060g1
            if (r0 != 0) goto Lcd
            f4.e0 r0 = r7.f27091x0
            if (r0 != 0) goto Le
            goto Lcd
        Le:
            j4.e r1 = r7.f27027A0
            r2 = 1
            if (r1 != 0) goto L52
            boolean r0 = r7.mo6350z0(r0)
            if (r0 == 0) goto L52
            f4.e0 r0 = r7.f27091x0
            r7.m14075O()
            java.lang.String r0 = r0.f8896j0
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L43
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L43
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            x4.g r0 = r7.f27077q0
            java.util.Objects.requireNonNull(r0)
            p371v5.C6549a.m13288b(r2)
            r0.f27005i0 = r2
            goto L4f
        L43:
            x4.g r0 = r7.f27077q0
            r1 = 32
            java.util.Objects.requireNonNull(r0)
            p371v5.C6549a.m13288b(r2)
            r0.f27005i0 = r1
        L4f:
            r7.f27060g1 = r2
            return
        L52:
            j4.e r0 = r7.f27027A0
            r7.m14092v0(r0)
            f4.e0 r0 = r7.f27091x0
            java.lang.String r0 = r0.f8896j0
            j4.e r1 = r7.f27095z0
            r3 = 0
            if (r1 == 0) goto Lbb
            android.media.MediaCrypto r4 = r7.f27029B0
            if (r4 != 0) goto L99
            j4.r r1 = r7.m14083Z(r1)
            if (r1 != 0) goto L74
            j4.e r0 = r7.f27095z0
            j4.e$a r0 = r0.mo7794f()
            if (r0 == 0) goto L73
            goto L99
        L73:
            return
        L74:
            android.media.MediaCrypto r4 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L8f
            java.util.UUID r5 = r1.f14756a     // Catch: android.media.MediaCryptoException -> L8f
            byte[] r6 = r1.f14757b     // Catch: android.media.MediaCryptoException -> L8f
            r4.<init>(r5, r6)     // Catch: android.media.MediaCryptoException -> L8f
            r7.f27029B0 = r4     // Catch: android.media.MediaCryptoException -> L8f
            boolean r1 = r1.f14758c
            if (r1 != 0) goto L8b
            boolean r0 = r4.requiresSecureDecoderComponent(r0)
            if (r0 == 0) goto L8b
            r0 = 1
            goto L8c
        L8b:
            r0 = 0
        L8c:
            r7.f27030C0 = r0
            goto L99
        L8f:
            r0 = move-exception
            f4.e0 r1 = r7.f27091x0
            r2 = 6006(0x1776, float:8.416E-42)
            f4.q r0 = r7.m5242B(r0, r1, r3, r2)
            throw r0
        L99:
            boolean r0 = p162j4.C3413r.f14755d
            if (r0 == 0) goto Lbb
            j4.e r0 = r7.f27095z0
            int r0 = r0.getState()
            if (r0 == r2) goto La9
            r1 = 4
            if (r0 == r1) goto Lbb
            return
        La9:
            j4.e r0 = r7.f27095z0
            j4.e$a r0 = r0.mo7794f()
            java.util.Objects.requireNonNull(r0)
            f4.e0 r1 = r7.f27091x0
            int r2 = r0.f14735Y
            f4.q r0 = r7.m5242B(r0, r1, r3, r2)
            throw r0
        Lbb:
            android.media.MediaCrypto r0 = r7.f27029B0     // Catch: p406x4.AbstractC6940n.a -> Lc3
            boolean r1 = r7.f27030C0     // Catch: p406x4.AbstractC6940n.a -> Lc3
            r7.m14086e0(r0, r1)     // Catch: p406x4.AbstractC6940n.a -> Lc3
            return
        Lc3:
            r0 = move-exception
            f4.e0 r1 = r7.f27091x0
            r2 = 4001(0xfa1, float:5.607E-42)
            f4.q r0 = r7.m5242B(r0, r1, r3, r2)
            throw r0
        Lcd:
            return
    }

    /* renamed from: e0 */
    public final void m14086e0(android.media.MediaCrypto r22, boolean r23) {
            r21 = this;
            r1 = r21
            r10 = r23
            java.util.ArrayDeque<x4.m> r0 = r1.f27039L0
            r11 = 0
            if (r0 != 0) goto L3d
            java.util.List r0 = r1.m14082V(r10)     // Catch: p406x4.C6944r.c -> L31
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: p406x4.C6944r.c -> L31
            r2.<init>()     // Catch: p406x4.C6944r.c -> L31
            r1.f27039L0 = r2     // Catch: p406x4.C6944r.c -> L31
            boolean r3 = r1.f27067l0     // Catch: p406x4.C6944r.c -> L31
            if (r3 == 0) goto L1c
            r2.addAll(r0)     // Catch: p406x4.C6944r.c -> L31
            goto L2e
        L1c:
            boolean r2 = r0.isEmpty()     // Catch: p406x4.C6944r.c -> L31
            if (r2 != 0) goto L2e
            java.util.ArrayDeque<x4.m> r2 = r1.f27039L0     // Catch: p406x4.C6944r.c -> L31
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: p406x4.C6944r.c -> L31
            x4.m r0 = (p406x4.C6939m) r0     // Catch: p406x4.C6944r.c -> L31
            r2.add(r0)     // Catch: p406x4.C6944r.c -> L31
        L2e:
            r1.f27040M0 = r11     // Catch: p406x4.C6944r.c -> L31
            goto L3d
        L31:
            r0 = move-exception
            x4.n$a r2 = new x4.n$a
            f4.e0 r3 = r1.f27091x0
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>(r3, r0, r10, r4)
            throw r2
        L3d:
            java.util.ArrayDeque<x4.m> r0 = r1.f27039L0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10d
        L45:
            x4.k r0 = r1.f27034G0
            if (r0 != 0) goto L10a
            java.util.ArrayDeque<x4.m> r0 = r1.f27039L0
            java.lang.Object r0 = r0.peekFirst()
            r7 = r0
            x4.m r7 = (p406x4.C6939m) r7
            boolean r0 = r1.mo13871y0(r7)
            if (r0 != 0) goto L59
            return
        L59:
            r12 = r22
            r1.m14084c0(r7, r12)     // Catch: java.lang.Exception -> L5f
            goto L45
        L5f:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r2 = r0.length()
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to initialize decoder: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "MediaCodecRenderer"
            p371v5.C6565o.m13370c(r2, r0, r4)
            java.util.ArrayDeque<x4.m> r0 = r1.f27039L0
            r0.removeFirst()
            x4.n$a r0 = new x4.n$a
            f4.e0 r2 = r1.f27091x0
            java.lang.String r3 = r7.f27019a
            java.lang.String r5 = java.lang.String.valueOf(r2)
            r6 = 23
            int r6 = p064e.C1489c.m4038a(r3, r6)
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.String r8 = "Decoder init failed: "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r3 = ", "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = r2.f8896j0
            int r2 = p371v5.C6552b0.f25624a
            r6 = 21
            if (r2 < r6) goto Lc9
            boolean r2 = r4 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto Lc9
            r2 = r4
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            r8 = r2
            goto Lca
        Lc9:
            r8 = r11
        Lca:
            r9 = 0
            r2 = r0
            r6 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.mo6341f0(r0)
            x4.n$a r2 = r1.f27040M0
            if (r2 != 0) goto Ldb
            r1.f27040M0 = r0
            goto Lfd
        Ldb:
            x4.n$a r3 = new x4.n$a
            java.lang.String r14 = r2.getMessage()
            java.lang.Throwable r15 = r2.getCause()
            java.lang.String r4 = r2.f27097Y
            boolean r5 = r2.f27098Z
            x4.m r6 = r2.f27099a0
            java.lang.String r2 = r2.f27100b0
            r13 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r2
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r1.f27040M0 = r3
        Lfd:
            java.util.ArrayDeque<x4.m> r0 = r1.f27039L0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L107
            goto L45
        L107:
            x4.n$a r0 = r1.f27040M0
            throw r0
        L10a:
            r1.f27039L0 = r11
            return
        L10d:
            x4.n$a r0 = new x4.n$a
            f4.e0 r2 = r1.f27091x0
            r3 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>(r2, r11, r10, r3)
            throw r0
    }

    @Override // p088f4.InterfaceC2007f1
    /* renamed from: f */
    public final int mo5239f(p088f4.C2003e0 r3) {
            r2 = this;
            x4.p r0 = r2.f27065k0     // Catch: p406x4.C6944r.c -> L7
            int r3 = r2.mo6334A0(r0, r3)     // Catch: p406x4.C6944r.c -> L7
            return r3
        L7:
            r0 = move-exception
            r1 = 4002(0xfa2, float:5.608E-42)
            f4.q r3 = r2.m5241A(r0, r3, r1)
            throw r3
    }

    /* renamed from: f0 */
    public abstract void mo6341f0(java.lang.Exception r1);

    /* renamed from: g0 */
    public abstract void mo6342g0(java.lang.String r1, long r2, long r4);

    /* renamed from: h0 */
    public abstract void mo6343h0(java.lang.String r1);

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: i */
    public boolean mo5200i() {
            r7 = this;
            f4.e0 r0 = r7.f27091x0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L39
            boolean r0 = r7.mo5201j()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f8956h0
            goto L18
        Lf:
            g5.c0 r0 = r7.f8952d0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.mo5968i()
        L18:
            if (r0 != 0) goto L38
            int r0 = r7.f27056c1
            if (r0 < 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L38
            long r3 = r7.f27054a1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L39
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f27054a1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L39
        L38:
            r1 = 1
        L39:
            return r1
    }

    /* renamed from: i0 */
    public p142i4.C3075i mo6344i0(androidx.appcompat.widget.C0311x r12) {
            r11 = this;
            r0 = 1
            r11.f27086u1 = r0
            java.lang.Object r1 = r12.f1482a0
            r5 = r1
            f4.e0 r5 = (p088f4.C2003e0) r5
            java.util.Objects.requireNonNull(r5)
            java.lang.String r1 = r5.f8896j0
            r2 = 0
            if (r1 == 0) goto L139
            java.lang.Object r12 = r12.f1481Z
            j4.e r12 = (p162j4.InterfaceC3400e) r12
            r11.m14093w0(r12)
            r11.f27091x0 = r5
            boolean r12 = r11.f27060g1
            r1 = 0
            if (r12 == 0) goto L21
            r11.f27062i1 = r0
            return r1
        L21:
            x4.k r12 = r11.f27034G0
            if (r12 != 0) goto L2b
            r11.f27039L0 = r1
            r11.m14085d0()
            return r1
        L2b:
            x4.m r1 = r11.f27041N0
            f4.e0 r4 = r11.f27035H0
            j4.e r3 = r11.f27095z0
            j4.e r6 = r11.f27027A0
            r7 = 23
            if (r3 != r6) goto L39
        L37:
            r3 = 0
            goto L74
        L39:
            if (r6 == 0) goto L73
            if (r3 != 0) goto L3e
            goto L73
        L3e:
            int r8 = p371v5.C6552b0.f25624a
            if (r8 >= r7) goto L43
            goto L73
        L43:
            java.util.UUID r8 = p088f4.C2017j.f8968e
            java.util.UUID r3 = r3.mo7790b()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L73
            java.util.UUID r3 = r6.mo7790b()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L5a
            goto L73
        L5a:
            j4.r r3 = r11.m14083Z(r6)
            if (r3 != 0) goto L61
            goto L73
        L61:
            boolean r3 = r3.f14758c
            if (r3 == 0) goto L67
            r3 = 0
            goto L6d
        L67:
            java.lang.String r3 = r5.f8896j0
            boolean r3 = r6.mo7793e(r3)
        L6d:
            boolean r6 = r1.f27024f
            if (r6 != 0) goto L37
            if (r3 == 0) goto L37
        L73:
            r3 = 1
        L74:
            if (r3 == 0) goto L85
            r11.m14076P()
            i4.i r12 = new i4.i
            java.lang.String r3 = r1.f27019a
            r6 = 0
            r7 = 128(0x80, float:1.8E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L85:
            j4.e r3 = r11.f27027A0
            j4.e r6 = r11.f27095z0
            if (r3 == r6) goto L8d
            r3 = 1
            goto L8e
        L8d:
            r3 = 0
        L8e:
            if (r3 == 0) goto L97
            int r6 = p371v5.C6552b0.f25624a
            if (r6 < r7) goto L95
            goto L97
        L95:
            r6 = 0
            goto L98
        L97:
            r6 = 1
        L98:
            p371v5.C6549a.m13291e(r6)
            i4.i r6 = r11.mo6337M(r1, r4, r5)
            int r7 = r6.f12368d
            r8 = 16
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L11e
            if (r7 == r0) goto Lf1
            if (r7 == r10) goto Lc5
            if (r7 != r9) goto Lbf
            boolean r0 = r11.m14071B0(r5)
            if (r0 != 0) goto Lb4
            goto Lf7
        Lb4:
            r11.f27035H0 = r5
            if (r3 == 0) goto L121
            boolean r0 = r11.m14077Q()
            if (r0 != 0) goto L121
            goto L11c
        Lbf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        Lc5:
            boolean r7 = r11.m14071B0(r5)
            if (r7 != 0) goto Lcc
            goto Lf7
        Lcc:
            r11.f27064j1 = r0
            r11.f27066k1 = r0
            int r7 = r11.f27042O0
            if (r7 == r10) goto Le4
            if (r7 != r0) goto Le3
            int r7 = r5.f8901o0
            int r8 = r4.f8901o0
            if (r7 != r8) goto Le3
            int r7 = r5.f8902p0
            int r8 = r4.f8902p0
            if (r7 != r8) goto Le3
            goto Le4
        Le3:
            r0 = 0
        Le4:
            r11.f27050W0 = r0
            r11.f27035H0 = r5
            if (r3 == 0) goto L121
            boolean r0 = r11.m14077Q()
            if (r0 != 0) goto L121
            goto L11c
        Lf1:
            boolean r7 = r11.m14071B0(r5)
            if (r7 != 0) goto Lfa
        Lf7:
            r7 = 16
            goto L122
        Lfa:
            r11.f27035H0 = r5
            if (r3 == 0) goto L105
            boolean r0 = r11.m14077Q()
            if (r0 != 0) goto L121
            goto L11c
        L105:
            boolean r3 = r11.f27072n1
            if (r3 == 0) goto L11a
            r11.f27068l1 = r0
            boolean r3 = r11.f27044Q0
            if (r3 != 0) goto L117
            boolean r3 = r11.f27046S0
            if (r3 == 0) goto L114
            goto L117
        L114:
            r11.f27070m1 = r0
            goto L11a
        L117:
            r11.f27070m1 = r9
            r0 = 0
        L11a:
            if (r0 != 0) goto L121
        L11c:
            r7 = 2
            goto L122
        L11e:
            r11.m14076P()
        L121:
            r7 = 0
        L122:
            int r0 = r6.f12368d
            if (r0 == 0) goto L138
            x4.k r0 = r11.f27034G0
            if (r0 != r12) goto L12e
            int r12 = r11.f27070m1
            if (r12 != r9) goto L138
        L12e:
            i4.i r12 = new i4.i
            java.lang.String r3 = r1.f27019a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L138:
            return r6
        L139:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            f4.q r12 = r11.m5242B(r12, r5, r2, r0)
            throw r12
    }

    /* renamed from: j0 */
    public abstract void mo6345j0(p088f4.C2003e0 r1, android.media.MediaFormat r2);

    /* renamed from: k0 */
    public void mo13869k0(long r7) {
            r6 = this;
        L0:
            int r0 = r6.f27028A1
            if (r0 == 0) goto L33
            long[] r1 = r6.f27089w0
            r2 = 0
            r3 = r1[r2]
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 < 0) goto L33
            long[] r1 = r6.f27085u0
            r3 = r1[r2]
            r6.f27094y1 = r3
            long[] r3 = r6.f27087v0
            r4 = r3[r2]
            r6.f27096z1 = r4
            int r0 = r0 + (-1)
            r6.f27028A1 = r0
            r3 = 1
            java.lang.System.arraycopy(r1, r3, r1, r2, r0)
            long[] r0 = r6.f27087v0
            int r1 = r6.f27028A1
            java.lang.System.arraycopy(r0, r3, r0, r2, r1)
            long[] r0 = r6.f27089w0
            int r1 = r6.f27028A1
            java.lang.System.arraycopy(r0, r3, r0, r2, r1)
            r6.mo6346l0()
            goto L0
        L33:
            return
    }

    @Override // p088f4.AbstractC2008g, p088f4.InterfaceC2007f1
    /* renamed from: l */
    public final int mo5240l() {
            r1 = this;
            r0 = 8
            return r0
    }

    /* renamed from: l0 */
    public abstract void mo6346l0();

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: m */
    public void mo5203m(long r6, long r8) {
            r5 = this;
            boolean r0 = r5.f27088v1
            r1 = 0
            if (r0 == 0) goto La
            r5.f27088v1 = r1
            r5.m14087n0()
        La:
            f4.q r0 = r5.f27090w1
            if (r0 != 0) goto Lcc
            r0 = 1
            boolean r2 = r5.f27084t1     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 == 0) goto L17
            r5.mo6349r0()     // Catch: java.lang.IllegalStateException -> L7c
            return
        L17:
            f4.e0 r2 = r5.f27091x0     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 != 0) goto L23
            r2 = 2
            boolean r2 = r5.m14088p0(r2)     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 != 0) goto L23
            return
        L23:
            r5.m14085d0()     // Catch: java.lang.IllegalStateException -> L7c
            boolean r2 = r5.f27060g1     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 == 0) goto L36
            java.lang.String r2 = "bypassRender"
            p371v5.C6549a.m13287a(r2)     // Catch: java.lang.IllegalStateException -> L7c
        L2f:
            boolean r2 = r5.m14074L(r6, r8)     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 == 0) goto L5d
            goto L2f
        L36:
            x4.k r2 = r5.f27034G0     // Catch: java.lang.IllegalStateException -> L7c
            if (r2 == 0) goto L61
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L7c
            java.lang.String r4 = "drainAndFeed"
            p371v5.C6549a.m13287a(r4)     // Catch: java.lang.IllegalStateException -> L7c
        L43:
            boolean r4 = r5.m14078R(r6, r8)     // Catch: java.lang.IllegalStateException -> L7c
            if (r4 == 0) goto L50
            boolean r4 = r5.m14094x0(r2)     // Catch: java.lang.IllegalStateException -> L7c
            if (r4 == 0) goto L50
            goto L43
        L50:
            boolean r6 = r5.m14079S()     // Catch: java.lang.IllegalStateException -> L7c
            if (r6 == 0) goto L5d
            boolean r6 = r5.m14094x0(r2)     // Catch: java.lang.IllegalStateException -> L7c
            if (r6 == 0) goto L5d
            goto L50
        L5d:
            p371v5.C6549a.m13293g()     // Catch: java.lang.IllegalStateException -> L7c
            goto L77
        L61:
            i4.e r8 = r5.f27092x1     // Catch: java.lang.IllegalStateException -> L7c
            int r9 = r8.f12349d     // Catch: java.lang.IllegalStateException -> L7c
            g5.c0 r2 = r5.f8952d0     // Catch: java.lang.IllegalStateException -> L7c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalStateException -> L7c
            long r3 = r5.f8954f0     // Catch: java.lang.IllegalStateException -> L7c
            long r6 = r6 - r3
            int r6 = r2.mo5967c(r6)     // Catch: java.lang.IllegalStateException -> L7c
            int r9 = r9 + r6
            r8.f12349d = r9     // Catch: java.lang.IllegalStateException -> L7c
            r5.m14088p0(r0)     // Catch: java.lang.IllegalStateException -> L7c
        L77:
            i4.e r6 = r5.f27092x1     // Catch: java.lang.IllegalStateException -> L7c
            monitor-enter(r6)     // Catch: java.lang.IllegalStateException -> L7c
            monitor-exit(r6)     // Catch: java.lang.IllegalStateException -> L7c
            return
        L7c:
            r6 = move-exception
            int r7 = p371v5.C6552b0.f25624a
            r8 = 21
            if (r7 < r8) goto L88
            boolean r9 = r6 instanceof android.media.MediaCodec.CodecException
            if (r9 == 0) goto L88
            goto L9d
        L88:
            java.lang.StackTraceElement[] r9 = r6.getStackTrace()
            int r2 = r9.length
            if (r2 <= 0) goto L9f
            r9 = r9[r1]
            java.lang.String r9 = r9.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L9f
        L9d:
            r9 = 1
            goto La0
        L9f:
            r9 = 0
        La0:
            if (r9 == 0) goto Lcb
            r5.mo6341f0(r6)
            if (r7 < r8) goto Lb7
            boolean r7 = r6 instanceof android.media.MediaCodec.CodecException
            if (r7 == 0) goto Lb3
            r7 = r6
            android.media.MediaCodec$CodecException r7 = (android.media.MediaCodec.CodecException) r7
            boolean r7 = r7.isRecoverable()
            goto Lb4
        Lb3:
            r7 = 0
        Lb4:
            if (r7 == 0) goto Lb7
            r1 = 1
        Lb7:
            if (r1 == 0) goto Lbc
            r5.m14089q0()
        Lbc:
            x4.m r7 = r5.f27041N0
            x4.l r6 = r5.mo13855N(r6, r7)
            f4.e0 r7 = r5.f27091x0
            r8 = 4003(0xfa3, float:5.61E-42)
            f4.q r6 = r5.m5242B(r6, r7, r1, r8)
            throw r6
        Lcb:
            throw r6
        Lcc:
            r6 = 0
            r5.f27090w1 = r6
            throw r0
    }

    /* renamed from: m0 */
    public abstract void mo6347m0(p142i4.C3073g r1);

    @android.annotation.TargetApi(23)
    /* renamed from: n0 */
    public final void m14087n0() {
            r3 = this;
            int r0 = r3.f27070m1
            r1 = 1
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L18
            r2 = 3
            if (r0 == r2) goto L11
            r3.f27084t1 = r1
            r3.mo6349r0()
            goto L22
        L11:
            r3.m14089q0()
            r3.m14085d0()
            goto L22
        L18:
            r3.m14080T()
            r3.m14072C0()
            goto L22
        L1f:
            r3.m14080T()
        L22:
            return
    }

    /* renamed from: o0 */
    public abstract boolean mo6348o0(long r1, long r3, p406x4.InterfaceC6937k r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, p088f4.C2003e0 r14);

    /* renamed from: p0 */
    public final boolean m14088p0(int r4) {
            r3 = this;
            androidx.appcompat.widget.x r0 = r3.m5243C()
            i4.g r1 = r3.f27071n0
            r1.mo7522t()
            i4.g r1 = r3.f27071n0
            r4 = r4 | 4
            int r4 = r3.m5251K(r0, r1, r4)
            r1 = 1
            r2 = -5
            if (r4 != r2) goto L19
            r3.mo6344i0(r0)
            return r1
        L19:
            r0 = -4
            if (r4 != r0) goto L29
            i4.g r4 = r3.f27071n0
            boolean r4 = r4.m7517r()
            if (r4 == 0) goto L29
            r3.f27082s1 = r1
            r3.m14087n0()
        L29:
            r4 = 0
            return r4
    }

    /* renamed from: q0 */
    public void m14089q0() {
            r3 = this;
            r0 = 0
            x4.k r1 = r3.f27034G0     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L17
            r1.release()     // Catch: java.lang.Throwable -> L33
            i4.e r1 = r3.f27092x1     // Catch: java.lang.Throwable -> L33
            int r2 = r1.f12347b     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + 1
            r1.f12347b = r2     // Catch: java.lang.Throwable -> L33
            x4.m r1 = r3.f27041N0     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.f27019a     // Catch: java.lang.Throwable -> L33
            r3.mo6343h0(r1)     // Catch: java.lang.Throwable -> L33
        L17:
            r3.f27034G0 = r0
            android.media.MediaCrypto r1 = r3.f27029B0     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L20
            r1.release()     // Catch: java.lang.Throwable -> L29
        L20:
            r3.f27029B0 = r0
            r3.m14092v0(r0)
            r3.m14090t0()
            return
        L29:
            r1 = move-exception
            r3.f27029B0 = r0
            r3.m14092v0(r0)
            r3.m14090t0()
            throw r1
        L33:
            r1 = move-exception
            r3.f27034G0 = r0
            android.media.MediaCrypto r2 = r3.f27029B0     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3d
            r2.release()     // Catch: java.lang.Throwable -> L46
        L3d:
            r3.f27029B0 = r0
            r3.m14092v0(r0)
            r3.m14090t0()
            throw r1
        L46:
            r1 = move-exception
            r3.f27029B0 = r0
            r3.m14092v0(r0)
            r3.m14090t0()
            throw r1
    }

    /* renamed from: r0 */
    public void mo6349r0() {
            r0 = this;
            return
    }

    /* renamed from: s0 */
    public void mo13870s0() {
            r5 = this;
            r5.m14091u0()
            r0 = -1
            r5.f27056c1 = r0
            r0 = 0
            r5.f27057d1 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f27054a1 = r0
            r2 = 0
            r5.f27074o1 = r2
            r5.f27072n1 = r2
            r5.f27050W0 = r2
            r5.f27051X0 = r2
            r5.f27058e1 = r2
            r5.f27059f1 = r2
            java.util.ArrayList<java.lang.Long> r3 = r5.f27081s0
            r3.clear()
            r5.f27078q1 = r0
            r5.f27080r1 = r0
            x4.h r0 = r5.f27053Z0
            if (r0 == 0) goto L32
            r3 = 0
            r0.f27006a = r3
            r0.f27007b = r3
            r0.f27008c = r2
        L32:
            r5.f27068l1 = r2
            r5.f27070m1 = r2
            boolean r0 = r5.f27064j1
            r5.f27066k1 = r0
            return
    }

    /* renamed from: t0 */
    public void m14090t0() {
            r2 = this;
            r2.mo13870s0()
            r0 = 0
            r2.f27090w1 = r0
            r2.f27053Z0 = r0
            r2.f27039L0 = r0
            r2.f27041N0 = r0
            r2.f27035H0 = r0
            r2.f27036I0 = r0
            r0 = 0
            r2.f27037J0 = r0
            r2.f27076p1 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f27038K0 = r1
            r2.f27042O0 = r0
            r2.f27043P0 = r0
            r2.f27044Q0 = r0
            r2.f27045R0 = r0
            r2.f27046S0 = r0
            r2.f27047T0 = r0
            r2.f27048U0 = r0
            r2.f27049V0 = r0
            r2.f27052Y0 = r0
            r2.f27064j1 = r0
            r2.f27066k1 = r0
            r2.f27030C0 = r0
            return
    }

    /* renamed from: u0 */
    public final void m14091u0() {
            r2 = this;
            r0 = -1
            r2.f27055b1 = r0
            i4.g r0 = r2.f27073o0
            r1 = 0
            r0.f12358a0 = r1
            return
    }

    /* renamed from: v0 */
    public final void m14092v0(p162j4.InterfaceC3400e r3) {
            r2 = this;
            j4.e r0 = r2.f27095z0
            if (r0 != r3) goto L5
            goto L10
        L5:
            r1 = 0
            if (r3 == 0) goto Lb
            r3.mo7792d(r1)
        Lb:
            if (r0 == 0) goto L10
            r0.mo7791c(r1)
        L10:
            r2.f27095z0 = r3
            return
    }

    /* renamed from: w0 */
    public final void m14093w0(p162j4.InterfaceC3400e r3) {
            r2 = this;
            j4.e r0 = r2.f27027A0
            if (r0 != r3) goto L5
            goto L10
        L5:
            r1 = 0
            if (r3 == 0) goto Lb
            r3.mo7792d(r1)
        Lb:
            if (r0 == 0) goto L10
            r0.mo7791c(r1)
        L10:
            r2.f27027A0 = r3
            return
    }

    /* renamed from: x0 */
    public final boolean m14094x0(long r6) {
            r5 = this;
            long r0 = r5.f27031D0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            long r6 = r5.f27031D0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L19
        L17:
            r6 = 0
            goto L1a
        L19:
            r6 = 1
        L1a:
            return r6
    }

    /* renamed from: y0 */
    public boolean mo13871y0(p406x4.C6939m r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // p088f4.AbstractC2008g, p088f4.InterfaceC2004e1
    /* renamed from: z */
    public void mo5214z(float r1, float r2) {
            r0 = this;
            r0.f27032E0 = r1
            r0.f27033F0 = r2
            f4.e0 r1 = r0.f27035H0
            r0.m14071B0(r1)
            return
    }

    /* renamed from: z0 */
    public boolean mo6350z0(p088f4.C2003e0 r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
