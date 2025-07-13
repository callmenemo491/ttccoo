package p370v4;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class C6518a implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final p370v4.C6520b f25268a;

    /* renamed from: b */
    public final p371v5.C6571u f25269b;

    /* renamed from: c */
    public boolean f25270c;

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3658h0
            return
    }

    public C6518a() {
            r2 = this;
            r2.<init>()
            v4.b r0 = new v4.b
            r1 = 0
            r0.<init>(r1)
            r2.f25268a = r0
            v5.u r0 = new v5.u
            r1 = 2786(0xae2, float:3.904E-42)
            r0.<init>(r1)
            r2.f25269b = r0
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.f25270c = r1
            v4.b r1 = r0.f25268a
            r1.mo13241a()
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r6) {
            r5 = this;
            v4.b r0 = r5.f25268a
            java.lang.String r1 = ""
            int r2 = r1.length()
            int r2 = r2 + 11
            r3 = 0
            java.lang.String r1 = p064e.C1490d.m4039a(r2, r1, r3)
            r0.f25278d = r1
            r1 = 1
            m4.z r1 = r6.mo6048l(r3, r1)
            r0.f25279e = r1
            r6.mo6043b()
            m4.w$b r0 = new m4.w$b
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r0.<init>(r1, r3)
            r6.mo6044c(r0)
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r14) {
            r13 = this;
            v5.u r0 = new v5.u
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f25710a
            r14.mo9795o(r4, r2, r1)
            r0.m13396F(r2)
            int r4 = r0.m13420w()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L85
            r14.mo9790h()
            r14.mo9796p(r3)
            r5 = r3
        L22:
            r4 = 0
        L23:
            byte[] r7 = r0.f25710a
            r8 = 6
            r14.mo9795o(r7, r2, r8)
            r0.m13396F(r2)
            int r7 = r0.m13423z()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L44
            r14.mo9790h()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.148E-41)
            if (r4 < r7) goto L40
            return r2
        L40:
            r14.mo9796p(r5)
            goto L22
        L44:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 < r9) goto L4a
            return r7
        L4a:
            byte[] r10 = r0.f25710a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L52
            r9 = -1
            goto L7c
        L52:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r6
            if (r11 <= r1) goto L5c
            r11 = 1
            goto L5d
        L5c:
            r11 = 0
        L5d:
            if (r11 == 0) goto L6f
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r7
            int r9 = r9 * 2
            goto L7c
        L6f:
            r7 = r10[r9]
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r7 = r7 >> r8
            r8 = r10[r9]
            r8 = r8 & 63
            int r9 = p121h4.C2457b.m6239a(r7, r8)
        L7c:
            if (r9 != r12) goto L7f
            return r2
        L7f:
            int r9 = r9 + (-6)
            r14.mo9796p(r9)
            goto L23
        L85:
            r0.m13397G(r6)
            int r4 = r0.m13417t()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.mo9796p(r4)
            goto L9
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r5, p216m4.C4377v r6) {
            r4 = this;
            v5.u r6 = r4.f25269b
            byte[] r6 = r6.f25710a
            r0 = 2786(0xae2, float:3.904E-42)
            r1 = 0
            int r5 = r5.mo6020b(r6, r1, r0)
            r6 = -1
            if (r5 != r6) goto Lf
            return r6
        Lf:
            v5.u r6 = r4.f25269b
            r6.m13396F(r1)
            v5.u r6 = r4.f25269b
            r6.m13395E(r5)
            boolean r5 = r4.f25270c
            if (r5 != 0) goto L28
            v4.b r5 = r4.f25268a
            r2 = 0
            r6 = 4
            r5.mo13245f(r2, r6)
            r5 = 1
            r4.f25270c = r5
        L28:
            v4.b r5 = r4.f25268a
            v5.u r6 = r4.f25269b
            r5.mo13242c(r6)
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
