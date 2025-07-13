package p121h4;

/* renamed from: h4.x */
/* loaded from: classes.dex */
public class C2483x extends p406x4.AbstractC6940n implements p371v5.InterfaceC6566p {

    /* renamed from: C1 */
    public final android.content.Context f11205C1;

    /* renamed from: D1 */
    public final p121h4.InterfaceC2473n.a f11206D1;

    /* renamed from: E1 */
    public final p121h4.InterfaceC2474o f11207E1;

    /* renamed from: F1 */
    public int f11208F1;

    /* renamed from: G1 */
    public boolean f11209G1;

    /* renamed from: H1 */
    public p088f4.C2003e0 f11210H1;

    /* renamed from: I1 */
    public long f11211I1;

    /* renamed from: J1 */
    public boolean f11212J1;

    /* renamed from: K1 */
    public boolean f11213K1;

    /* renamed from: L1 */
    public boolean f11214L1;

    /* renamed from: M1 */
    public p088f4.InterfaceC2004e1.a f11215M1;

    /* renamed from: h4.x$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h4.x$b */
    public final class b implements p121h4.InterfaceC2474o.c {

        /* renamed from: a */
        public final /* synthetic */ p121h4.C2483x f11216a;

        public b(p121h4.C2483x r1, p121h4.C2483x.a r2) {
                r0 = this;
                r0.f11216a = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m6351a(java.lang.Exception r5) {
                r4 = this;
                java.lang.String r0 = "MediaCodecAudioRenderer"
                java.lang.String r1 = "Audio sink error"
                p371v5.C6565o.m13369b(r0, r1, r5)
                h4.x r0 = r4.f11216a
                h4.n$a r0 = r0.f11206D1
                android.os.Handler r1 = r0.f11063a
                if (r1 == 0) goto L18
                h4.i r2 = new h4.i
                r3 = 1
                r2.<init>(r0, r5, r3)
                r1.post(r2)
            L18:
                return
        }
    }

