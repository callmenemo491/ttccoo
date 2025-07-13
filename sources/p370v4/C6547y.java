package p370v4;

/* renamed from: v4.y */
/* loaded from: classes.dex */
public final class C6547y implements p370v4.InterfaceC6525d0 {

    /* renamed from: a */
    public final p370v4.InterfaceC6546x f25614a;

    /* renamed from: b */
    public final p371v5.C6571u f25615b;

    /* renamed from: c */
    public int f25616c;

    /* renamed from: d */
    public int f25617d;

    /* renamed from: e */
    public boolean f25618e;

    /* renamed from: f */
    public boolean f25619f;

    public C6547y(p370v4.InterfaceC6546x r2) {
            r1 = this;
            r1.<init>()
            r1.f25614a = r2
            v5.u r2 = new v5.u
            r0 = 32
            r2.<init>(r0)
            r1.f25615b = r2
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: a */
    public void mo13249a() {
            r1 = this;
            r0 = 1
            r1.f25619f = r0
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: b */
    public void mo13250b(p371v5.C6576z r2, p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r1 = this;
            v4.x r0 = r1.f25614a
            r0.mo13247b(r2, r3, r4)
            r2 = 1
            r1.f25619f = r2
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: c */
    public void mo13251c(p371v5.C6571u r11, int r12) {
            r10 = this;
            r0 = 1
            r12 = r12 & r0
            r1 = 0
            if (r12 == 0) goto L7
            r12 = 1
            goto L8
        L7:
            r12 = 0
        L8:
            r2 = -1
            if (r12 == 0) goto L13
            int r3 = r11.m13418u()
            int r4 = r11.f25711b
            int r4 = r4 + r3
            goto L14
        L13:
            r4 = -1
        L14:
            boolean r3 = r10.f25619f
            if (r3 == 0) goto L22
            if (r12 != 0) goto L1b
            return
        L1b:
            r10.f25619f = r1
            r11.m13396F(r4)
        L20:
            r10.f25617d = r1
        L22:
            int r12 = r11.m13398a()
            if (r12 <= 0) goto L102
            int r12 = r10.f25617d
            r3 = 255(0xff, float:3.57E-43)
            r4 = 3
            if (r12 >= r4) goto La2
            if (r12 != 0) goto L40
            int r12 = r11.m13418u()
            int r5 = r11.f25711b
            int r5 = r5 - r0
            r11.m13396F(r5)
            if (r12 != r3) goto L40
            r10.f25619f = r0
            return
        L40:
            int r12 = r11.m13398a()
            int r3 = r10.f25617d
            int r3 = 3 - r3
            int r12 = java.lang.Math.min(r12, r3)
            v5.u r3 = r10.f25615b
            byte[] r3 = r3.f25710a
            int r5 = r10.f25617d
            r11.m13402e(r3, r5, r12)
            int r3 = r10.f25617d
            int r3 = r3 + r12
            r10.f25617d = r3
            if (r3 != r4) goto L22
            v5.u r12 = r10.f25615b
            r12.m13396F(r1)
            v5.u r12 = r10.f25615b
            r12.m13395E(r4)
            v5.u r12 = r10.f25615b
            r12.m13397G(r0)
            v5.u r12 = r10.f25615b
            int r12 = r12.m13418u()
            v5.u r3 = r10.f25615b
            int r3 = r3.m13418u()
            r5 = r12 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L7d
            r5 = 1
            goto L7e
        L7d:
            r5 = 0
        L7e:
            r10.f25618e = r5
            r12 = r12 & 15
            int r12 = r12 << 8
            r12 = r12 | r3
            int r12 = r12 + r4
            r10.f25616c = r12
            v5.u r3 = r10.f25615b
            byte[] r3 = r3.f25710a
            int r4 = r3.length
            if (r4 >= r12) goto L22
            r4 = 4098(0x1002, float:5.743E-42)
            int r3 = r3.length
            int r3 = r3 * 2
            int r12 = java.lang.Math.max(r12, r3)
            int r12 = java.lang.Math.min(r4, r12)
            v5.u r3 = r10.f25615b
            r3.m13399b(r12)
            goto L22
        La2:
            int r12 = r11.m13398a()
            int r4 = r10.f25616c
            int r5 = r10.f25617d
            int r4 = r4 - r5
            int r12 = java.lang.Math.min(r12, r4)
            v5.u r4 = r10.f25615b
            byte[] r4 = r4.f25710a
            int r5 = r10.f25617d
            r11.m13402e(r4, r5, r12)
            int r4 = r10.f25617d
            int r4 = r4 + r12
            r10.f25617d = r4
            int r12 = r10.f25616c
            if (r4 != r12) goto L22
            boolean r4 = r10.f25618e
            if (r4 == 0) goto Lef
            v5.u r4 = r10.f25615b
            byte[] r4 = r4.f25710a
            int r5 = p371v5.C6552b0.f25624a
            r5 = 0
            r6 = -1
        Lcd:
            if (r5 >= r12) goto Le0
            int r7 = r6 << 8
            int[] r8 = p371v5.C6552b0.f25633j
            int r6 = r6 >>> 24
            r9 = r4[r5]
            r9 = r9 & r3
            r6 = r6 ^ r9
            r6 = r6 & r3
            r6 = r8[r6]
            r6 = r6 ^ r7
            int r5 = r5 + 1
            goto Lcd
        Le0:
            if (r6 == 0) goto Le5
            r10.f25619f = r0
            return
        Le5:
            v5.u r12 = r10.f25615b
            int r3 = r10.f25616c
            int r3 = r3 + (-4)
            r12.m13395E(r3)
            goto Lf4
        Lef:
            v5.u r3 = r10.f25615b
            r3.m13395E(r12)
        Lf4:
            v5.u r12 = r10.f25615b
            r12.m13396F(r1)
            v4.x r12 = r10.f25614a
            v5.u r3 = r10.f25615b
            r12.mo13248c(r3)
            goto L20
        L102:
            return
    }
}
