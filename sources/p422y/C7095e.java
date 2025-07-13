package p422y;

/* renamed from: y.e */
/* loaded from: classes.dex */
public class C7095e implements p445z2.InterfaceC7239m, p072e7.InterfaceC1589d6, p124h7.InterfaceC2943x7, p327s7.InterfaceC5981e, sb.InterfaceC6025s, p015ak.InterfaceC0117a {

    /* renamed from: Y */
    public final /* synthetic */ int f27454Y;

    public C7095e(int r1) {
            r0 = this;
            r0.f27454Y = r1
            r0.<init>()
            return
    }

    /* renamed from: e */
    public static p453zb.C7270b m14210e(byte[][] r7, int r8) {
            zb.b r0 = new zb.b
            r1 = 0
            r2 = r7[r1]
            int r2 = r2.length
            int r3 = r8 * 2
            int r2 = r2 + r3
            int r4 = r7.length
            int r4 = r4 + r3
            r0.<init>(r2, r4)
            int[] r2 = r0.f27905b0
            int r2 = r2.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L1b
            int[] r4 = r0.f27905b0
            r4[r3] = r1
            int r3 = r3 + 1
            goto L12
        L1b:
            int r2 = r0.f27903Z
            int r2 = r2 - r8
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
        L21:
            int r5 = r7.length
            if (r4 >= r5) goto L3d
            r5 = 0
        L25:
            r6 = r7[r1]
            int r6 = r6.length
            if (r5 >= r6) goto L38
            r6 = r7[r4]
            r6 = r6[r5]
            if (r6 != r3) goto L35
            int r6 = r5 + r8
            r0.m14376f(r6, r2)
        L35:
            int r5 = r5 + 1
            goto L25
        L38:
            int r4 = r4 + 1
            int r2 = r2 + (-1)
            goto L21
        L3d:
            return r0
    }