    public C2483x(android.content.Context r7, p406x4.InterfaceC6937k.b r8, p406x4.InterfaceC6942p r9, boolean r10, android.os.Handler r11, p121h4.InterfaceC2473n r12, p121h4.InterfaceC2474o r13) {
            r6 = this;
            r1 = 1
            r5 = 1194083328(0x472c4400, float:44100.0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r7 = r7.getApplicationContext()
            r6.f11205C1 = r7
            r6.f11207E1 = r13
            h4.n$a r7 = new h4.n$a
            r7.<init>(r11, r12)
            r6.f11206D1 = r7
            h4.x$b r7 = new h4.x$b
            r8 = 0
            r7.<init>(r6, r8)
            r13.mo6283r(r7)
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: A0 */
    public int mo6334A0(p406x4.InterfaceC6942p r11, p088f4.C2003e0 r12) {
            r10 = this;
            java.lang.String r0 = r12.f8896j0
            boolean r0 = p371v5.C6567q.m13378h(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = p371v5.C6552b0.f25624a
            r2 = 21
            if (r0 < r2) goto L13
            r0 = 32
            goto L14
        L13:
            r0 = 0
        L14:
            int r2 = r12.f8883C0
            r3 = 1
            if (r2 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r5 = 2
            if (r2 == 0) goto L24
            if (r2 != r5) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            java.lang.String r6 = "audio/raw"
            if (r2 == 0) goto L3c
            h4.o r7 = r10.f11207E1
            boolean r7 = r7.mo6271f(r12)
            if (r7 == 0) goto L3c
            if (r4 == 0) goto L39
            x4.m r4 = p406x4.C6944r.m14099d(r6, r1, r1)
            if (r4 == 0) goto L3c
        L39:
            r11 = r0 | 12
            return r11
        L3c:
            java.lang.String r4 = r12.f8896j0
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L4d
            h4.o r4 = r10.f11207E1
            boolean r4 = r4.mo6271f(r12)
            if (r4 != 0) goto L4d
            return r3
        L4d:
            h4.o r4 = r10.f11207E1
            int r7 = r12.f8909w0
            int r8 = r12.f8910x0
            f4.e0$b r9 = new f4.e0$b
            r9.<init>()
            r9.f8927k = r6
            r9.f8940x = r7
            r9.f8941y = r8
            r9.f8942z = r5
            f4.e0 r6 = r9.m5193a()
            boolean r4 = r4.mo6271f(r6)
            if (r4 != 0) goto L6b
            return r3
        L6b:
            java.util.List r11 = r10.mo6339Y(r11, r12, r1)
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L76
            return r3
        L76:
            if (r2 != 0) goto L79
            return r5
        L79:
            java.lang.Object r11 = r11.get(r1)
            x4.m r11 = (p406x4.C6939m) r11
            boolean r1 = r11.m14067e(r12)
            if (r1 == 0) goto L8e
            boolean r11 = r11.m14068f(r12)
            if (r11 == 0) goto L8e
            r11 = 16
            goto L90
        L8e:
            r11 = 8
        L90:
            if (r1 == 0) goto L94
            r12 = 4
            goto L95
        L94:
            r12 = 3
        L95:
            r11 = r11 | r12
            r11 = r11 | r0
            return r11
    }

    @Override // p406x4.AbstractC6940n, p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r3 = this;
            r0 = 1
            r3.f11214L1 = r0
            h4.o r0 = r3.f11207E1     // Catch: java.lang.Throwable -> L1c
            r0.flush()     // Catch: java.lang.Throwable -> L1c
            super.mo5244D()     // Catch: java.lang.Throwable -> L13
            h4.n$a r0 = r3.f11206D1
            i4.e r1 = r3.f27092x1
            r0.m6265a(r1)
            return
        L13:
            r0 = move-exception
            h4.n$a r1 = r3.f11206D1
            i4.e r2 = r3.f27092x1
            r1.m6265a(r2)
            throw r0
        L1c:
            r0 = move-exception
            super.mo5244D()     // Catch: java.lang.Throwable -> L28
            h4.n$a r1 = r3.f11206D1
            i4.e r2 = r3.f27092x1
            r1.m6265a(r2)
            throw r0
        L28:
            r0 = move-exception
            h4.n$a r1 = r3.f11206D1
            i4.e r2 = r3.f27092x1
            r1.m6265a(r2)
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: E */
    public void mo5245E(boolean r4, boolean r5) {
            r3 = this;
            i4.e r4 = new i4.e
            r4.<init>()
            r3.f27092x1 = r4
            h4.n$a r5 = r3.f11206D1
            android.os.Handler r0 = r5.f11063a
            if (r0 == 0) goto L16
            h4.h r1 = new h4.h
            r2 = 1
            r1.<init>(r5, r4, r2)
            r0.post(r1)
        L16:
            f4.g1 r4 = r3.f8949a0
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.f8959a
            if (r4 == 0) goto L25
            h4.o r4 = r3.f11207E1
            r4.mo6272g()
            goto L2a
        L25:
            h4.o r4 = r3.f11207E1
            r4.mo6282q()
        L2a:
            return
    }

    /* renamed from: E0 */
    public final int m6335E0(p406x4.C6939m r2, p088f4.C2003e0 r3) {
            r1 = this;
            java.lang.String r2 = r2.f27019a
            java.lang.String r0 = "OMX.google.raw.decoder"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            int r2 = p371v5.C6552b0.f25624a
            r0 = 24
            if (r2 >= r0) goto L1e
            r0 = 23
            if (r2 != r0) goto L1c
            android.content.Context r2 = r1.f11205C1
            boolean r2 = p371v5.C6552b0.m13333z(r2)
            if (r2 != 0) goto L1e
        L1c:
            r2 = -1
            return r2
        L1e:
            int r2 = r3.f8897k0
            return r2
    }

    @Override // p406x4.AbstractC6940n, p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r1, boolean r3) {
            r0 = this;
            super.mo5246F(r1, r3)
            h4.o r3 = r0.f11207E1
            r3.flush()
            r0.f11211I1 = r1
            r1 = 1
            r0.f11212J1 = r1
            r0.f11213K1 = r1
            return
    }

    /* renamed from: F0 */
    public final void m6336F0() {
            r5 = this;
            h4.o r0 = r5.f11207E1
            boolean r1 = r5.mo5197d()
            long r0 = r0.mo6280o(r1)
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            boolean r2 = r5.f11213K1
            if (r2 == 0) goto L15
            goto L1b
        L15:
            long r2 = r5.f11211I1
            long r0 = java.lang.Math.max(r2, r0)
        L1b:
            r5.f11211I1 = r0
            r0 = 0
            r5.f11213K1 = r0
        L20:
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: G */
    public void mo5247G() {
            r3 = this;
            r0 = 0
            r1 = 0
            r3.m14075O()     // Catch: java.lang.Throwable -> L19
            r3.m14089q0()     // Catch: java.lang.Throwable -> L19
            r3.m14093w0(r0)     // Catch: java.lang.Throwable -> L17
            boolean r0 = r3.f11214L1
            if (r0 == 0) goto L16
            r3.f11214L1 = r1
            h4.o r0 = r3.f11207E1
            r0.mo6267b()
        L16:
            return
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r2 = move-exception
            r3.m14093w0(r0)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L1e:
            boolean r2 = r3.f11214L1
            if (r2 == 0) goto L29
            r3.f11214L1 = r1
            h4.o r1 = r3.f11207E1
            r1.mo6267b()
        L29:
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: H */
    public void mo5248H() {
            r1 = this;
            h4.o r0 = r1.f11207E1
            r0.mo6281p()
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: I */
    public void mo5249I() {
            r1 = this;
            r1.m6336F0()
            h4.o r0 = r1.f11207E1
            r0.mo6275j()
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: M */
    public p142i4.C3075i mo6337M(p406x4.C6939m r9, p088f4.C2003e0 r10, p088f4.C2003e0 r11) {
            r8 = this;
            i4.i r0 = r9.m14065c(r10, r11)
            int r1 = r0.f12369e
            int r2 = r8.m6335E0(r9, r11)
            int r3 = r8.f11208F1
            if (r2 <= r3) goto L10
            r1 = r1 | 64
        L10:
            r7 = r1
            i4.i r1 = new i4.i
            java.lang.String r3 = r9.f27019a
            if (r7 == 0) goto L1a
            r9 = 0
            r6 = 0
            goto L1d
        L1a:
            int r9 = r0.f12368d
            r6 = r9
        L1d:
            r2 = r1
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: X */
    public float mo6338X(float r5, p088f4.C2003e0 r6, p088f4.C2003e0[] r7) {
            r4 = this;
            int r6 = r7.length
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            if (r1 >= r6) goto L13
            r3 = r7[r1]
            int r3 = r3.f8910x0
            if (r3 == r0) goto L10
            int r2 = java.lang.Math.max(r2, r3)
        L10:
            int r1 = r1 + 1
            goto L4
        L13:
            if (r2 != r0) goto L18
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L1b
        L18:
            float r6 = (float) r2
            float r5 = r5 * r6
        L1b:
            return r5
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: Y */
    public java.util.List<p406x4.C6939m> mo6339Y(p406x4.InterfaceC6942p r5, p088f4.C2003e0 r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = r6.f8896j0
            if (r0 != 0) goto L9
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L9:
            h4.o r1 = r4.f11207E1
            boolean r1 = r1.mo6271f(r6)
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.String r1 = "audio/raw"
            x4.m r1 = p406x4.C6944r.m14099d(r1, r2, r2)
            if (r1 == 0) goto L1f
            java.util.List r5 = java.util.Collections.singletonList(r1)
            return r5
        L1f:
            java.util.List r1 = r5.mo14095a(r0, r7, r2)
            java.util.regex.Pattern r3 = p406x4.C6944r.f27104a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            u3.b r1 = new u3.b
            r1.<init>(r6)
            p406x4.C6944r.m14105j(r3, r1)
            java.lang.String r6 = "audio/eac3-joc"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L49
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            java.lang.String r0 = "audio/eac3"
            java.util.List r5 = r5.mo14095a(r0, r7, r2)
            r6.addAll(r5)
            r3 = r6
        L49:
            java.util.List r5 = java.util.Collections.unmodifiableList(r3)
            return r5
    }

    @Override // p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1
    /* renamed from: a */
    public java.lang.String mo5195a() {
            r1 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: a0 */
    public p406x4.InterfaceC6937k.a mo6340a0(p406x4.C6939m r13, p088f4.C2003e0 r14, android.media.MediaCrypto r15, float r16) {
            r12 = this;
            r0 = r12
            r2 = r13
            r4 = r14
            r1 = r16
            f4.e0[] r3 = r0.f8953e0
            java.util.Objects.requireNonNull(r3)
            int r5 = r12.m6335E0(r13, r14)
            int r6 = r3.length
            r7 = 0
            r8 = 1
            if (r6 != r8) goto L14
            goto L2d
        L14:
            int r6 = r3.length
            r9 = 0
        L16:
            if (r9 >= r6) goto L2d
            r10 = r3[r9]
            i4.i r11 = r13.m14065c(r14, r10)
            int r11 = r11.f12368d
            if (r11 == 0) goto L2a
            int r10 = r12.m6335E0(r13, r10)
            int r5 = java.lang.Math.max(r5, r10)
        L2a:
            int r9 = r9 + 1
            goto L16
        L2d:
            r0.f11208F1 = r5
            java.lang.String r3 = r2.f27019a
            int r5 = p371v5.C6552b0.f25624a
            r6 = 24
            if (r5 >= r6) goto L65
            java.lang.String r9 = "OMX.SEC.aac.dec"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L65
            java.lang.String r3 = p371v5.C6552b0.f25626c
            java.lang.String r9 = "samsung"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L65
            java.lang.String r3 = p371v5.C6552b0.f25625b
            java.lang.String r9 = "zeroflte"
            boolean r9 = r3.startsWith(r9)
            if (r9 != 0) goto L63
            java.lang.String r9 = "herolte"
            boolean r9 = r3.startsWith(r9)
            if (r9 != 0) goto L63
            java.lang.String r9 = "heroqlte"
            boolean r3 = r3.startsWith(r9)
            if (r3 == 0) goto L65
        L63:
            r3 = 1
            goto L66
        L65:
            r3 = 0
        L66:
            r0.f11209G1 = r3
            java.lang.String r3 = r2.f27021c
            int r9 = r0.f11208F1
            android.media.MediaFormat r10 = new android.media.MediaFormat
            r10.<init>()
            java.lang.String r11 = "mime"
            r10.setString(r11, r3)
            int r3 = r4.f8909w0
            java.lang.String r11 = "channel-count"
            r10.setInteger(r11, r3)
            int r3 = r4.f8910x0
            java.lang.String r11 = "sample-rate"
            r10.setInteger(r11, r3)
            java.util.List<byte[]> r3 = r4.f8898l0
            p064e.C1487a.m4031i(r10, r3)
            java.lang.String r3 = "max-input-size"
            p064e.C1487a.m4029g(r10, r3, r9)
            r3 = 23
            if (r5 < r3) goto Lbb
            java.lang.String r9 = "priority"
            r10.setInteger(r9, r7)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 == 0) goto Lbb
            if (r5 != r3) goto Lb3
            java.lang.String r3 = p371v5.C6552b0.f25627d
            java.lang.String r9 = "ZTE B2017G"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto Lb1
            java.lang.String r9 = "AXON 7 mini"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Lb3
        Lb1:
            r3 = 1
            goto Lb4
        Lb3:
            r3 = 0
        Lb4:
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "operating-rate"
            r10.setFloat(r3, r1)
        Lbb:
            r1 = 28
            if (r5 > r1) goto Lce
            java.lang.String r1 = r4.f8896j0
            java.lang.String r3 = "audio/ac4"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lce
            java.lang.String r1 = "ac4-is-sync"
            r10.setInteger(r1, r8)
        Lce:
            java.lang.String r1 = "audio/raw"
            if (r5 < r6) goto Lf6
            h4.o r3 = r0.f11207E1
            int r5 = r4.f8909w0
            int r6 = r4.f8910x0
            f4.e0$b r9 = new f4.e0$b
            r9.<init>()
            r9.f8927k = r1
            r9.f8940x = r5
            r9.f8941y = r6
            r5 = 4
            r9.f8942z = r5
            f4.e0 r6 = r9.m5193a()
            int r3 = r3.mo6277l(r6)
            r6 = 2
            if (r3 != r6) goto Lf6
            java.lang.String r3 = "pcm-encoding"
            r10.setInteger(r3, r5)
        Lf6:
            java.lang.String r3 = r2.f27020b
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L107
            java.lang.String r3 = r4.f8896j0
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L107
            r7 = 1
        L107:
            if (r7 == 0) goto L10b
            r1 = r4
            goto L10c
        L10b:
            r1 = 0
        L10c:
            r0.f11210H1 = r1
            x4.k$a r9 = new x4.k$a
            r5 = 0
            r7 = 0
            r8 = 0
            r1 = r9
            r2 = r13
            r3 = r10
            r4 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: c */
    public void mo5331c(p088f4.C2052w0 r2) {
            r1 = this;
            h4.o r0 = r1.f11207E1
            r0.mo6268c(r2)
            return
    }

    @Override // p406x4.AbstractC6940n, p088f4.InterfaceC2004e1
    /* renamed from: d */
    public boolean mo5197d() {
            r1 = this;
            boolean r0 = r1.f27084t1
            if (r0 == 0) goto Le
            h4.o r0 = r1.f11207E1
            boolean r0 = r0.mo6269d()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: e */
    public p088f4.C2052w0 mo5332e() {
            r1 = this;
            h4.o r0 = r1.f11207E1
            f4.w0 r0 = r0.mo6270e()
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: f0 */
    public void mo6341f0(java.lang.Exception r5) {
            r4 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            java.lang.String r1 = "Audio codec error"
            p371v5.C6565o.m13369b(r0, r1, r5)
            h4.n$a r0 = r4.f11206D1
            android.os.Handler r1 = r0.f11063a
            if (r1 == 0) goto L16
            h4.i r2 = new h4.i
            r3 = 0
            r2.<init>(r0, r5, r3)
            r1.post(r2)
        L16:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: g0 */
    public void mo6342g0(java.lang.String r10, long r11, long r13) {
            r9 = this;
            h4.n$a r1 = r9.f11206D1
            android.os.Handler r7 = r1.f11063a
            if (r7 == 0) goto L12
            h4.k r8 = new h4.k
            r0 = r8
            r2 = r10
            r3 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r5)
            r7.post(r8)
        L12:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: h0 */
    public void mo6343h0(java.lang.String r4) {
            r3 = this;
            h4.n$a r0 = r3.f11206D1
            android.os.Handler r1 = r0.f11063a
            if (r1 == 0) goto Le
            a4.c r2 = new a4.c
            r2.<init>(r0, r4)
            r1.post(r2)
        Le:
            return
    }

    @Override // p406x4.AbstractC6940n, p088f4.InterfaceC2004e1
    /* renamed from: i */
    public boolean mo5200i() {
            r1 = this;
            h4.o r0 = r1.f11207E1
            boolean r0 = r0.mo6276k()
            if (r0 != 0) goto L11
            boolean r0 = super.mo5200i()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: i0 */
    public p142i4.C3075i mo6344i0(androidx.appcompat.widget.C0311x r5) {
            r4 = this;
            i4.i r0 = super.mo6344i0(r5)
            h4.n$a r1 = r4.f11206D1
            java.lang.Object r5 = r5.f1482a0
            f4.e0 r5 = (p088f4.C2003e0) r5
            android.os.Handler r2 = r1.f11063a
            if (r2 == 0) goto L16
            f4.n0 r3 = new f4.n0
            r3.<init>(r1, r5, r0)
            r2.post(r3)
        L16:
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: j0 */
    public void mo6345j0(p088f4.C2003e0 r6, android.media.MediaFormat r7) {
            r5 = this;
            f4.e0 r0 = r5.f11210H1
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto L89
        L9:
            x4.k r0 = r5.f27034G0
            if (r0 != 0) goto Lf
            goto L89
        Lf:
            java.lang.String r0 = r6.f8896j0
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1c
        L19:
            int r0 = r6.f8911y0
            goto L4a
        L1c:
            int r0 = p371v5.C6552b0.f25624a
            r4 = 24
            if (r0 < r4) goto L2f
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L2f
            int r0 = r7.getInteger(r0)
            goto L4a
        L2f:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L40
            int r0 = r7.getInteger(r0)
            int r0 = p371v5.C6552b0.m13325r(r0)
            goto L4a
        L40:
            java.lang.String r0 = r6.f8896j0
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L49
            goto L19
        L49:
            r0 = 2
        L4a:
            f4.e0$b r4 = new f4.e0$b
            r4.<init>()
            r4.f8927k = r3
            r4.f8942z = r0
            int r0 = r6.f8912z0
            r4.f8913A = r0
            int r0 = r6.f8881A0
            r4.f8914B = r0
            java.lang.String r0 = "channel-count"
            int r0 = r7.getInteger(r0)
            r4.f8940x = r0
            java.lang.String r0 = "sample-rate"
            int r7 = r7.getInteger(r0)
            r4.f8941y = r7
            f4.e0 r7 = r4.m5193a()
            boolean r0 = r5.f11209G1
            if (r0 == 0) goto L88
            int r0 = r7.f8909w0
            r3 = 6
            if (r0 != r3) goto L88
            int r0 = r6.f8909w0
            if (r0 >= r3) goto L88
            int[] r2 = new int[r0]
            r0 = 0
        L7f:
            int r3 = r6.f8909w0
            if (r0 >= r3) goto L88
            r2[r0] = r0
            int r0 = r0 + 1
            goto L7f
        L88:
            r6 = r7
        L89:
            h4.o r7 = r5.f11207E1     // Catch: p121h4.InterfaceC2474o.a -> L8f
            r7.mo6284s(r6, r1, r2)     // Catch: p121h4.InterfaceC2474o.a -> L8f
            return
        L8f:
            r6 = move-exception
            f4.e0 r7 = r6.f11065Y
            r0 = 5001(0x1389, float:7.008E-42)
            f4.q r6 = r5.m5242B(r6, r7, r1, r0)
            throw r6
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: l0 */
    public void mo6346l0() {
            r1 = this;
            h4.o r0 = r1.f11207E1
            r0.mo6286u()
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: m0 */
    public void mo6347m0(p142i4.C3073g r6) {
            r5 = this;
            boolean r0 = r5.f11212J1
            if (r0 == 0) goto L21
            boolean r0 = r6.m7516q()
            if (r0 != 0) goto L21
            long r0 = r6.f12360c0
            long r2 = r5.f11211I1
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            long r0 = r6.f12360c0
            r5.f11211I1 = r0
        L1e:
            r6 = 0
            r5.f11212J1 = r6
        L21:
            return
    }

    @Override // p088f4.AbstractC2008g, p088f4.C1992a1.b
    /* renamed from: n */
    public void mo5108n(int r2, java.lang.Object r3) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L3a
            r0 = 3
            if (r2 == r0) goto L32
            r0 = 6
            if (r2 == r0) goto L2a
            switch(r2) {
                case 9: goto L1e;
                case 10: goto L12;
                case 11: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L45
        Ld:
            f4.e1$a r3 = (p088f4.InterfaceC2004e1.a) r3
            r1.f11215M1 = r3
            goto L45
        L12:
            h4.o r2 = r1.f11207E1
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mo6278m(r3)
            goto L45
        L1e:
            h4.o r2 = r1.f11207E1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.mo6285t(r3)
            goto L45
        L2a:
            h4.r r3 = (p121h4.C2477r) r3
            h4.o r2 = r1.f11207E1
            r2.mo6266a(r3)
            goto L45
        L32:
            h4.d r3 = (p121h4.C2461d) r3
            h4.o r2 = r1.f11207E1
            r2.mo6273h(r3)
            goto L45
        L3a:
            h4.o r2 = r1.f11207E1
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mo6287v(r3)
        L45:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: o0 */
    public boolean mo6348o0(long r1, long r3, p406x4.InterfaceC6937k r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, p088f4.C2003e0 r14) {
            r0 = this;
            java.util.Objects.requireNonNull(r6)
            f4.e0 r1 = r0.f11210H1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            java.util.Objects.requireNonNull(r5)
            r5.mo14033c(r7, r3)
            return r2
        L14:
            if (r12 == 0) goto L28
            if (r5 == 0) goto L1b
            r5.mo14033c(r7, r3)
        L1b:
            i4.e r1 = r0.f27092x1
            int r3 = r1.f12351f
            int r3 = r3 + r9
            r1.f12351f = r3
            h4.o r1 = r0.f11207E1
            r1.mo6286u()
            return r2
        L28:
            h4.o r1 = r0.f11207E1     // Catch: p121h4.InterfaceC2474o.e -> L3e p121h4.InterfaceC2474o.b -> L48
            boolean r1 = r1.mo6279n(r6, r10, r9)     // Catch: p121h4.InterfaceC2474o.e -> L3e p121h4.InterfaceC2474o.b -> L48
            if (r1 == 0) goto L3d
            if (r5 == 0) goto L35
            r5.mo14033c(r7, r3)
        L35:
            i4.e r1 = r0.f27092x1
            int r3 = r1.f12350e
            int r3 = r3 + r9
            r1.f12350e = r3
            return r2
        L3d:
            return r3
        L3e:
            r1 = move-exception
            boolean r2 = r1.f11068Y
            r3 = 5002(0x138a, float:7.009E-42)
            f4.q r1 = r0.m5242B(r1, r14, r2, r3)
            throw r1
        L48:
            r1 = move-exception
            f4.e0 r2 = r1.f11067Z
            boolean r3 = r1.f11066Y
            r4 = 5001(0x1389, float:7.008E-42)
            f4.q r1 = r0.m5242B(r1, r2, r3, r4)
            throw r1
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: r0 */
    public void mo6349r0() {
            r4 = this;
            h4.o r0 = r4.f11207E1     // Catch: p121h4.InterfaceC2474o.e -> L6
            r0.mo6274i()     // Catch: p121h4.InterfaceC2474o.e -> L6
            return
        L6:
            r0 = move-exception
            f4.e0 r1 = r0.f11069Z
            boolean r2 = r0.f11068Y
            r3 = 5002(0x138a, float:7.009E-42)
            f4.q r0 = r4.m5242B(r0, r1, r2, r3)
            throw r0
    }

    @Override // p088f4.AbstractC2008g, p088f4.InterfaceC2004e1
    /* renamed from: v */
    public p371v5.InterfaceC6566p mo5211v() {
            r0 = this;
            return r0
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: y */
    public long mo5333y() {
            r2 = this;
            int r0 = r2.f8951c0
            r1 = 2
            if (r0 != r1) goto L8
            r2.m6336F0()
        L8:
            long r0 = r2.f11211I1
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: z0 */
    public boolean mo6350z0(p088f4.C2003e0 r2) {
            r1 = this;
            h4.o r0 = r1.f11207E1
            boolean r2 = r0.mo6271f(r2)
            return r2
    }
}
