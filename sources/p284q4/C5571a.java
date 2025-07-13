package p284q4;

/* renamed from: q4.a */
/* loaded from: classes.dex */
public final class C5571a implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final p371v5.C6571u f21695a;

    /* renamed from: b */
    public p216m4.InterfaceC4366k f21696b;

    /* renamed from: c */
    public int f21697c;

    /* renamed from: d */
    public int f21698d;

    /* renamed from: e */
    public int f21699e;

    /* renamed from: f */
    public long f21700f;

    /* renamed from: g */
    public p070e5.C1517b f21701g;

    /* renamed from: h */
    public p216m4.InterfaceC4365j f21702h;

    /* renamed from: i */
    public p284q4.C5573c f21703i;

    /* renamed from: j */
    public p336t4.C6163h f21704j;

    public C5571a() {
            r2 = this;
            r2.<init>()
            v5.u r0 = new v5.u
            r1 = 6
            r0.<init>(r1)
            r2.f21695a = r0
            r0 = -1
            r2.f21700f = r0
            return
    }

    /* renamed from: a */
    public final void m11861a() {
            r6 = this;
            r0 = 0
            y4.a$b[] r0 = new p427y4.C7110a.b[r0]
            r6.m11862d(r0)
            m4.k r0 = r6.f21696b
            java.util.Objects.requireNonNull(r0)
            r0.mo6043b()
            m4.k r0 = r6.f21696b
            m4.w$b r1 = new m4.w$b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r1.<init>(r2, r4)
            r0.mo6044c(r1)
            r0 = 6
            r6.f21697c = r0
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r4 = 0
            r3.f21697c = r4
            r4 = 0
            r3.f21704j = r4
            goto L1a
        Ld:
            int r0 = r3.f21697c
            r1 = 5
            if (r0 != r1) goto L1a
            t4.h r0 = r3.f21704j
            java.util.Objects.requireNonNull(r0)
            r0.mo9803b(r4, r6)
        L1a:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f21696b = r1
            return
    }

    /* renamed from: d */
    public final void m11862d(p427y4.C7110a.b... r4) {
            r3 = this;
            m4.k r0 = r3.f21696b
            java.util.Objects.requireNonNull(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 4
            m4.z r0 = r0.mo6048l(r1, r2)
            f4.e0$b r1 = new f4.e0$b
            r1.<init>()
            java.lang.String r2 = "image/jpeg"
            r1.f8926j = r2
            y4.a r2 = new y4.a
            r2.<init>(r4)
            r1.f8925i = r2
            f4.e0 r4 = r1.m5193a()
            r0.mo5973e(r4)
            return
    }

    /* renamed from: e */
    public final int m11863e(p216m4.InterfaceC4365j r4) {
            r3 = this;
            v5.u r0 = r3.f21695a
            r1 = 2
            r0.m13392B(r1)
            v5.u r0 = r3.f21695a
            byte[] r0 = r0.f25710a
            r2 = 0
            r4.mo9795o(r0, r2, r1)
            v5.u r4 = r3.f21695a
            int r4 = r4.m13423z()
            return r4
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r7) {
            r6 = this;
            int r0 = r6.m11863e(r7)
            r1 = 0
            r2 = 65496(0xffd8, float:9.178E-41)
            if (r0 == r2) goto Lb
            return r1
        Lb:
            int r0 = r6.m11863e(r7)
            r6.f21698d = r0
            r2 = 65504(0xffe0, float:9.179E-41)
            r3 = 2
            if (r0 != r2) goto L33
            v5.u r0 = r6.f21695a
            r0.m13392B(r3)
            v5.u r0 = r6.f21695a
            byte[] r0 = r0.f25710a
            r7.mo9795o(r0, r1, r3)
            v5.u r0 = r6.f21695a
            int r0 = r0.m13423z()
            int r0 = r0 - r3
            r7.mo9796p(r0)
            int r0 = r6.m11863e(r7)
            r6.f21698d = r0
        L33:
            int r0 = r6.f21698d
            r2 = 65505(0xffe1, float:9.1792E-41)
            if (r0 == r2) goto L3b
            return r1
        L3b:
            r7.mo9796p(r3)
            v5.u r0 = r6.f21695a
            r2 = 6
            r0.m13392B(r2)
            v5.u r0 = r6.f21695a
            byte[] r0 = r0.f25710a
            r7.mo9795o(r0, r1, r2)
            v5.u r7 = r6.f21695a
            long r2 = r7.m13419v()
            r4 = 1165519206(0x45786966, double:5.758429993E-315)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L61
            v5.u r7 = r6.f21695a
            int r7 = r7.m13423z()
            if (r7 != 0) goto L61
            r1 = 1
        L61:
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r27, p216m4.C4377v r28) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = r0.f21697c
            r4 = -1
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L1ad
            if (r3 == r8) goto L195
            r10 = -1
            if (r3 == r7) goto Lae
            r4 = 5
            if (r3 == r6) goto L4c
            if (r3 == r4) goto L24
            r1 = 6
            if (r3 != r1) goto L1e
            return r10
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L24:
            q4.c r3 = r0.f21703i
            if (r3 == 0) goto L2c
            m4.j r3 = r0.f21702h
            if (r1 == r3) goto L37
        L2c:
            r0.f21702h = r1
            q4.c r3 = new q4.c
            long r4 = r0.f21700f
            r3.<init>(r1, r4)
            r0.f21703i = r3
        L37:
            t4.h r1 = r0.f21704j
            java.util.Objects.requireNonNull(r1)
            q4.c r3 = r0.f21703i
            int r1 = r1.mo9806i(r3, r2)
            if (r1 != r8) goto L4b
            long r3 = r2.f17934a
            long r5 = r0.f21700f
            long r3 = r3 + r5
            r2.f17934a = r3
        L4b:
            return r1
        L4c:
            long r5 = r27.mo9797q()
            long r10 = r0.f21700f
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto L59
            r2.f17934a = r10
            return r8
        L59:
            v5.u r2 = r0.f21695a
            byte[] r2 = r2.f25710a
            boolean r2 = r1.mo9793m(r2, r9, r8, r8)
            if (r2 != 0) goto L64
            goto Laa
        L64:
            r27.mo9790h()
            t4.h r2 = r0.f21704j
            if (r2 != 0) goto L72
            t4.h r2 = new t4.h
            r2.<init>(r9)
            r0.f21704j = r2
        L72:
            q4.c r2 = new q4.c
            long r5 = r0.f21700f
            r2.<init>(r1, r5)
            r0.f21703i = r2
            t4.h r1 = r0.f21704j
            int r1 = r1.f23819a
            r1 = r1 & r7
            if (r1 == 0) goto L84
            r1 = 1
            goto L85
        L84:
            r1 = 0
        L85:
            boolean r1 = p336t4.C6166k.m12732a(r2, r9, r1)
            if (r1 == 0) goto Laa
            t4.h r1 = r0.f21704j
            q4.d r2 = new q4.d
            long r5 = r0.f21700f
            m4.k r3 = r0.f21696b
            java.util.Objects.requireNonNull(r3)
            r2.<init>(r5, r3)
            r1.f23836r = r2
            y4.a$b[] r1 = new p427y4.C7110a.b[r8]
            e5.b r2 = r0.f21701g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m11862d(r1)
            r0.f21697c = r4
            goto Lad
        Laa:
            r26.m11861a()
        Lad:
            return r9
        Lae:
            int r2 = r0.f21698d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L18d
            int r2 = r0.f21699e
            byte[] r3 = new byte[r2]
            r1.readFully(r3, r9, r2)
            e5.b r6 = r0.f21701g
            if (r6 != 0) goto L192
            int r6 = r2 + 0
            r8 = 0
            if (r6 != 0) goto Lc8
            r11 = r8
            r6 = 0
            goto Ldc
        Lc8:
            r6 = 0
        Lc9:
            if (r6 >= r2) goto Ld2
            r11 = r3[r6]
            if (r11 == 0) goto Ld2
            int r6 = r6 + 1
            goto Lc9
        Ld2:
            int r11 = r6 + 0
            java.lang.String r11 = p371v5.C6552b0.m13320m(r3, r9, r11)
            if (r6 >= r2) goto Ldc
            int r6 = r6 + 1
        Ldc:
            java.lang.String r12 = "http://ns.adobe.com/xap/1.0/"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L192
            int r11 = r2 - r6
            if (r11 != 0) goto Lea
            r2 = r8
            goto Lf9
        Lea:
            r11 = r6
        Leb:
            if (r11 >= r2) goto Lf4
            r12 = r3[r11]
            if (r12 == 0) goto Lf4
            int r11 = r11 + 1
            goto Leb
        Lf4:
            int r11 = r11 - r6
            java.lang.String r2 = p371v5.C6552b0.m13320m(r3, r6, r11)
        Lf9:
            if (r2 == 0) goto L192
            long r11 = r27.mo9786a()
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto L105
            goto L184
        L105:
            q4.b r1 = p284q4.C5575e.m11864a(r2)     // Catch: java.lang.Throwable -> L10a
            goto L112
        L10a:
            java.lang.String r1 = "MotionPhotoXmpParser"
            java.lang.String r2 = "Ignoring unexpected XMP metadata"
            android.util.Log.w(r1, r2)
            r1 = r8
        L112:
            if (r1 != 0) goto L116
            goto L184
        L116:
            java.util.List<q4.b$a> r2 = r1.f21706b
            int r2 = r2.size()
            if (r2 >= r7) goto L120
            goto L184
        L120:
            java.util.List<q4.b$a> r2 = r1.f21706b
            int r2 = r2.size()
            int r2 = r2 + r10
            r14 = r4
            r16 = r14
            r20 = r16
            r22 = r20
            r3 = 0
        L12f:
            if (r2 < 0) goto L169
            java.util.List<q4.b$a> r6 = r1.f21706b
            java.lang.Object r6 = r6.get(r2)
            q4.b$a r6 = (p284q4.C5572b.a) r6
            java.lang.String r7 = r6.f21707a
            java.lang.String r10 = "video/mp4"
            boolean r7 = r10.equals(r7)
            r3 = r3 | r7
            if (r2 != 0) goto L14d
            r18 = 0
            long r6 = r6.f21709c
            long r11 = r11 - r6
            r6 = r11
            r11 = r18
            goto L156
        L14d:
            long r6 = r6.f21708b
            long r6 = r11 - r6
            r24 = r6
            r6 = r11
            r11 = r24
        L156:
            if (r3 == 0) goto L161
            int r10 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r10 == 0) goto L161
            long r22 = r6 - r11
            r20 = r11
            r3 = 0
        L161:
            if (r2 != 0) goto L166
            r16 = r6
            r14 = r11
        L166:
            int r2 = r2 + (-1)
            goto L12f
        L169:
            int r2 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r2 == 0) goto L184
            int r2 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r2 == 0) goto L184
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 == 0) goto L184
            int r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r2 != 0) goto L17a
            goto L184
        L17a:
            e5.b r8 = new e5.b
            long r1 = r1.f21705a
            r13 = r8
            r18 = r1
            r13.<init>(r14, r16, r18, r20, r22)
        L184:
            r0.f21701g = r8
            if (r8 == 0) goto L192
            long r1 = r8.f7371b0
            r0.f21700f = r1
            goto L192
        L18d:
            int r2 = r0.f21699e
            r1.mo9791i(r2)
        L192:
            r0.f21697c = r9
            return r9
        L195:
            v5.u r2 = r0.f21695a
            r2.m13392B(r7)
            v5.u r2 = r0.f21695a
            byte[] r2 = r2.f25710a
            r1.readFully(r2, r9, r7)
            v5.u r1 = r0.f21695a
            int r1 = r1.m13423z()
            int r1 = r1 - r7
            r0.f21699e = r1
            r0.f21697c = r7
            return r9
        L1ad:
            v5.u r2 = r0.f21695a
            r2.m13392B(r7)
            v5.u r2 = r0.f21695a
            byte[] r2 = r2.f25710a
            r1.readFully(r2, r9, r7)
            v5.u r1 = r0.f21695a
            int r1 = r1.m13423z()
            r0.f21698d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L1d1
            long r1 = r0.f21700f
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L1cd
            goto L1e1
        L1cd:
            r26.m11861a()
            goto L1e3
        L1d1:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L1db
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L1e3
        L1db:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L1e3
            r6 = 1
        L1e1:
            r0.f21697c = r6
        L1e3:
            return r9
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r1 = this;
            t4.h r0 = r1.f21704j
            if (r0 == 0) goto L7
            java.util.Objects.requireNonNull(r0)
        L7:
            return
    }
}
