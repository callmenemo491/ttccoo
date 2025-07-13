package p370v4;

/* renamed from: v4.b */
/* loaded from: classes.dex */
public final class C6520b implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p216m4.C4355b0 f25275a;

    /* renamed from: b */
    public final p371v5.C6571u f25276b;

    /* renamed from: c */
    public final java.lang.String f25277c;

    /* renamed from: d */
    public java.lang.String f25278d;

    /* renamed from: e */
    public p216m4.InterfaceC4381z f25279e;

    /* renamed from: f */
    public int f25280f;

    /* renamed from: g */
    public int f25281g;

    /* renamed from: h */
    public boolean f25282h;

    /* renamed from: i */
    public long f25283i;

    /* renamed from: j */
    public p088f4.C2003e0 f25284j;

    /* renamed from: k */
    public int f25285k;

    /* renamed from: l */
    public long f25286l;

    public C6520b(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            m4.b0 r0 = new m4.b0
            r1 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r1]
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f25275a = r0
            v5.u r1 = new v5.u
            java.lang.Object r0 = r0.f17870b
            byte[] r0 = (byte[]) r0
            r1.<init>(r0)
            r4.f25276b = r1
            r0 = 0
            r4.f25280f = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f25286l = r0
            r4.f25277c = r5
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25280f = r0
            r2.f25281g = r0
            r2.f25282h = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25286l = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            m4.z r2 = r0.f25279e
            p371v5.C6549a.m13292f(r2)
        L9:
            int r2 = r23.m13398a()
            if (r2 <= 0) goto L38d
            int r2 = r0.f25280f
            r3 = 11
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L353
            if (r2 == r6) goto L55
            if (r2 == r4) goto L1d
            goto L9
        L1d:
            int r2 = r23.m13398a()
            int r3 = r0.f25285k
            int r4 = r0.f25281g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            m4.z r3 = r0.f25279e
            r3.mo5972d(r1, r2)
            int r3 = r0.f25281g
            int r3 = r3 + r2
            r0.f25281g = r3
            int r10 = r0.f25285k
            if (r3 != r10) goto L9
            long r7 = r0.f25286l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L52
            m4.z r6 = r0.f25279e
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo5971c(r7, r9, r10, r11, r12)
            long r2 = r0.f25286l
            long r6 = r0.f25283i
            long r2 = r2 + r6
            r0.f25286l = r2
        L52:
            r0.f25280f = r5
            goto L9
        L55:
            v5.u r2 = r0.f25276b
            byte[] r2 = r2.f25710a
            int r7 = r23.m13398a()
            int r8 = r0.f25281g
            r9 = 128(0x80, float:1.8E-43)
            int r8 = 128 - r8
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0.f25281g
            byte[] r10 = r1.f25710a
            int r11 = r1.f25711b
            java.lang.System.arraycopy(r10, r11, r2, r8, r7)
            int r2 = r1.f25711b
            int r2 = r2 + r7
            r1.f25711b = r2
            int r2 = r0.f25281g
            int r2 = r2 + r7
            r0.f25281g = r2
            if (r2 != r9) goto L7e
            r2 = 1
            goto L7f
        L7e:
            r2 = 0
        L7f:
            if (r2 == 0) goto L9
            m4.b0 r2 = r0.f25275a
            r2.m9772q(r5)
            m4.b0 r2 = r0.f25275a
            int r7 = r2.m9763h()
            r8 = 40
            r2.m9775t(r8)
            r8 = 5
            int r10 = r2.m9766k(r8)
            r11 = 10
            if (r10 <= r11) goto L9c
            r10 = 1
            goto L9d
        L9c:
            r10 = 0
        L9d:
            r2.m9772q(r7)
            r7 = -1
            r12 = 8
            r13 = 3
            if (r10 == 0) goto L2ab
            r10 = 16
            r2.m9775t(r10)
            int r15 = r2.m9766k(r4)
            if (r15 == 0) goto Lba
            if (r15 == r6) goto Lb8
            if (r15 == r4) goto Lb6
            goto Lbb
        Lb6:
            r7 = 2
            goto Lbb
        Lb8:
            r7 = 1
            goto Lbb
        Lba:
            r7 = 0
        Lbb:
            r2.m9775t(r13)
            int r3 = r2.m9766k(r3)
            int r3 = r3 + r6
            int r3 = r3 * 2
            int r15 = r2.m9766k(r4)
            if (r15 != r13) goto Ld6
            int[] r16 = p121h4.C2457b.f10961c
            int r17 = r2.m9766k(r4)
            r16 = r16[r17]
            r5 = 6
            r9 = 3
            goto Le8
        Ld6:
            int r16 = r2.m9766k(r4)
            int[] r17 = p121h4.C2457b.f10959a
            r17 = r17[r16]
            int[] r18 = p121h4.C2457b.f10960b
            r18 = r18[r15]
            r9 = r16
            r5 = r17
            r16 = r18
        Le8:
            int r14 = r5 * 256
            int r4 = r2.m9766k(r13)
            boolean r20 = r2.m9765j()
            int[] r21 = p121h4.C2457b.f10962d
            r21 = r21[r4]
            int r21 = r21 + r20
            r2.m9775t(r11)
            boolean r11 = r2.m9765j()
            if (r11 == 0) goto L104
            r2.m9775t(r12)
        L104:
            if (r4 != 0) goto L112
            r2.m9775t(r8)
            boolean r11 = r2.m9765j()
            if (r11 == 0) goto L112
            r2.m9775t(r12)
        L112:
            if (r7 != r6) goto L11d
            boolean r11 = r2.m9765j()
            if (r11 == 0) goto L11d
            r2.m9775t(r10)
        L11d:
            boolean r10 = r2.m9765j()
            r11 = 4
            if (r10 == 0) goto L243
            r10 = 2
            if (r4 <= r10) goto L12a
            r2.m9775t(r10)
        L12a:
            r19 = r4 & 1
            if (r19 == 0) goto L135
            if (r4 <= r10) goto L135
            r10 = 6
            r2.m9775t(r10)
            goto L136
        L135:
            r10 = 6
        L136:
            r18 = r4 & 4
            if (r18 == 0) goto L13d
            r2.m9775t(r10)
        L13d:
            if (r20 == 0) goto L148
            boolean r10 = r2.m9765j()
            if (r10 == 0) goto L148
            r2.m9775t(r8)
        L148:
            if (r7 != 0) goto L243
            boolean r10 = r2.m9765j()
            if (r10 == 0) goto L155
            r10 = 6
            r2.m9775t(r10)
            goto L156
        L155:
            r10 = 6
        L156:
            if (r4 != 0) goto L161
            boolean r18 = r2.m9765j()
            if (r18 == 0) goto L161
            r2.m9775t(r10)
        L161:
            boolean r18 = r2.m9765j()
            if (r18 == 0) goto L16a
            r2.m9775t(r10)
        L16a:
            r10 = 2
            int r12 = r2.m9766k(r10)
            if (r12 != r6) goto L177
            r2.m9775t(r8)
        L174:
            r6 = 2
            goto L210
        L177:
            if (r12 != r10) goto L17f
            r10 = 12
            r2.m9775t(r10)
            goto L174
        L17f:
            if (r12 != r13) goto L174
            int r10 = r2.m9766k(r8)
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1e5
            r2.m9775t(r8)
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L197
            r2.m9775t(r11)
        L197:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1a0
            r2.m9775t(r11)
        L1a0:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1a9
            r2.m9775t(r11)
        L1a9:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1b2
            r2.m9775t(r11)
        L1b2:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1bb
            r2.m9775t(r11)
        L1bb:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1c4
            r2.m9775t(r11)
        L1c4:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1cd
            r2.m9775t(r11)
        L1cd:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1e5
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1dc
            r2.m9775t(r11)
        L1dc:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L1e5
            r2.m9775t(r11)
        L1e5:
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L204
            r2.m9775t(r8)
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L204
            r12 = 7
            r2.m9775t(r12)
            boolean r12 = r2.m9765j()
            if (r12 == 0) goto L204
            r12 = 8
            r2.m9775t(r12)
            goto L206
        L204:
            r12 = 8
        L206:
            r6 = 2
            int r10 = r10 + r6
            int r10 = r10 * 8
            r2.m9775t(r10)
            r2.m9758c()
        L210:
            if (r4 >= r6) goto L228
            boolean r6 = r2.m9765j()
            r10 = 14
            if (r6 == 0) goto L21d
            r2.m9775t(r10)
        L21d:
            if (r4 != 0) goto L228
            boolean r6 = r2.m9765j()
            if (r6 == 0) goto L228
            r2.m9775t(r10)
        L228:
            boolean r6 = r2.m9765j()
            if (r6 == 0) goto L243
            if (r9 != 0) goto L234
            r2.m9775t(r8)
            goto L243
        L234:
            r6 = 0
        L235:
            if (r6 >= r5) goto L243
            boolean r10 = r2.m9765j()
            if (r10 == 0) goto L240
            r2.m9775t(r8)
        L240:
            int r6 = r6 + 1
            goto L235
        L243:
            boolean r5 = r2.m9765j()
            if (r5 == 0) goto L276
            r2.m9775t(r8)
            r5 = 2
            if (r4 != r5) goto L252
            r2.m9775t(r11)
        L252:
            r6 = 6
            if (r4 < r6) goto L258
            r2.m9775t(r5)
        L258:
            boolean r5 = r2.m9765j()
            if (r5 == 0) goto L264
            r5 = 8
            r2.m9775t(r5)
            goto L266
        L264:
            r5 = 8
        L266:
            if (r4 != 0) goto L271
            boolean r4 = r2.m9765j()
            if (r4 == 0) goto L271
            r2.m9775t(r5)
        L271:
            if (r15 >= r13) goto L276
            r2.m9774s()
        L276:
            if (r7 != 0) goto L27d
            if (r9 == r13) goto L27d
            r2.m9774s()
        L27d:
            r4 = 2
            if (r7 != r4) goto L28d
            if (r9 == r13) goto L288
            boolean r4 = r2.m9765j()
            if (r4 == 0) goto L28d
        L288:
            r4 = 6
            r2.m9775t(r4)
            goto L28e
        L28d:
            r4 = 6
        L28e:
            boolean r5 = r2.m9765j()
            if (r5 == 0) goto L2a6
            int r4 = r2.m9766k(r4)
            r5 = 1
            if (r4 != r5) goto L2a6
            r4 = 8
            int r2 = r2.m9766k(r4)
            if (r2 != r5) goto L2a6
            java.lang.String r2 = "audio/eac3-joc"
            goto L2a8
        L2a6:
            java.lang.String r2 = "audio/eac3"
        L2a8:
            r7 = r16
            goto L2fb
        L2ab:
            r3 = 32
            r2.m9775t(r3)
            r3 = 2
            int r4 = r2.m9766k(r3)
            if (r4 != r13) goto L2b9
            r3 = 0
            goto L2bb
        L2b9:
            java.lang.String r3 = "audio/ac3"
        L2bb:
            r5 = 6
            int r5 = r2.m9766k(r5)
            int r5 = p121h4.C2457b.m6239a(r4, r5)
            r6 = 8
            r2.m9775t(r6)
            int r6 = r2.m9766k(r13)
            r8 = r6 & 1
            if (r8 == 0) goto L2d9
            r8 = 1
            if (r6 == r8) goto L2d9
            r8 = 2
            r2.m9775t(r8)
            goto L2da
        L2d9:
            r8 = 2
        L2da:
            r9 = r6 & 4
            if (r9 == 0) goto L2e1
            r2.m9775t(r8)
        L2e1:
            if (r6 != r8) goto L2e6
            r2.m9775t(r8)
        L2e6:
            int[] r8 = p121h4.C2457b.f10960b
            int r9 = r8.length
            if (r4 >= r9) goto L2ed
            r7 = r8[r4]
        L2ed:
            boolean r2 = r2.m9765j()
            int[] r4 = p121h4.C2457b.f10962d
            r4 = r4[r6]
            int r21 = r4 + r2
            r14 = 1536(0x600, float:2.152E-42)
            r2 = r3
            r3 = r5
        L2fb:
            r4 = r21
            f4.e0 r5 = r0.f25284j
            if (r5 == 0) goto L311
            int r6 = r5.f8909w0
            if (r4 != r6) goto L311
            int r6 = r5.f8910x0
            if (r7 != r6) goto L311
            java.lang.String r5 = r5.f8896j0
            boolean r5 = p371v5.C6552b0.m13308a(r2, r5)
            if (r5 != 0) goto L32f
        L311:
            f4.e0$b r5 = new f4.e0$b
            r5.<init>()
            java.lang.String r6 = r0.f25278d
            r5.f8917a = r6
            r5.f8927k = r2
            r5.f8940x = r4
            r5.f8941y = r7
            java.lang.String r2 = r0.f25277c
            r5.f8919c = r2
            f4.e0 r2 = r5.m5193a()
            r0.f25284j = r2
            m4.z r4 = r0.f25279e
            r4.mo5973e(r2)
        L32f:
            r0.f25285k = r3
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = (long) r14
            long r4 = r4 * r2
            f4.e0 r2 = r0.f25284j
            int r2 = r2.f8910x0
            long r2 = (long) r2
            long r4 = r4 / r2
            r0.f25283i = r4
            v5.u r2 = r0.f25276b
            r3 = 0
            r2.m13396F(r3)
            m4.z r2 = r0.f25279e
            v5.u r3 = r0.f25276b
            r4 = 128(0x80, float:1.8E-43)
            r2.mo5972d(r3, r4)
            r2 = 2
            r0.f25280f = r2
            goto L9
        L353:
            int r2 = r23.m13398a()
            r4 = 119(0x77, float:1.67E-43)
            if (r2 <= 0) goto L379
            boolean r2 = r0.f25282h
            if (r2 != 0) goto L366
            int r2 = r23.m13418u()
            if (r2 != r3) goto L375
            goto L373
        L366:
            int r2 = r23.m13418u()
            if (r2 != r4) goto L371
            r5 = 0
            r0.f25282h = r5
            r5 = 1
            goto L37a
        L371:
            if (r2 != r3) goto L375
        L373:
            r5 = 1
            goto L376
        L375:
            r5 = 0
        L376:
            r0.f25282h = r5
            goto L353
        L379:
            r5 = 0
        L37a:
            if (r5 == 0) goto L9
            r2 = 1
            r0.f25280f = r2
            v5.u r5 = r0.f25276b
            byte[] r5 = r5.f25710a
            r6 = 0
            r5[r6] = r3
            r5[r2] = r4
            r2 = 2
            r0.f25281g = r2
            goto L9
        L38d:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r1 = this;
            r3.m13253a()
            java.lang.String r0 = r3.m13254b()
            r1.f25278d = r0
            int r3 = r3.m13255c()
            r0 = 1
            m4.z r2 = r2.mo6048l(r3, r0)
            r1.f25279e = r2
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r0 = this;
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.f25286l = r3
        Lb:
            return
    }
}
