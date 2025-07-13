package p401x;

/* renamed from: x.c */
/* loaded from: classes.dex */
public class C6895c extends p401x.AbstractC6908p {

    /* renamed from: k */
    public java.util.ArrayList<p401x.AbstractC6908p> f26809k;

    /* renamed from: l */
    public int f26810l;

    public C6895c(p381w.C6765f r4, int r5) {
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f26809k = r4
            r3.f26859f = r5
            w.f r4 = r3.f26855b
        Le:
            int r5 = r3.f26859f
            w.f r5 = r4.m13718r(r5)
            if (r5 == 0) goto L18
            r4 = r5
            goto Le
        L18:
            r3.f26855b = r4
            java.util.ArrayList<x.p> r5 = r3.f26809k
            int r0 = r3.f26859f
            r1 = 1
            if (r0 != 0) goto L23
            r0 = r3
            goto L3a
        L23:
            if (r0 != r1) goto L27
            r0 = r3
            goto L3f
        L27:
            r0 = r3
        L28:
            r2 = 0
        L29:
            r5.add(r2)
            int r5 = r0.f26859f
            w.f r4 = r4.m13717q(r5)
            if (r4 == 0) goto L42
            java.util.ArrayList<x.p> r5 = r0.f26809k
            int r2 = r0.f26859f
            if (r2 != 0) goto L3d
        L3a:
            x.l r2 = r4.f26143d
            goto L29
        L3d:
            if (r2 != r1) goto L28
        L3f:
            x.n r2 = r4.f26145e
            goto L29
        L42:
            java.util.ArrayList<x.p> r4 = r0.f26809k
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r4.next()
            x.p r5 = (p401x.AbstractC6908p) r5
            int r2 = r0.f26859f
            if (r2 != 0) goto L5d
            w.f r5 = r5.f26855b
            r5.f26139b = r0
            goto L48
        L5d:
            if (r2 != r1) goto L48
            w.f r5 = r5.f26855b
            r5.f26141c = r0
            goto L48
        L64:
            int r4 = r0.f26859f
            if (r4 != 0) goto L74
            w.f r4 = r0.f26855b
            w.f r4 = r4.f26128R
            w.g r4 = (p381w.C6766g) r4
            boolean r4 = r4.f26197L0
            if (r4 == 0) goto L74
            r4 = 1
            goto L75
        L74:
            r4 = 0
        L75:
            if (r4 == 0) goto L90
            java.util.ArrayList<x.p> r4 = r0.f26809k
            int r4 = r4.size()
            if (r4 <= r1) goto L90
            java.util.ArrayList<x.p> r4 = r0.f26809k
            int r5 = r4.size()
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)
            x.p r4 = (p401x.AbstractC6908p) r4
            w.f r4 = r4.f26855b
            r0.f26855b = r4
        L90:
            int r4 = r0.f26859f
            if (r4 != 0) goto L99
            w.f r4 = r0.f26855b
            int r4 = r4.f26182w0
            goto L9d
        L99:
            w.f r4 = r0.f26855b
            int r4 = r4.f26184x0
        L9d:
            r0.f26810l = r4
            return
    }

    @Override // p401x.AbstractC6908p, p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r27) {
            r26 = this;
            r0 = r26
            w.f$a r1 = p381w.C6765f.a.f26191a0
            x.f r2 = r0.f26861h
            boolean r3 = r2.f26828j
            if (r3 == 0) goto L3e6
            x.f r3 = r0.f26862i
            boolean r4 = r3.f26828j
            if (r4 != 0) goto L12
            goto L3e6
        L12:
            w.f r4 = r0.f26855b
            w.f r4 = r4.f26128R
            if (r4 == 0) goto L21
            boolean r6 = r4 instanceof p381w.C6766g
            if (r6 == 0) goto L21
            w.g r4 = (p381w.C6766g) r4
            boolean r4 = r4.f26197L0
            goto L22
        L21:
            r4 = 0
        L22:
            int r3 = r3.f26825g
            int r2 = r2.f26825g
            int r3 = r3 - r2
            java.util.ArrayList<x.p> r2 = r0.f26809k
            int r2 = r2.size()
            r6 = 0
        L2e:
            r7 = -1
            r8 = 8
            if (r6 >= r2) goto L44
            java.util.ArrayList<x.p> r9 = r0.f26809k
            java.lang.Object r9 = r9.get(r6)
            x.p r9 = (p401x.AbstractC6908p) r9
            w.f r9 = r9.f26855b
            int r9 = r9.f26156j0
            if (r9 != r8) goto L45
            int r6 = r6 + 1
            goto L2e
        L44:
            r6 = -1
        L45:
            int r9 = r2 + (-1)
            r10 = r9
        L48:
            if (r10 < 0) goto L5c
            java.util.ArrayList<x.p> r11 = r0.f26809k
            java.lang.Object r11 = r11.get(r10)
            x.p r11 = (p401x.AbstractC6908p) r11
            w.f r11 = r11.f26855b
            int r11 = r11.f26156j0
            if (r11 != r8) goto L5b
            int r10 = r10 + (-1)
            goto L48
        L5b:
            r7 = r10
        L5c:
            r10 = 0
        L5d:
            r12 = 2
            if (r10 >= r12) goto Lff
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L68:
            if (r14 >= r2) goto Lef
            java.util.ArrayList<x.p> r5 = r0.f26809k
            java.lang.Object r5 = r5.get(r14)
            x.p r5 = (p401x.AbstractC6908p) r5
            w.f r12 = r5.f26855b
            int r11 = r12.f26156j0
            if (r11 != r8) goto L7a
            goto Le8
        L7a:
            int r17 = r17 + 1
            if (r14 <= 0) goto L85
            if (r14 < r6) goto L85
            x.f r11 = r5.f26861h
            int r11 = r11.f26824f
            int r15 = r15 + r11
        L85:
            x.g r11 = r5.f26858e
            int r8 = r11.f26825g
            w.f$a r13 = r5.f26857d
            if (r13 == r1) goto L8f
            r13 = 1
            goto L90
        L8f:
            r13 = 0
        L90:
            if (r13 == 0) goto Lb0
            int r11 = r0.f26859f
            r20 = r8
            if (r11 != 0) goto La1
            x.l r8 = r12.f26143d
            x.g r8 = r8.f26858e
            boolean r8 = r8.f26828j
            if (r8 != 0) goto La1
            return
        La1:
            r8 = 1
            if (r11 != r8) goto Lad
            x.n r11 = r12.f26145e
            x.g r11 = r11.f26858e
            boolean r11 = r11.f26828j
            if (r11 != 0) goto Lad
            return
        Lad:
            r21 = r13
            goto Lc9
        Lb0:
            r20 = r8
            r21 = r13
            r8 = 1
            int r13 = r5.f26854a
            if (r13 != r8) goto Lc0
            if (r10 != 0) goto Lc0
            int r8 = r11.f26840m
            int r16 = r16 + 1
            goto Lc6
        Lc0:
            boolean r8 = r11.f26828j
            if (r8 == 0) goto Lc9
            r8 = r20
        Lc6:
            r21 = 1
            goto Lcb
        Lc9:
            r8 = r20
        Lcb:
            if (r21 != 0) goto Ldd
            int r16 = r16 + 1
            float[] r8 = r12.f26105A0
            int r11 = r0.f26859f
            r8 = r8[r11]
            r11 = 0
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 < 0) goto Lde
            float r18 = r18 + r8
            goto Lde
        Ldd:
            int r15 = r15 + r8
        Lde:
            if (r14 >= r9) goto Le8
            if (r14 >= r7) goto Le8
            x.f r5 = r5.f26862i
            int r5 = r5.f26824f
            int r5 = -r5
            int r15 = r15 + r5
        Le8:
            int r14 = r14 + 1
            r8 = 8
            r12 = 2
            goto L68
        Lef:
            if (r15 < r3) goto Lfa
            if (r16 != 0) goto Lf4
            goto Lfa
        Lf4:
            int r10 = r10 + 1
            r8 = 8
            goto L5d
        Lfa:
            r5 = r16
            r8 = r17
            goto L104
        Lff:
            r5 = 0
            r8 = 0
            r15 = 0
            r18 = 0
        L104:
            x.f r10 = r0.f26861h
            int r10 = r10.f26825g
            if (r4 == 0) goto L10e
            x.f r10 = r0.f26862i
            int r10 = r10.f26825g
        L10e:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r3) goto L11f
            r12 = 1073741824(0x40000000, float:2.0)
            int r13 = r15 - r3
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r11
            int r12 = (int) r13
            if (r4 == 0) goto L11e
            int r10 = r10 + r12
            goto L11f
        L11e:
            int r10 = r10 - r12
        L11f:
            if (r5 <= 0) goto L222
            int r12 = r3 - r15
            float r12 = (float) r12
            float r13 = (float) r5
            float r13 = r12 / r13
            float r13 = r13 + r11
            int r13 = (int) r13
            r14 = 0
            r16 = 0
        L12c:
            if (r14 >= r2) goto L1d5
            java.util.ArrayList<x.p> r11 = r0.f26809k
            java.lang.Object r11 = r11.get(r14)
            x.p r11 = (p401x.AbstractC6908p) r11
            r20 = r13
            w.f r13 = r11.f26855b
            r21 = r15
            int r15 = r13.f26156j0
            r22 = r10
            r10 = 8
            if (r15 != r10) goto L146
            goto L1bd
        L146:
            w.f$a r10 = r11.f26857d
            if (r10 != r1) goto L1bd
            x.g r10 = r11.f26858e
            boolean r15 = r10.f26828j
            if (r15 != 0) goto L1bd
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L166
            float[] r15 = r13.f26105A0
            r23 = r1
            int r1 = r0.f26859f
            r1 = r15[r1]
            float r1 = r1 * r12
            float r1 = r1 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r15
            int r1 = (int) r1
            goto L16a
        L166:
            r23 = r1
            r1 = r20
        L16a:
            int r15 = r0.f26859f
            if (r15 != 0) goto L193
            int r15 = r13.f26167p
            int r13 = r13.f26165o
            r24 = r12
            int r12 = r11.f26854a
            r25 = r4
            r4 = 1
            if (r12 != r4) goto L182
            int r4 = r10.f26840m
            int r4 = java.lang.Math.min(r1, r4)
            goto L183
        L182:
            r4 = r1
        L183:
            int r4 = java.lang.Math.max(r13, r4)
            if (r15 <= 0) goto L18d
            int r4 = java.lang.Math.min(r15, r4)
        L18d:
            if (r4 == r1) goto L1b7
            int r16 = r16 + 1
            r1 = r4
            goto L1b7
        L193:
            r25 = r4
            r24 = r12
            int r4 = r13.f26173s
            int r12 = r13.f26171r
            int r13 = r11.f26854a
            r15 = 1
            if (r13 != r15) goto L1a7
            int r10 = r10.f26840m
            int r10 = java.lang.Math.min(r1, r10)
            goto L1a8
        L1a7:
            r10 = r1
        L1a8:
            int r10 = java.lang.Math.max(r12, r10)
            if (r4 <= 0) goto L1b2
            int r10 = java.lang.Math.min(r4, r10)
        L1b2:
            if (r10 == r1) goto L1b7
            int r16 = r16 + 1
            r1 = r10
        L1b7:
            x.g r4 = r11.f26858e
            r4.mo13980c(r1)
            goto L1c3
        L1bd:
            r23 = r1
            r25 = r4
            r24 = r12
        L1c3:
            int r14 = r14 + 1
            r13 = r20
            r15 = r21
            r10 = r22
            r1 = r23
            r12 = r24
            r4 = r25
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L12c
        L1d5:
            r23 = r1
            r25 = r4
            r22 = r10
            r21 = r15
            if (r16 <= 0) goto L213
            int r5 = r5 - r16
            r1 = 0
            r4 = 0
        L1e3:
            if (r1 >= r2) goto L211
            java.util.ArrayList<x.p> r10 = r0.f26809k
            java.lang.Object r10 = r10.get(r1)
            x.p r10 = (p401x.AbstractC6908p) r10
            w.f r11 = r10.f26855b
            int r11 = r11.f26156j0
            r12 = 8
            if (r11 != r12) goto L1f6
            goto L20e
        L1f6:
            if (r1 <= 0) goto L1ff
            if (r1 < r6) goto L1ff
            x.f r11 = r10.f26861h
            int r11 = r11.f26824f
            int r4 = r4 + r11
        L1ff:
            x.g r11 = r10.f26858e
            int r11 = r11.f26825g
            int r4 = r4 + r11
            if (r1 >= r9) goto L20e
            if (r1 >= r7) goto L20e
            x.f r10 = r10.f26862i
            int r10 = r10.f26824f
            int r10 = -r10
            int r4 = r4 + r10
        L20e:
            int r1 = r1 + 1
            goto L1e3
        L211:
            r15 = r4
            goto L215
        L213:
            r15 = r21
        L215:
            int r1 = r0.f26810l
            r4 = 2
            if (r1 != r4) goto L220
            if (r16 != 0) goto L220
            r1 = 0
            r0.f26810l = r1
            goto L22c
        L220:
            r1 = 0
            goto L22c
        L222:
            r23 = r1
            r25 = r4
            r22 = r10
            r21 = r15
            r1 = 0
            r4 = 2
        L22c:
            if (r15 <= r3) goto L230
            r0.f26810l = r4
        L230:
            if (r8 <= 0) goto L238
            if (r5 != 0) goto L238
            if (r6 != r7) goto L238
            r0.f26810l = r4
        L238:
            int r4 = r0.f26810l
            r10 = 1
            if (r4 != r10) goto L2cb
            if (r8 <= r10) goto L243
            int r3 = r3 - r15
            int r8 = r8 - r10
            int r3 = r3 / r8
            goto L24a
        L243:
            if (r8 != r10) goto L249
            int r3 = r3 - r15
            r4 = 2
            int r3 = r3 / r4
            goto L24a
        L249:
            r3 = 0
        L24a:
            if (r5 <= 0) goto L24d
            r3 = 0
        L24d:
            r10 = r22
            r5 = 0
        L250:
            if (r5 >= r2) goto L3e6
            if (r25 == 0) goto L259
            int r1 = r5 + 1
            int r1 = r2 - r1
            goto L25a
        L259:
            r1 = r5
        L25a:
            java.util.ArrayList<x.p> r4 = r0.f26809k
            java.lang.Object r1 = r4.get(r1)
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r4 = r1.f26855b
            int r4 = r4.f26156j0
            r8 = 8
            if (r4 != r8) goto L277
            x.f r4 = r1.f26861h
            r4.mo13980c(r10)
            x.f r1 = r1.f26862i
            r1.mo13980c(r10)
            r12 = r23
            goto L2c6
        L277:
            if (r5 <= 0) goto L27e
            if (r25 == 0) goto L27d
            int r10 = r10 - r3
            goto L27e
        L27d:
            int r10 = r10 + r3
        L27e:
            if (r5 <= 0) goto L28b
            if (r5 < r6) goto L28b
            x.f r4 = r1.f26861h
            int r4 = r4.f26824f
            if (r25 == 0) goto L28a
            int r10 = r10 - r4
            goto L28b
        L28a:
            int r10 = r10 + r4
        L28b:
            if (r25 == 0) goto L290
            x.f r4 = r1.f26862i
            goto L292
        L290:
            x.f r4 = r1.f26861h
        L292:
            r4.mo13980c(r10)
            x.g r4 = r1.f26858e
            int r8 = r4.f26825g
            w.f$a r11 = r1.f26857d
            r12 = r23
            if (r11 != r12) goto L2a6
            int r11 = r1.f26854a
            r13 = 1
            if (r11 != r13) goto L2a6
            int r8 = r4.f26840m
        L2a6:
            if (r25 == 0) goto L2aa
            int r10 = r10 - r8
            goto L2ab
        L2aa:
            int r10 = r10 + r8
        L2ab:
            if (r25 == 0) goto L2b0
            x.f r4 = r1.f26861h
            goto L2b2
        L2b0:
            x.f r4 = r1.f26862i
        L2b2:
            r4.mo13980c(r10)
            r4 = 1
            r1.f26860g = r4
            if (r5 >= r9) goto L2c6
            if (r5 >= r7) goto L2c6
            x.f r1 = r1.f26862i
            int r1 = r1.f26824f
            int r1 = -r1
            if (r25 == 0) goto L2c5
            int r10 = r10 - r1
            goto L2c6
        L2c5:
            int r10 = r10 + r1
        L2c6:
            int r5 = r5 + 1
            r23 = r12
            goto L250
        L2cb:
            r12 = r23
            if (r4 != 0) goto L34d
            int r3 = r3 - r15
            r4 = 1
            int r8 = r8 + r4
            int r3 = r3 / r8
            if (r5 <= 0) goto L2d6
            r3 = 0
        L2d6:
            r10 = r22
            r5 = 0
        L2d9:
            if (r5 >= r2) goto L3e6
            if (r25 == 0) goto L2e2
            int r1 = r5 + 1
            int r1 = r2 - r1
            goto L2e3
        L2e2:
            r1 = r5
        L2e3:
            java.util.ArrayList<x.p> r4 = r0.f26809k
            java.lang.Object r1 = r4.get(r1)
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r4 = r1.f26855b
            int r4 = r4.f26156j0
            r8 = 8
            if (r4 != r8) goto L2fe
            x.f r4 = r1.f26861h
            r4.mo13980c(r10)
            x.f r1 = r1.f26862i
            r1.mo13980c(r10)
            goto L34a
        L2fe:
            if (r25 == 0) goto L302
            int r10 = r10 - r3
            goto L303
        L302:
            int r10 = r10 + r3
        L303:
            if (r5 <= 0) goto L310
            if (r5 < r6) goto L310
            x.f r4 = r1.f26861h
            int r4 = r4.f26824f
            if (r25 == 0) goto L30f
            int r10 = r10 - r4
            goto L310
        L30f:
            int r10 = r10 + r4
        L310:
            if (r25 == 0) goto L315
            x.f r4 = r1.f26862i
            goto L317
        L315:
            x.f r4 = r1.f26861h
        L317:
            r4.mo13980c(r10)
            x.g r4 = r1.f26858e
            int r8 = r4.f26825g
            w.f$a r11 = r1.f26857d
            if (r11 != r12) goto L32d
            int r11 = r1.f26854a
            r13 = 1
            if (r11 != r13) goto L32d
            int r4 = r4.f26840m
            int r8 = java.lang.Math.min(r8, r4)
        L32d:
            if (r25 == 0) goto L331
            int r10 = r10 - r8
            goto L332
        L331:
            int r10 = r10 + r8
        L332:
            if (r25 == 0) goto L337
            x.f r4 = r1.f26861h
            goto L339
        L337:
            x.f r4 = r1.f26862i
        L339:
            r4.mo13980c(r10)
            if (r5 >= r9) goto L34a
            if (r5 >= r7) goto L34a
            x.f r1 = r1.f26862i
            int r1 = r1.f26824f
            int r1 = -r1
            if (r25 == 0) goto L349
            int r10 = r10 - r1
            goto L34a
        L349:
            int r10 = r10 + r1
        L34a:
            int r5 = r5 + 1
            goto L2d9
        L34d:
            r8 = 2
            if (r4 != r8) goto L3e6
            int r4 = r0.f26859f
            if (r4 != 0) goto L359
            w.f r4 = r0.f26855b
            float r4 = r4.f26148f0
            goto L35d
        L359:
            w.f r4 = r0.f26855b
            float r4 = r4.f26150g0
        L35d:
            if (r25 == 0) goto L363
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r8 - r4
        L363:
            int r3 = r3 - r15
            float r3 = (float) r3
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            if (r3 < 0) goto L36f
            if (r5 <= 0) goto L370
        L36f:
            r3 = 0
        L370:
            if (r25 == 0) goto L375
            int r10 = r22 - r3
            goto L377
        L375:
            int r10 = r22 + r3
        L377:
            r5 = 0
        L378:
            if (r5 >= r2) goto L3e6
            if (r25 == 0) goto L381
            int r1 = r5 + 1
            int r1 = r2 - r1
            goto L382
        L381:
            r1 = r5
        L382:
            java.util.ArrayList<x.p> r3 = r0.f26809k
            java.lang.Object r1 = r3.get(r1)
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r3 = r1.f26855b
            int r3 = r3.f26156j0
            r4 = 8
            if (r3 != r4) goto L39e
            x.f r3 = r1.f26861h
            r3.mo13980c(r10)
            x.f r1 = r1.f26862i
            r1.mo13980c(r10)
            r13 = 1
            goto L3e3
        L39e:
            if (r5 <= 0) goto L3ab
            if (r5 < r6) goto L3ab
            x.f r3 = r1.f26861h
            int r3 = r3.f26824f
            if (r25 == 0) goto L3aa
            int r10 = r10 - r3
            goto L3ab
        L3aa:
            int r10 = r10 + r3
        L3ab:
            if (r25 == 0) goto L3b0
            x.f r3 = r1.f26862i
            goto L3b2
        L3b0:
            x.f r3 = r1.f26861h
        L3b2:
            r3.mo13980c(r10)
            x.g r3 = r1.f26858e
            int r8 = r3.f26825g
            w.f$a r11 = r1.f26857d
            if (r11 != r12) goto L3c5
            int r11 = r1.f26854a
            r13 = 1
            if (r11 != r13) goto L3c6
            int r8 = r3.f26840m
            goto L3c6
        L3c5:
            r13 = 1
        L3c6:
            if (r25 == 0) goto L3ca
            int r10 = r10 - r8
            goto L3cb
        L3ca:
            int r10 = r10 + r8
        L3cb:
            if (r25 == 0) goto L3d0
            x.f r3 = r1.f26861h
            goto L3d2
        L3d0:
            x.f r3 = r1.f26862i
        L3d2:
            r3.mo13980c(r10)
            if (r5 >= r9) goto L3e3
            if (r5 >= r7) goto L3e3
            x.f r1 = r1.f26862i
            int r1 = r1.f26824f
            int r1 = -r1
            if (r25 == 0) goto L3e2
            int r10 = r10 - r1
            goto L3e3
        L3e2:
            int r10 = r10 + r1
        L3e3:
            int r5 = r5 + 1
            goto L378
        L3e6:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: d */
    public void mo13965d() {
            r6 = this;
            java.util.ArrayList<x.p> r0 = r6.f26809k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            x.p r1 = (p401x.AbstractC6908p) r1
            r1.mo13965d()
            goto L6
        L16:
            java.util.ArrayList<x.p> r0 = r6.f26809k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<x.p> r2 = r6.f26809k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            x.p r2 = (p401x.AbstractC6908p) r2
            w.f r2 = r2.f26855b
            java.util.ArrayList<x.p> r4 = r6.f26809k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            x.p r0 = (p401x.AbstractC6908p) r0
            w.f r0 = r0.f26855b
            int r4 = r6.f26859f
            if (r4 != 0) goto L88
            w.d r1 = r2.f26114F
            w.d r0 = r0.f26118H
            x.f r2 = r6.m14006i(r1, r3)
            int r1 = r1.m13681d()
            w.f r4 = r6.m13970m()
            if (r4 == 0) goto L52
            w.d r1 = r4.f26114F
            int r1 = r1.m13681d()
        L52:
            if (r2 == 0) goto L62
            x.f r4 = r6.f26861h
            java.util.List<x.f> r5 = r4.f26830l
            r5.add(r2)
            r4.f26824f = r1
            java.util.List<x.d> r1 = r2.f26829k
            r1.add(r4)
        L62:
            x.f r1 = r6.m14006i(r0, r3)
            int r0 = r0.m13681d()
            w.f r2 = r6.m13971n()
            if (r2 == 0) goto L76
            w.d r0 = r2.f26118H
            int r0 = r0.m13681d()
        L76:
            if (r1 == 0) goto Lc7
        L78:
            x.f r2 = r6.f26862i
            int r0 = -r0
            java.util.List<x.f> r3 = r2.f26830l
            r3.add(r1)
            r2.f26824f = r0
            java.util.List<x.d> r0 = r1.f26829k
            r0.add(r2)
            goto Lc7
        L88:
            w.d r2 = r2.f26116G
            w.d r0 = r0.f26119I
            x.f r3 = r6.m14006i(r2, r1)
            int r2 = r2.m13681d()
            w.f r4 = r6.m13970m()
            if (r4 == 0) goto La0
            w.d r2 = r4.f26116G
            int r2 = r2.m13681d()
        La0:
            if (r3 == 0) goto Lb0
            x.f r4 = r6.f26861h
            java.util.List<x.f> r5 = r4.f26830l
            r5.add(r3)
            r4.f26824f = r2
            java.util.List<x.d> r2 = r3.f26829k
            r2.add(r4)
        Lb0:
            x.f r1 = r6.m14006i(r0, r1)
            int r0 = r0.m13681d()
            w.f r2 = r6.m13971n()
            if (r2 == 0) goto Lc4
            w.d r0 = r2.f26119I
            int r0 = r0.m13681d()
        Lc4:
            if (r1 == 0) goto Lc7
            goto L78
        Lc7:
            x.f r0 = r6.f26861h
            r0.f26819a = r6
            x.f r0 = r6.f26862i
            r0.f26819a = r6
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: e */
    public void mo13966e() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<x.p> r1 = r2.f26809k
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<x.p> r1 = r2.f26809k
            java.lang.Object r1 = r1.get(r0)
            x.p r1 = (p401x.AbstractC6908p) r1
            r1.mo13966e()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: f */
    public void mo13967f() {
            r2 = this;
            r0 = 0
            r2.f26856c = r0
            java.util.ArrayList<x.p> r0 = r2.f26809k
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            x.p r1 = (p401x.AbstractC6908p) r1
            r1.mo13967f()
            goto L9
        L19:
            return
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: j */
    public long mo13968j() {
            r7 = this;
            java.util.ArrayList<x.p> r0 = r7.f26809k
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<x.p> r4 = r7.f26809k
            java.lang.Object r4 = r4.get(r3)
            x.p r4 = (p401x.AbstractC6908p) r4
            x.f r5 = r4.f26861h
            int r5 = r5.f26824f
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.mo13968j()
            long r5 = r5 + r1
            x.f r1 = r4.f26862i
            int r1 = r1.f26824f
            long r1 = (long) r1
            long r1 = r1 + r5
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // p401x.AbstractC6908p
    /* renamed from: k */
    public boolean mo13969k() {
            r4 = this;
            java.util.ArrayList<x.p> r0 = r4.f26809k
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<x.p> r3 = r4.f26809k
            java.lang.Object r3 = r3.get(r2)
            x.p r3 = (p401x.AbstractC6908p) r3
            boolean r3 = r3.mo13969k()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    /* renamed from: m */
    public final p381w.C6765f m13970m() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<x.p> r1 = r4.f26809k
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            java.util.ArrayList<x.p> r1 = r4.f26809k
            java.lang.Object r1 = r1.get(r0)
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r1 = r1.f26855b
            int r2 = r1.f26156j0
            r3 = 8
            if (r2 == r3) goto L1a
            return r1
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            r0 = 0
            return r0
    }

    /* renamed from: n */
    public final p381w.C6765f m13971n() {
            r4 = this;
            java.util.ArrayList<x.p> r0 = r4.f26809k
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1e
            java.util.ArrayList<x.p> r1 = r4.f26809k
            java.lang.Object r1 = r1.get(r0)
            x.p r1 = (p401x.AbstractC6908p) r1
            w.f r1 = r1.f26855b
            int r2 = r1.f26156j0
            r3 = 8
            if (r2 == r3) goto L1b
            return r1
        L1b:
            int r0 = r0 + (-1)
            goto L8
        L1e:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "ChainRun "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r4.f26859f
            if (r1 != 0) goto Ld
            java.lang.String r1 = "horizontal : "
            goto Lf
        Ld:
            java.lang.String r1 = "vertical : "
        Lf:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<x.p> r1 = r4.f26809k
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            x.p r2 = (p401x.AbstractC6908p) r2
            java.lang.String r3 = "<"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "> "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r2)
            goto L1c
        L44:
            return r0
    }
}
