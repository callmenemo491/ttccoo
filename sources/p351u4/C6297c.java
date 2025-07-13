package p351u4;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public class C6297c implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public p216m4.InterfaceC4366k f24578a;

    /* renamed from: b */
    public p351u4.AbstractC6302h f24579b;

    /* renamed from: c */
    public boolean f24580c;

    static {
            k1.b r0 = p179k1.C3642b.f16063l0
            return
    }

    public C6297c() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: a */
    public final boolean m12936a(p216m4.InterfaceC4365j r9) {
            r8 = this;
            u4.e r0 = new u4.e
            r0.<init>()
            r1 = 1
            boolean r2 = r0.m12939a(r9, r1)
            r3 = 0
            if (r2 == 0) goto L8d
            int r2 = r0.f24586a
            r4 = 2
            r2 = r2 & r4
            if (r2 == r4) goto L15
            goto L8d
        L15:
            int r0 = r0.f24590e
            r2 = 8
            int r0 = java.lang.Math.min(r0, r2)
            v5.u r2 = new v5.u
            r2.<init>(r0)
            byte[] r4 = r2.f25710a
            r9.mo9795o(r4, r3, r0)
            r2.m13396F(r3)
            int r9 = r2.m13398a()
            r0 = 5
            if (r9 < r0) goto L46
            int r9 = r2.m13418u()
            r0 = 127(0x7f, float:1.78E-43)
            if (r9 != r0) goto L46
            long r4 = r2.m13419v()
            r6 = 1179402563(0x464c4143, double:5.82702289E-315)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L46
            r9 = 1
            goto L47
        L46:
            r9 = 0
        L47:
            if (r9 == 0) goto L51
            u4.b r9 = new u4.b
            r9.<init>()
        L4e:
            r8.f24579b = r9
            goto L8c
        L51:
            r2.m13396F(r3)
            boolean r9 = p216m4.C4359d0.m9783c(r1, r2, r1)     // Catch: p088f4.C2044s0 -> L59
            goto L5a
        L59:
            r9 = 0
        L5a:
            if (r9 == 0) goto L62
            u4.i r9 = new u4.i
            r9.<init>()
            goto L4e
        L62:
            r2.m13396F(r3)
            int r9 = r2.m13398a()
            byte[] r0 = p351u4.C6301g.f24593o
            int r4 = r0.length
            if (r9 >= r4) goto L70
            r9 = 0
            goto L84
        L70:
            int r9 = r0.length
            byte[] r9 = new byte[r9]
            int r4 = r0.length
            byte[] r5 = r2.f25710a
            int r6 = r2.f25711b
            java.lang.System.arraycopy(r5, r6, r9, r3, r4)
            int r5 = r2.f25711b
            int r5 = r5 + r4
            r2.f25711b = r5
            boolean r9 = java.util.Arrays.equals(r9, r0)
        L84:
            if (r9 == 0) goto L8d
            u4.g r9 = new u4.g
            r9.<init>()
            goto L4e
        L8c:
            return r1
        L8d:
            return r3
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r5, long r7) {
            r4 = this;
            u4.h r0 = r4.f24579b
            if (r0 == 0) goto L3d
            u4.d r1 = r0.f24595a
            u4.e r2 = r1.f24581a
            r2.m12940b()
            v5.u r2 = r1.f24582b
            r3 = 0
            r2.m13392B(r3)
            r2 = -1
            r1.f24583c = r2
            r1.f24585e = r3
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L24
            boolean r5 = r0.f24606l
            r5 = r5 ^ 1
            r0.mo12935e(r5)
            goto L3d
        L24:
            int r5 = r0.f24602h
            if (r5 == 0) goto L3d
            int r5 = r0.f24603i
            long r5 = (long) r5
            long r5 = r5 * r7
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r7
            r0.f24599e = r5
            u4.f r7 = r0.f24598d
            int r8 = p371v5.C6552b0.f25624a
            r7.mo12931b(r5)
            r5 = 2
            r0.f24602h = r5
        L3d:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f24578a = r1
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r1) {
            r0 = this;
            boolean r1 = r0.m12936a(r1)     // Catch: p088f4.C2044s0 -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r21, p216m4.C4377v r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            m4.k r2 = r0.f24578a
            p371v5.C6549a.m13292f(r2)
            u4.h r2 = r0.f24579b
            r3 = 0
            if (r2 != 0) goto L1f
            boolean r2 = r20.m12936a(r21)
            if (r2 == 0) goto L18
            r21.mo9790h()
            goto L1f
        L18:
            java.lang.String r1 = "Failed to determine bitstream type"
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r3)
            throw r1
        L1f:
            boolean r2 = r0.f24580c
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L3d
            m4.k r2 = r0.f24578a
            m4.z r2 = r2.mo6048l(r4, r5)
            m4.k r6 = r0.f24578a
            r6.mo6043b()
            u4.h r6 = r0.f24579b
            m4.k r7 = r0.f24578a
            r6.f24597c = r7
            r6.f24596b = r2
            r6.mo12935e(r5)
            r0.f24580c = r5
        L3d:
            u4.h r2 = r0.f24579b
            m4.z r6 = r2.f24596b
            p371v5.C6549a.m13292f(r6)
            int r6 = p371v5.C6552b0.f25624a
            int r6 = r2.f24602h
            r7 = -1
            r10 = 3
            r14 = 2
            if (r6 == 0) goto Led
            if (r6 == r5) goto Le3
            if (r6 == r14) goto L5c
            if (r6 != r10) goto L56
            goto L119
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L5c:
            u4.f r3 = r2.f24598d
            long r11 = r3.mo12932c(r1)
            r13 = 0
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 < 0) goto L6f
            r3 = r22
            r3.f17934a = r11
            r4 = 1
            goto L18f
        L6f:
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 >= 0) goto L7a
            r15 = 2
            long r11 = r11 + r15
            long r11 = -r11
            r2.mo12943b(r11)
        L7a:
            boolean r3 = r2.f24606l
            if (r3 != 0) goto L8e
            u4.f r3 = r2.f24598d
            m4.w r3 = r3.mo12930a()
            p371v5.C6549a.m13292f(r3)
            m4.k r6 = r2.f24597c
            r6.mo6044c(r3)
            r2.f24606l = r5
        L8e:
            long r5 = r2.f24605k
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 > 0) goto La2
            u4.d r3 = r2.f24595a
            boolean r1 = r3.m12938b(r1)
            if (r1 == 0) goto L9d
            goto La2
        L9d:
            r2.f24602h = r10
        L9f:
            r4 = -1
            goto L18f
        La2:
            r2.f24605k = r13
            u4.d r1 = r2.f24595a
            v5.u r1 = r1.f24582b
            long r5 = r2.mo12933c(r1)
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 < 0) goto Ldc
            long r9 = r2.f24601g
            long r11 = r9 + r5
            long r13 = r2.f24599e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 < 0) goto Ldc
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            int r3 = r2.f24603i
            long r11 = (long) r3
            long r14 = r9 / r11
            m4.z r3 = r2.f24596b
            int r9 = r1.f25712c
            r3.mo5972d(r1, r9)
            m4.z r13 = r2.f24596b
            r16 = 1
            int r1 = r1.f25712c
            r18 = 0
            r19 = 0
            r17 = r1
            r13.mo5971c(r14, r16, r17, r18, r19)
            r2.f24599e = r7
        Ldc:
            long r7 = r2.f24601g
            long r7 = r7 + r5
            r2.f24601g = r7
            goto L18f
        Le3:
            long r5 = r2.f24600f
            int r3 = (int) r5
            r1.mo9791i(r3)
            r2.f24602h = r14
            goto L18f
        Led:
            u4.d r6 = r2.f24595a
            boolean r6 = r6.m12938b(r1)
            if (r6 != 0) goto Lf9
            r2.f24602h = r10
            r9 = 0
            goto L117
        Lf9:
            long r11 = r21.mo9797q()
            long r9 = r2.f24600f
            long r11 = r11 - r9
            r2.f24605k = r11
            u4.d r11 = r2.f24595a
            v5.u r11 = r11.f24582b
            u4.h$b r12 = r2.f24604j
            boolean r9 = r2.mo12934d(r11, r9, r12)
            if (r9 == 0) goto L116
            long r9 = r21.mo9797q()
            r2.f24600f = r9
            r10 = 3
            goto Led
        L116:
            r9 = 1
        L117:
            if (r9 != 0) goto L11a
        L119:
            goto L9f
        L11a:
            u4.h$b r6 = r2.f24604j
            f4.e0 r6 = r6.f24608a
            int r9 = r6.f8910x0
            r2.f24603i = r9
            boolean r9 = r2.f24607m
            if (r9 != 0) goto L12d
            m4.z r9 = r2.f24596b
            r9.mo5973e(r6)
            r2.f24607m = r5
        L12d:
            u4.h$b r6 = r2.f24604j
            u4.f r6 = r6.f24609b
            if (r6 == 0) goto L134
            goto L141
        L134:
            long r9 = r21.mo9786a()
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L145
            u4.h$c r6 = new u4.h$c
            r6.<init>(r3)
        L141:
            r2.f24598d = r6
            r1 = 2
            goto L16f
        L145:
            u4.d r3 = r2.f24595a
            u4.e r3 = r3.f24581a
            int r6 = r3.f24586a
            r6 = r6 & 4
            if (r6 == 0) goto L152
            r18 = 1
            goto L154
        L152:
            r18 = 0
        L154:
            u4.a r5 = new u4.a
            long r10 = r2.f24600f
            long r12 = r21.mo9786a()
            int r1 = r3.f24589d
            int r6 = r3.f24590e
            int r1 = r1 + r6
            long r6 = (long) r1
            long r8 = r3.f24587b
            r16 = r8
            r8 = r5
            r9 = r2
            r1 = 2
            r14 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18)
            r2.f24598d = r5
        L16f:
            r2.f24602h = r1
            u4.d r1 = r2.f24595a
            v5.u r2 = r1.f24582b
            byte[] r3 = r2.f25710a
            int r5 = r3.length
            r6 = 65025(0xfe01, float:9.112E-41)
            if (r5 != r6) goto L17e
            goto L18f
        L17e:
            int r5 = r2.f25712c
            int r5 = java.lang.Math.max(r6, r5)
            byte[] r3 = java.util.Arrays.copyOf(r3, r5)
            v5.u r1 = r1.f24582b
            int r1 = r1.f25712c
            r2.m13394D(r3, r1)
        L18f:
            return r4
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