    /* renamed from: h */
    public static byte[][] m14211h(byte[][] r8) {
            r0 = 0
            r1 = r8[r0]
            int r1 = r1.length
            int r2 = r8.length
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            r3[r4] = r2
            r3[r0] = r1
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r3)
            byte[][] r1 = (byte[][]) r1
            r2 = 0
        L16:
            int r3 = r8.length
            if (r2 >= r3) goto L30
            int r3 = r8.length
            int r3 = r3 - r2
            int r3 = r3 - r4
            r5 = 0
        L1d:
            r6 = r8[r0]
            int r6 = r6.length
            if (r5 >= r6) goto L2d
            r6 = r1[r5]
            r7 = r8[r2]
            r7 = r7[r5]
            r6[r3] = r7
            int r5 = r5 + 1
            goto L1d
        L2d:
            int r2 = r2 + 1
            goto L16
        L30:
            return r1
    }

    /* renamed from: i */
    public static void m14212i(p422y.C7095e r7, android.view.View r8, java.util.List r9, mh.InterfaceC4620l r10, mh.InterfaceC4620l r11, int r12, int r13, int r14) {
            r7 = r14 & 8
            if (r7 == 0) goto L5
            r11 = 0
        L5:
            r7 = r14 & 16
            if (r7 == 0) goto Lb
            r12 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r14 & 32
            r14 = -2
            if (r7 == 0) goto L11
            r13 = -2
        L11:
            java.lang.String r7 = "list"
            p214m2.C4339q.m9706k(r9, r7)
            androidx.appcompat.widget.j0 r7 = new androidx.appcompat.widget.j0
            android.content.Context r0 = r8.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            r7.<init>(r0)
            android.content.Context r0 = r8.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object r1 = p046d0.C1259a.f6733a
            r1 = 2131099741(0x7f06005d, float:1.7811844E38)
            android.graphics.drawable.Drawable r0 = p046d0.C1259a.b.m3710b(r0, r1)
            android.widget.PopupWindow r1 = r7.f1351w0
            r1.setBackgroundDrawable(r0)
            android.content.Context r0 = r8.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            r1 = 2131558654(0x7f0d00fe, float:1.874263E38)
            r2 = 2131362671(0x7f0a036f, float:1.834513E38)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p062dh.C1469e.m3992D(r9, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r9.iterator()
        L56:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.next()
            if (r11 == 0) goto L6a
            java.lang.Object r6 = r11.mo107b(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L71
        L6a:
            p214m2.C4339q.m9704i(r5)
            java.lang.String r6 = r5.toString()
        L71:
            r3.add(r6)
            goto L56
        L75:
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r4.<init>(r0, r1, r2, r3)
            r7.f1341m0 = r8
            r7.mo738p(r4)
            r7.f1331c0 = r12
            if (r13 >= 0) goto L91
            if (r14 == r13) goto L91
            r8 = -1
            if (r8 != r13) goto L89
            goto L91
        L89:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT."
            r7.<init>(r8)
            throw r7
        L91:
            r7.f1330b0 = r13
            he.b r8 = new he.b
            r8.<init>(r9, r11, r10, r7)
            r7.f1342n0 = r8
            r7.mo475d()
            return
    }

    @Override // p124h7.InterfaceC2943x7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.lang.Object mo6634a(java.lang.String r1, java.security.Provider r2) {
            r0 = this;
            if (r2 != 0) goto L7
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1)
            goto Lb
        L7:
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1, r2)
        Lb:
            return r1
    }

    @Override // p015ak.InterfaceC0117a
    /* renamed from: b */
    public p015ak.InterfaceC0118b mo176b(java.lang.String r1) {
            r0 = this;
            ck.c r1 = ck.C0994c.f5084Z
            return r1
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r4) {
            r3 = this;
            r6.a r0 = p124h7.C2841rd.f11885d
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            java.lang.String r2 = "SmsRetrieverClient failed to start: "
            if (r1 == 0) goto L17
            java.lang.String r4 = r2.concat(r4)
            goto L1c
        L17:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
        L1c:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.m12161b(r4, r1)
            return
    }

    @Override // sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r22, sb.EnumC6007a r23, int r24, int r25, java.util.Map r26) {
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r21
            r5 = r26
            int r6 = r4.f27454Y
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = -1
            r11 = 2
            r12 = 0
            r13 = 1
            switch(r6) {
                case 23: goto L1a;
                default: goto L18;
            }
        L18:
            goto L35e
        L1a:
            boolean r6 = r22.isEmpty()
            if (r6 != 0) goto L356
            sb.a r6 = sb.EnumC6007a.f23156d0
            if (r1 != r6) goto L342
            if (r2 < 0) goto L326
            if (r3 < 0) goto L326
            ec.f r1 = ec.EnumC1818f.f7946Y
            if (r5 == 0) goto L50
            sb.e r2 = sb.EnumC6011e.f23184a0
            java.lang.Object r2 = r5.get(r2)
            ec.f r2 = (ec.EnumC1818f) r2
            if (r2 == 0) goto L37
            r1 = r2
        L37:
            sb.e r2 = sb.EnumC6011e.f23185b0
            java.lang.Object r2 = r5.get(r2)
            sb.d r2 = (sb.C6010d) r2
            if (r2 == 0) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            sb.e r3 = sb.EnumC6011e.f23186c0
            java.lang.Object r3 = r5.get(r3)
            sb.d r3 = (sb.C6010d) r3
            if (r3 == 0) goto L4e
            goto L52
        L4e:
            r3 = 0
            goto L52
        L50:
            r3 = 0
            r2 = 0
        L52:
            r5 = 6
            ec.b[] r5 = new ec.InterfaceC1814b[r5]
            t8.e r6 = new t8.e
            r6.<init>(r8)
            r5[r12] = r6
            m2.q r6 = new m2.q
            r14 = 24
            r6.<init>(r14)
            r5[r13] = r6
            ec.g r6 = new ec.g
            r6.<init>()
            r5[r11] = r6
            ec.h r6 = new ec.h
            r6.<init>()
            r5[r9] = r6
            t8.e r6 = new t8.e
            r6.<init>(r7)
            r5[r8] = r6
            v1.b r6 = new v1.b
            r9 = 29
            r6.<init>(r9)
            r5[r7] = r6
            ec.c r6 = new ec.c
            r6.<init>(r0)
            r6.f7925b = r1
            r6.f7926c = r2
            r6.f7927d = r3
            java.lang.String r9 = "[)>\u001e05\u001d"
            boolean r9 = r0.startsWith(r9)
            java.lang.String r14 = "\u001e\u0004"
            if (r9 == 0) goto La1
            boolean r9 = r0.endsWith(r14)
            if (r9 == 0) goto La1
            r0 = 236(0xec, float:3.31E-43)
            goto Lb1
        La1:
            java.lang.String r9 = "[)>\u001e06\u001d"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto Lbe
            boolean r0 = r0.endsWith(r14)
            if (r0 == 0) goto Lbe
            r0 = 237(0xed, float:3.32E-43)
        Lb1:
            java.lang.StringBuilder r9 = r6.f7928e
            r9.append(r0)
            r6.f7932i = r11
            int r0 = r6.f7929f
            int r0 = r0 + 7
            r6.f7929f = r0
        Lbe:
            r0 = 0
        Lbf:
            boolean r9 = r6.m4573d()
            if (r9 == 0) goto Ld2
            r9 = r5[r0]
            r9.mo4569f(r6)
            int r9 = r6.f7930g
            if (r9 < 0) goto Lbf
            r6.f7930g = r10
            r0 = r9
            goto Lbf
        Ld2:
            int r5 = r6.m4570a()
            r6.m4574e()
            ec.e r9 = r6.f7931h
            int r9 = r9.f7939b
            r10 = 254(0xfe, float:3.56E-43)
            if (r5 >= r9) goto Lea
            if (r0 == 0) goto Lea
            if (r0 == r7) goto Lea
            java.lang.StringBuilder r0 = r6.f7928e
            r0.append(r10)
        Lea:
            java.lang.StringBuilder r0 = r6.f7928e
            int r5 = r0.length()
            r7 = 129(0x81, float:1.81E-43)
            if (r5 >= r9) goto Lf7
            r0.append(r7)
        Lf7:
            int r5 = r0.length()
            if (r5 >= r9) goto L112
            int r5 = r0.length()
            int r5 = r5 + r13
            int r5 = r5 * 149
            int r5 = r5 % 253
            int r5 = r5 + r13
            int r5 = r5 + r7
            if (r5 > r10) goto L10b
            goto L10d
        L10b:
            int r5 = r5 + (-254)
        L10d:
            char r5 = (char) r5
            r0.append(r5)
            goto Lf7
        L112:
            java.lang.StringBuilder r0 = r6.f7928e
            java.lang.String r0 = r0.toString()
            int r5 = r0.length()
            ec.e r1 = ec.C1817e.m4577i(r5, r1, r2, r3, r13)
            int[] r2 = ec.C1816d.f7933a
            int r2 = r0.length()
            int r3 = r1.f7939b
            if (r2 != r3) goto L31e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r5 = r1.f7940c
            int r3 = r3 + r5
            r2.<init>(r3)
            r2.append(r0)
            int r3 = r1.mo4568c()
            if (r3 != r13) goto L145
            int r3 = r1.f7940c
            java.lang.String r0 = ec.C1816d.m4576a(r0, r3)
            r2.append(r0)
            goto L1ad
        L145:
            int r5 = r2.capacity()
            r2.setLength(r5)
            int[] r5 = new int[r3]
            int[] r6 = new int[r3]
            int[] r7 = new int[r3]
            r9 = 0
        L153:
            if (r9 >= r3) goto L170
            int r10 = r9 + 1
            int r14 = r1.mo4567a(r10)
            r5[r9] = r14
            int r14 = r1.f7945h
            r6[r9] = r14
            r7[r9] = r12
            if (r9 <= 0) goto L16e
            int r14 = r9 + (-1)
            r14 = r7[r14]
            r15 = r5[r9]
            int r14 = r14 + r15
            r7[r9] = r14
        L16e:
            r9 = r10
            goto L153
        L170:
            r7 = 0
        L171:
            if (r7 >= r3) goto L1ad
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = r5[r7]
            r9.<init>(r10)
            r10 = r7
        L17b:
            int r14 = r1.f7939b
            if (r10 >= r14) goto L188
            char r14 = r0.charAt(r10)
            r9.append(r14)
            int r10 = r10 + r3
            goto L17b
        L188:
            java.lang.String r9 = r9.toString()
            r10 = r6[r7]
            java.lang.String r9 = ec.C1816d.m4576a(r9, r10)
            r10 = 0
            r14 = r7
        L194:
            r15 = r6[r7]
            int r15 = r15 * r3
            if (r14 >= r15) goto L1aa
            int r15 = r1.f7939b
            int r15 = r15 + r14
            int r16 = r10 + 1
            char r10 = r9.charAt(r10)
            r2.setCharAt(r15, r10)
            int r14 = r14 + r3
            r10 = r16
            goto L194
        L1aa:
            int r7 = r7 + 1
            goto L171
        L1ad:
            java.lang.String r0 = r2.toString()
            v5.y r2 = new v5.y
            int r3 = r1.m4580e()
            int r5 = r1.m4579d()
            r2.<init>(r0, r3, r5)
            r0 = 4
            r3 = 0
            r5 = 0
        L1c1:
            int r6 = r2.f25724d
            if (r0 != r6) goto L1cd
            if (r3 != 0) goto L1cd
            int r6 = r5 + 1
            r2.m13431c(r5)
            r5 = r6
        L1cd:
            int r6 = r2.f25724d
            int r6 = r6 - r11
            if (r0 != r6) goto L1df
            if (r3 != 0) goto L1df
            int r6 = r2.f25725e
            int r6 = r6 % r8
            if (r6 == 0) goto L1df
            int r6 = r5 + 1
            r2.m13432d(r5)
            r5 = r6
        L1df:
            int r6 = r2.f25724d
            int r6 = r6 - r11
            if (r0 != r6) goto L1f2
            if (r3 != 0) goto L1f2
            int r6 = r2.f25725e
            int r6 = r6 % 8
            if (r6 != r8) goto L1f2
            int r6 = r5 + 1
            r2.m13433e(r5)
            r5 = r6
        L1f2:
            int r6 = r2.f25724d
            int r6 = r6 + r8
            if (r0 != r6) goto L205
            if (r3 != r11) goto L205
            int r6 = r2.f25725e
            int r6 = r6 % 8
            if (r6 != 0) goto L205
            int r6 = r5 + 1
            r2.m13434f(r5)
            r5 = r6
        L205:
            int r6 = r2.f25724d
            if (r0 >= r6) goto L217
            if (r3 < 0) goto L217
            boolean r6 = r2.m13436h(r3, r0)
            if (r6 != 0) goto L217
            int r6 = r5 + 1
            r2.m13442n(r0, r3, r5)
            r5 = r6
        L217:
            int r0 = r0 + (-2)
            int r3 = r3 + 2
            if (r0 < 0) goto L221
            int r6 = r2.f25725e
            if (r3 < r6) goto L205
        L221:
            int r0 = r0 + 1
            int r3 = r3 + 3
        L225:
            if (r0 < 0) goto L237
            int r6 = r2.f25725e
            if (r3 >= r6) goto L237
            boolean r6 = r2.m13436h(r3, r0)
            if (r6 != 0) goto L237
            int r6 = r5 + 1
            r2.m13442n(r0, r3, r5)
            r5 = r6
        L237:
            int r0 = r0 + 2
            int r3 = r3 + (-2)
            int r6 = r2.f25724d
            if (r0 >= r6) goto L241
            if (r3 >= 0) goto L225
        L241:
            int r0 = r0 + 3
            int r3 = r3 + 1
            if (r0 < r6) goto L1c1
            int r7 = r2.f25725e
            if (r3 < r7) goto L1c1
            int r7 = r7 - r13
            int r6 = r6 - r13
            boolean r0 = r2.m13436h(r7, r6)
            if (r0 != 0) goto L265
            int r0 = r2.f25725e
            int r0 = r0 - r13
            int r3 = r2.f25724d
            int r3 = r3 - r13
            r2.m13441m(r0, r3, r13)
            int r0 = r2.f25725e
            int r0 = r0 - r11
            int r3 = r2.f25724d
            int r3 = r3 - r11
            r2.m13441m(r0, r3, r13)
        L265:
            int r0 = r1.m4580e()
            int r3 = r1.m4579d()
            w5.c r5 = new w5.c
            int r6 = r1.m4582g()
            int r7 = r1.m4581f()
            r5.<init>(r6, r7)
            r6 = 0
            r7 = 0
        L27c:
            if (r6 >= r3) goto L2f2
            int r8 = r1.f7942e
            int r8 = r6 % r8
            if (r8 != 0) goto L29c
            r8 = 0
            r9 = 0
        L286:
            int r10 = r1.m4582g()
            if (r8 >= r10) goto L29a
            int r10 = r8 % 2
            if (r10 != 0) goto L292
            r10 = 1
            goto L293
        L292:
            r10 = 0
        L293:
            r5.m13835e(r9, r7, r10)
            int r9 = r9 + r13
            int r8 = r8 + 1
            goto L286
        L29a:
            int r7 = r7 + 1
        L29c:
            r8 = 0
            r9 = 0
        L29e:
            if (r8 >= r0) goto L2d5
            int r10 = r1.f7941d
            int r10 = r8 % r10
            if (r10 != 0) goto L2ab
            r5.m13835e(r9, r7, r13)
            int r9 = r9 + 1
        L2ab:
            V[] r10 = r2.f25723c
            byte[] r10 = (byte[]) r10
            int r11 = r2.f25725e
            int r11 = r11 * r6
            int r11 = r11 + r8
            r10 = r10[r11]
            if (r10 != r13) goto L2ba
            r10 = 1
            goto L2bb
        L2ba:
            r10 = 0
        L2bb:
            r5.m13835e(r9, r7, r10)
            int r9 = r9 + r13
            int r10 = r1.f7941d
            int r11 = r8 % r10
            int r10 = r10 - r13
            if (r11 != r10) goto L2d2
            int r10 = r6 % 2
            if (r10 != 0) goto L2cc
            r10 = 1
            goto L2cd
        L2cc:
            r10 = 0
        L2cd:
            r5.m13835e(r9, r7, r10)
            int r9 = r9 + 1
        L2d2:
            int r8 = r8 + 1
            goto L29e
        L2d5:
            int r7 = r7 + 1
            int r8 = r1.f7942e
            int r9 = r6 % r8
            int r8 = r8 - r13
            if (r9 != r8) goto L2ef
            r8 = 0
            r9 = 0
        L2e0:
            int r10 = r1.m4582g()
            if (r8 >= r10) goto L2ed
            r5.m13835e(r9, r7, r13)
            int r9 = r9 + r13
            int r8 = r8 + 1
            goto L2e0
        L2ed:
            int r7 = r7 + 1
        L2ef:
            int r6 = r6 + 1
            goto L27c
        L2f2:
            int r0 = r5.f26409b
            int r1 = r5.f26410c
            zb.b r2 = new zb.b
            r2.<init>(r0, r1)
            int[] r3 = r2.f27905b0
            int r3 = r3.length
            r6 = 0
        L2ff:
            if (r6 >= r3) goto L308
            int[] r7 = r2.f27905b0
            r7[r6] = r12
            int r6 = r6 + 1
            goto L2ff
        L308:
            r3 = 0
        L309:
            if (r3 >= r0) goto L31d
            r6 = 0
        L30c:
            if (r6 >= r1) goto L31a
            byte r7 = r5.m13833b(r3, r6)
            if (r7 != r13) goto L317
            r2.m14376f(r3, r6)
        L317:
            int r6 = r6 + 1
            goto L30c
        L31a:
            int r3 = r3 + 1
            goto L309
        L31d:
            return r2
        L31e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The number of codewords does not match the selected symbol"
            r0.<init>(r1)
            throw r0
        L326:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Requested dimensions are too small: "
            r1.<init>(r5)
            r1.append(r2)
            r2 = 120(0x78, float:1.68E-43)
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L342:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can only encode DATA_MATRIX, but got "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L356:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        L35e:
            sb.a r6 = sb.EnumC6007a.f23161i0
            if (r1 != r6) goto L7fc
            if (r5 == 0) goto L3f4
            sb.e r1 = sb.EnumC6011e.f23188e0
            boolean r6 = r5.containsKey(r1)
            if (r6 == 0) goto L37d
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            goto L37e
        L37d:
            r1 = 0
        L37e:
            sb.e r6 = sb.EnumC6011e.f23189f0
            boolean r7 = r5.containsKey(r6)
            if (r7 == 0) goto L393
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = r6.toString()
            int r6 = p365v.C6480g.m13150x8e661214(r6)
            goto L394
        L393:
            r6 = 1
        L394:
            sb.e r7 = sb.EnumC6011e.f23190g0
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L3aa
            java.lang.Object r7 = r5.get(r7)
            pc.a r7 = (p275pc.C5381a) r7
            java.util.Objects.requireNonNull(r7)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            goto L3b0
        L3aa:
            r7 = 30
            r8 = 2
            r9 = 30
            r10 = 2
        L3b0:
            sb.e r11 = sb.EnumC6011e.f23187d0
            boolean r13 = r5.containsKey(r11)
            if (r13 == 0) goto L3c5
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = r11.toString()
            int r11 = java.lang.Integer.parseInt(r11)
            goto L3c7
        L3c5:
            r11 = 30
        L3c7:
            sb.e r13 = sb.EnumC6011e.f23182Y
            boolean r14 = r5.containsKey(r13)
            if (r14 == 0) goto L3dc
            java.lang.Object r13 = r5.get(r13)
            java.lang.String r13 = r13.toString()
            int r13 = java.lang.Integer.parseInt(r13)
            goto L3dd
        L3dc:
            r13 = 2
        L3dd:
            sb.e r14 = sb.EnumC6011e.f23183Z
            boolean r15 = r5.containsKey(r14)
            if (r15 == 0) goto L3f2
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = r5.toString()
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            goto L400
        L3f2:
            r5 = 0
            goto L400
        L3f4:
            r11 = 30
            r5 = 0
            r1 = 0
            r13 = 2
            r8 = 2
            r7 = 30
            r6 = 1
            r10 = 2
            r9 = 30
        L400:
            int r14 = p275pc.C5383c.m11733a(r13)
            byte[] r15 = p275pc.C5384d.f21386a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r12 = r22.length()
            r15.<init>(r12)
            if (r5 != 0) goto L414
            java.nio.charset.Charset r5 = p275pc.C5384d.f21390e
            goto L474
        L414:
            java.nio.charset.Charset r12 = p275pc.C5384d.f21390e
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L474
            java.lang.String r12 = r5.name()
            java.util.Map<java.lang.String, zb.d> r17 = p453zb.EnumC7272d.f27910b0
            r4 = r17
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r12)
            zb.d r4 = (p453zb.EnumC7272d) r4
            if (r4 == 0) goto L474
            int[] r4 = r4.f27912Y
            r12 = 0
            r4 = r4[r12]
            if (r4 < 0) goto L43f
            r12 = 900(0x384, float:1.261E-42)
            if (r4 >= r12) goto L43f
            r12 = 927(0x39f, float:1.299E-42)
            r15.append(r12)
            goto L453
        L43f:
            r12 = 810900(0xc5f94, float:1.136313E-39)
            if (r4 >= r12) goto L455
            r12 = 926(0x39e, float:1.298E-42)
            r15.append(r12)
            int r12 = r4 / 900
            int r12 = r12 + (-1)
            char r12 = (char) r12
            r15.append(r12)
            int r4 = r4 % 900
        L453:
            char r4 = (char) r4
            goto L464
        L455:
            r12 = 811800(0xc6318, float:1.137574E-39)
            if (r4 >= r12) goto L468
            r12 = 925(0x39d, float:1.296E-42)
            r15.append(r12)
            r12 = 810900(0xc5f94, float:1.136313E-39)
            int r12 = r12 - r4
            char r4 = (char) r12
        L464:
            r15.append(r4)
            goto L474
        L468:
            sb.t r0 = new sb.t
            java.lang.String r1 = "ECI number not in valid range from 0..811799, but was "
            java.lang.String r1 = p422y.C7094d.m14209a(r1, r4)
            r0.<init>(r1)
            throw r0
        L474:
            int r4 = r22.length()
            r12 = 2
            if (r6 != r12) goto L487
            r12 = 0
            p275pc.C5384d.m11736c(r0, r12, r4, r15, r12)
        L47f:
            r26 = r1
            r17 = r11
        L483:
            r18 = r13
            goto L5e8
        L487:
            r12 = 3
            if (r6 != r12) goto L495
            byte[] r4 = r0.getBytes(r5)
            int r5 = r4.length
            r6 = 1
            r12 = 0
            p275pc.C5384d.m11734a(r4, r12, r5, r6, r15)
            goto L47f
        L495:
            r12 = 902(0x386, float:1.264E-42)
            r17 = r11
            r11 = 4
            if (r6 != r11) goto L4a6
            r15.append(r12)
            r5 = 0
            p275pc.C5384d.m11735b(r0, r5, r4, r15)
        L4a3:
            r26 = r1
            goto L483
        L4a6:
            r6 = 0
            r11 = 0
        L4a8:
            r12 = 0
        L4a9:
            if (r11 >= r4) goto L4a3
            r23 = r12
            int r12 = r22.length()
            r16 = 0
            if (r11 >= r12) goto L4cc
            r2 = r11
        L4b6:
            char r18 = r0.charAt(r2)
        L4ba:
            boolean r19 = p275pc.C5384d.m11739f(r18)
            if (r19 == 0) goto L4c9
            if (r2 >= r12) goto L4c9
            int r16 = r16 + 1
            int r2 = r2 + 1
            if (r2 >= r12) goto L4ba
            goto L4b6
        L4c9:
            r2 = r16
            goto L4cd
        L4cc:
            r2 = 0
        L4cd:
            r12 = 13
            if (r2 < r12) goto L4de
            r6 = 902(0x386, float:1.264E-42)
            r15.append(r6)
            p275pc.C5384d.m11735b(r0, r11, r2, r15)
            int r11 = r11 + r2
            r6 = 2
            r2 = r24
            goto L4a8
        L4de:
            int r12 = r22.length()
            r3 = r11
        L4e3:
            if (r3 >= r12) goto L53b
            char r16 = r0.charAt(r3)
            r18 = 13
            r19 = 0
            r26 = r1
            r18 = r13
            r1 = 13
            r13 = 0
        L4f4:
            if (r13 >= r1) goto L50f
            boolean r1 = p275pc.C5384d.m11739f(r16)
            if (r1 == 0) goto L50d
            if (r3 >= r12) goto L50d
            int r13 = r13 + 1
            int r3 = r3 + 1
            if (r3 >= r12) goto L50a
            char r1 = r0.charAt(r3)
            r16 = r1
        L50a:
            r1 = 13
            goto L4f4
        L50d:
            r1 = 13
        L50f:
            if (r13 < r1) goto L514
            int r3 = r3 - r11
            int r3 = r3 - r13
            goto L540
        L514:
            if (r13 > 0) goto L536
            char r1 = r0.charAt(r3)
            r13 = 9
            if (r1 == r13) goto L531
            r13 = 10
            if (r1 == r13) goto L531
            r13 = 13
            if (r1 == r13) goto L531
            r13 = 32
            if (r1 < r13) goto L52f
            r13 = 126(0x7e, float:1.77E-43)
            if (r1 > r13) goto L52f
            goto L531
        L52f:
            r1 = 0
            goto L532
        L531:
            r1 = 1
        L532:
            if (r1 == 0) goto L53f
            int r3 = r3 + 1
        L536:
            r1 = r26
            r13 = r18
            goto L4e3
        L53b:
            r26 = r1
            r18 = r13
        L53f:
            int r3 = r3 - r11
        L540:
            r1 = 5
            if (r3 >= r1) goto L5c8
            if (r2 != r4) goto L547
            goto L5c8
        L547:
            java.nio.charset.CharsetEncoder r1 = r5.newEncoder()
            int r2 = r22.length()
            r3 = r11
        L550:
            if (r3 >= r2) goto L5a3
            char r12 = r0.charAt(r3)
            r13 = 0
            r16 = r4
        L559:
            r4 = 13
            if (r13 >= r4) goto L56e
            boolean r4 = p275pc.C5384d.m11739f(r12)
            if (r4 == 0) goto L56e
            int r13 = r13 + 1
            int r4 = r3 + r13
            if (r4 >= r2) goto L56e
            char r12 = r0.charAt(r4)
            goto L559
        L56e:
            r4 = 13
            if (r13 < r4) goto L573
            goto L5a5
        L573:
            char r4 = r0.charAt(r3)
            boolean r12 = r1.canEncode(r4)
            if (r12 == 0) goto L582
            int r3 = r3 + 1
            r4 = r16
            goto L550
        L582:
            sb.t r0 = new sb.t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-encodable character detected: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " (Unicode: "
            r1.append(r2)
            r1.append(r4)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5a3:
            r16 = r4
        L5a5:
            int r3 = r3 - r11
            if (r3 != 0) goto L5a9
            r3 = 1
        L5a9:
            int r3 = r3 + r11
            java.lang.String r1 = r0.substring(r11, r3)
            byte[] r1 = r1.getBytes(r5)
            int r2 = r1.length
            r4 = 1
            if (r2 != r4) goto L5bf
            if (r6 != 0) goto L5bf
            r2 = 0
            p275pc.C5384d.m11734a(r1, r2, r4, r2, r15)
            r12 = r23
            goto L5c6
        L5bf:
            r2 = 0
            int r4 = r1.length
            p275pc.C5384d.m11734a(r1, r2, r4, r6, r15)
            r6 = 1
            r12 = 0
        L5c6:
            r11 = r3
            goto L5dc
        L5c8:
            r16 = r4
            if (r6 == 0) goto L5d4
            r1 = 900(0x384, float:1.261E-42)
            r15.append(r1)
            r12 = 0
            r6 = 0
            goto L5d6
        L5d4:
            r12 = r23
        L5d6:
            int r1 = p275pc.C5384d.m11736c(r0, r11, r3, r15, r12)
            int r11 = r11 + r3
            r12 = r1
        L5dc:
            r2 = r24
            r3 = r25
            r1 = r26
            r4 = r16
            r13 = r18
            goto L4a9
        L5e8:
            java.lang.String r1 = r15.toString()
            int r2 = r1.length()
            r3 = 0
            r4 = 0
            r5 = r10
        L5f3:
            if (r5 > r7) goto L639
            int r6 = r2 + 1
            int r6 = r6 + r14
            int r11 = r6 / r5
            int r11 = r11 + 1
            int r12 = r5 * r11
            int r6 = r6 + r5
            if (r12 < r6) goto L603
            int r11 = r11 + (-1)
        L603:
            if (r11 < r8) goto L639
            if (r11 > r9) goto L636
            int r6 = r5 * 17
            int r6 = r6 + 69
            float r6 = (float) r6
            r12 = 1052166324(0x3eb6c8b4, float:0.357)
            float r6 = r6 * r12
            float r12 = (float) r11
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r13
            float r6 = r6 / r12
            if (r4 == 0) goto L62b
            r12 = 1077936128(0x40400000, float:3.0)
            float r13 = r6 - r12
            float r13 = java.lang.Math.abs(r13)
            float r12 = r3 - r12
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 > 0) goto L636
        L62b:
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r11
            r4 = r3
            r3 = r6
        L636:
            int r5 = r5 + 1
            goto L5f3
        L639:
            if (r4 != 0) goto L656
            int r3 = r2 + 1
            int r3 = r3 + r14
            int r5 = r3 / r10
            r6 = 1
            int r5 = r5 + r6
            int r7 = r10 * r5
            int r3 = r3 + r10
            if (r7 < r3) goto L649
            int r5 = r5 + (-1)
        L649:
            if (r5 >= r8) goto L654
            r3 = 2
            int[] r4 = new int[r3]
            r3 = 0
            r4[r3] = r10
            r4[r6] = r8
            goto L658
        L654:
            r3 = 0
            goto L658
        L656:
            r3 = 0
            r6 = 1
        L658:
            if (r4 == 0) goto L7f4
            r3 = r4[r3]
            r4 = r4[r6]
            int r5 = r3 * r4
            int r5 = r5 - r14
            int r7 = r2 + 1
            if (r5 <= r7) goto L669
            int r5 = r5 - r2
            int r5 = r5 + (-1)
            goto L66a
        L669:
            r5 = 0
        L66a:
            int r14 = r14 + r2
            int r14 = r14 + 1
            r7 = 929(0x3a1, float:1.302E-42)
            if (r14 > r7) goto L7d7
            int r2 = r2 + r5
            int r2 = r2 + r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            char r2 = (char) r2
            r0.append(r2)
            r0.append(r1)
            r1 = 0
        L680:
            if (r1 >= r5) goto L68a
            r2 = 900(0x384, float:1.261E-42)
            r0.append(r2)
            int r1 = r1 + 1
            goto L680
        L68a:
            java.lang.String r0 = r0.toString()
            int r1 = p275pc.C5383c.m11733a(r18)
            char[] r2 = new char[r1]
            int r5 = r0.length()
            r6 = 0
        L699:
            if (r6 >= r5) goto L6d0
            char r8 = r0.charAt(r6)
            int r9 = r1 + (-1)
            char r10 = r2[r9]
            int r8 = r8 + r10
            int r8 = r8 % r7
        L6a5:
            if (r9 <= 0) goto L6bd
            int[][] r10 = p275pc.C5383c.f21385a
            r10 = r10[r18]
            r10 = r10[r9]
            int r10 = r10 * r8
            int r10 = r10 % r7
            int r10 = 929 - r10
            int r11 = r9 + (-1)
            char r12 = r2[r11]
            int r12 = r12 + r10
            int r12 = r12 % r7
            char r10 = (char) r12
            r2[r9] = r10
            r9 = r11
            goto L6a5
        L6bd:
            int[][] r9 = p275pc.C5383c.f21385a
            r9 = r9[r18]
            r10 = 0
            r9 = r9[r10]
            int r8 = r8 * r9
            int r8 = r8 % r7
            int r8 = 929 - r8
            int r8 = r8 % r7
            char r8 = (char) r8
            r2[r10] = r8
            int r6 = r6 + 1
            goto L699
        L6d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
        L6d5:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L6ea
            char r6 = r2[r1]
            if (r6 == 0) goto L6e4
            char r6 = r2[r1]
            int r6 = 929 - r6
            char r6 = (char) r6
            r2[r1] = r6
        L6e4:
            char r6 = r2[r1]
            r5.append(r6)
            goto L6d5
        L6ea:
            java.lang.String r1 = r5.toString()
            m4.b0 r2 = new m4.b0
            r2.<init>(r4, r3)
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            r1 = 0
            r5 = 0
        L6f9:
            if (r1 >= r4) goto L78b
            int r6 = r1 % 3
            int r7 = r2.f17871c
            int r7 = r7 + 1
            r2.f17871c = r7
            r7 = 130728(0x1fea8, float:1.83189E-40)
            r4.g r8 = r2.m9762g()
            r9 = 17
            p275pc.C5382b.m11732a(r7, r9, r8)
            int r7 = r1 / 3
            int r7 = r7 * 30
            if (r6 != 0) goto L71d
            int r8 = r4 + (-1)
            int r8 = r8 / 3
            int r8 = r8 + r7
            int r10 = r3 + (-1)
            goto L72f
        L71d:
            r8 = 1
            if (r6 != r8) goto L731
            int r13 = r18 * 3
            int r13 = r13 + r7
            int r8 = r4 + (-1)
            int r10 = r8 % 3
            int r10 = r10 + r13
            int r8 = r8 / 3
            r20 = r10
            r10 = r8
            r8 = r20
        L72f:
            int r10 = r10 + r7
            goto L73d
        L731:
            int r8 = r3 + (-1)
            int r8 = r8 + r7
            int r13 = r18 * 3
            int r13 = r13 + r7
            int r7 = r4 + (-1)
            int r7 = r7 % 3
            int r10 = r7 + r13
        L73d:
            int[][] r7 = p275pc.C5382b.f21384a
            r7 = r7[r6]
            r7 = r7[r8]
            r4.g r8 = r2.m9762g()
            p275pc.C5382b.m11732a(r7, r9, r8)
            r7 = 0
        L74b:
            if (r7 >= r3) goto L763
            int[][] r8 = p275pc.C5382b.f21384a
            r8 = r8[r6]
            char r11 = r0.charAt(r5)
            r8 = r8[r11]
            r4.g r11 = r2.m9762g()
            p275pc.C5382b.m11732a(r8, r9, r11)
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L74b
        L763:
            r7 = 260649(0x3fa29, float:3.65247E-40)
            if (r26 == 0) goto L771
            r4.g r6 = r2.m9762g()
            r8 = 1
            p275pc.C5382b.m11732a(r7, r8, r6)
            goto L787
        L771:
            int[][] r8 = p275pc.C5382b.f21384a
            r6 = r8[r6]
            r6 = r6[r10]
            r4.g r8 = r2.m9762g()
            p275pc.C5382b.m11732a(r6, r9, r8)
            r6 = 18
            r4.g r8 = r2.m9762g()
            p275pc.C5382b.m11732a(r7, r6, r8)
        L787:
            int r1 = r1 + 1
            goto L6f9
        L78b:
            r0 = 4
            r1 = 1
            byte[][] r0 = r2.m9764i(r1, r0)
            r1 = 0
            r3 = r24
            r4 = r25
            if (r4 <= r3) goto L79a
            r5 = 1
            goto L79b
        L79a:
            r5 = 0
        L79b:
            r6 = r0[r1]
            int r6 = r6.length
            int r7 = r0.length
            if (r6 >= r7) goto L7a3
            r6 = 1
            goto L7a4
        L7a3:
            r6 = 0
        L7a4:
            r5 = r5 ^ r6
            if (r5 == 0) goto L7ad
            byte[][] r0 = m14211h(r0)
            r5 = 1
            goto L7ae
        L7ad:
            r5 = 0
        L7ae:
            r1 = r0[r1]
            int r1 = r1.length
            int r1 = r3 / r1
            int r3 = r0.length
            int r3 = r4 / r3
            if (r1 >= r3) goto L7b9
            goto L7ba
        L7b9:
            r1 = r3
        L7ba:
            r3 = 1
            if (r1 <= r3) goto L7d0
            int r0 = r1 << 2
            byte[][] r0 = r2.m9764i(r1, r0)
            if (r5 == 0) goto L7c9
            byte[][] r0 = m14211h(r0)
        L7c9:
            r11 = r17
            zb.b r0 = m14210e(r0, r11)
            goto L7d6
        L7d0:
            r11 = r17
            zb.b r0 = m14210e(r0, r11)
        L7d6:
            return r0
        L7d7:
            sb.t r1 = new sb.t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoded message contains too many code words, message too big ("
            r2.<init>(r3)
            int r0 = r22.length()
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7f4:
            sb.t r0 = new sb.t
            java.lang.String r1 = "Unable to fit message in columns"
            r0.<init>(r1)
            throw r0
        L7fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can only encode PDF_417, but got "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f */
    public void mo12754f(p340t8.C6195l r1, float r2, float r3, float r4) {
            r0 = this;
            r1 = 0
            throw r1
    }

    /* renamed from: g */
    public void m14213g(int r10, java.lang.CharSequence r11, bd.InterfaceC0733a r12) {
            r9 = this;
            int r0 = r11.length()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L4b
            int r0 = r11.length()
            r2 = 0
        L12:
            if (r1 >= r0) goto L45
            char r4 = r11.charAt(r1)
            long r4 = (long) r4
            r6 = 65
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L2e
            r6 = 90
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L2e
            int r1 = r1 + 1
            int r6 = r1 * 8
            long r4 = r4 << r6
            long r2 = r2 | r4
            goto L12
        L2e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "invalid currency symbol string: "
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L45:
            long r10 = (long) r10
            long r10 = r10 | r2
            r12.mo2347j(r10)
            return
        L4b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "empty currency symbol string"
            r10.<init>(r11)
            throw r10
    }
}
