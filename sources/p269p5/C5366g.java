package p269p5;

/* renamed from: p5.g */
/* loaded from: classes.dex */
public final class C5366g implements p143i5.InterfaceC3082f {

    /* renamed from: Y */
    public final p269p5.C5363d f21360Y;

    /* renamed from: Z */
    public final long[] f21361Z;

    /* renamed from: a0 */
    public final java.util.Map<java.lang.String, p269p5.C5365f> f21362a0;

    /* renamed from: b0 */
    public final java.util.Map<java.lang.String, p269p5.C5364e> f21363b0;

    /* renamed from: c0 */
    public final java.util.Map<java.lang.String, java.lang.String> f21364c0;

    public C5366g(p269p5.C5363d r3, java.util.Map<java.lang.String, p269p5.C5365f> r4, java.util.Map<java.lang.String, p269p5.C5364e> r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r2 = this;
            r2.<init>()
            r2.f21360Y = r3
            r2.f21363b0 = r5
            r2.f21364c0 = r6
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r2.f21362a0 = r4
            java.util.TreeSet r4 = new java.util.TreeSet
            r4.<init>()
            r5 = 0
            r3.m11684e(r4, r5)
            int r3 = r4.size()
            long[] r3 = new long[r3]
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L38
            java.lang.Object r6 = r4.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r6 = r5 + 1
            r3[r5] = r0
            r5 = r6
            goto L22
        L38:
            r2.f21361Z = r3
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r3) {
            r2 = this;
            long[] r0 = r2.f21361Z
            r1 = 0
            int r3 = p371v5.C6552b0.m13309b(r0, r3, r1, r1)
            long[] r4 = r2.f21361Z
            int r4 = r4.length
            if (r3 >= r4) goto Ld
            goto Le
        Ld:
            r3 = -1
        Le:
            return r3
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r4) {
            r3 = this;
            long[] r0 = r3.f21361Z
            r1 = r0[r4]
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List<p143i5.C3077a> mo7539h(long r35) {
            r34 = this;
            r0 = r34
            p5.d r7 = r0.f21360Y
            java.util.Map<java.lang.String, p5.f> r8 = r0.f21362a0
            java.util.Map<java.lang.String, p5.e> r9 = r0.f21363b0
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.f21364c0
            java.util.Objects.requireNonNull(r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r1 = r7.f21325h
            r12 = r35
            r7.m11686h(r12, r1, r11)
            java.util.TreeMap r14 = new java.util.TreeMap
            r14.<init>()
            java.lang.String r5 = r7.f21325h
            r4 = 0
            r1 = r7
            r2 = r35
            r6 = r14
            r1.m11688j(r2, r4, r5, r6)
            java.lang.String r6 = r7.f21325h
            r4 = r8
            r5 = r9
            r7 = r14
            r1.m11687i(r2, r4, r5, r6, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        L39:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r2.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r5 = r3.second
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L51
            goto L39
        L51:
            byte[] r5 = android.util.Base64.decode(r5, r4)
            int r6 = r5.length
            android.graphics.Bitmap r19 = android.graphics.BitmapFactory.decodeByteArray(r5, r4, r6)
            java.lang.Object r3 = r3.first
            java.lang.Object r3 = r9.get(r3)
            p5.e r3 = (p269p5.C5364e) r3
            java.util.Objects.requireNonNull(r3)
            r32 = 0
            r17 = 0
            r16 = r17
            r18 = r17
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = 0
            r30 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r4 = r3.f21332b
            r23 = r4
            r24 = 0
            float r4 = r3.f21333c
            r20 = r4
            r21 = 0
            int r4 = r3.f21335e
            r22 = r4
            float r4 = r3.f21336f
            r27 = r4
            float r4 = r3.f21337g
            r28 = r4
            int r3 = r3.f21340j
            r31 = r3
            i5.a r3 = new i5.a
            r15 = r3
            r33 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.add(r3)
            goto L39
        L9e:
            java.util.Set r2 = r14.entrySet()
            java.util.Iterator r2 = r2.iterator()
        La6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.Object r5 = r9.get(r5)
            p5.e r5 = (p269p5.C5364e) r5
            java.util.Objects.requireNonNull(r5)
            java.lang.Object r3 = r3.getValue()
            i5.a$b r3 = (p143i5.C3077a.b) r3
            java.lang.CharSequence r6 = r3.f12403a
            java.util.Objects.requireNonNull(r6)
            android.text.SpannableStringBuilder r6 = (android.text.SpannableStringBuilder) r6
            int r7 = r6.length()
            java.lang.Class<p5.a> r8 = p269p5.C5360a.class
            java.lang.Object[] r7 = r6.getSpans(r4, r7, r8)
            p5.a[] r7 = (p269p5.C5360a[]) r7
            int r8 = r7.length
            r10 = 0
        Lda:
            if (r10 >= r8) goto Lee
            r11 = r7[r10]
            int r12 = r6.getSpanStart(r11)
            int r11 = r6.getSpanEnd(r11)
            java.lang.String r13 = ""
            r6.replace(r12, r11, r13)
            int r10 = r10 + 1
            goto Lda
        Lee:
            r7 = 0
        Lef:
            int r8 = r6.length()
            r10 = 32
            if (r7 >= r8) goto L119
            char r8 = r6.charAt(r7)
            if (r8 != r10) goto L116
            int r8 = r7 + 1
            r11 = r8
        L100:
            int r12 = r6.length()
            if (r11 >= r12) goto L10f
            char r12 = r6.charAt(r11)
            if (r12 != r10) goto L10f
            int r11 = r11 + 1
            goto L100
        L10f:
            int r11 = r11 - r8
            if (r11 <= 0) goto L116
            int r11 = r11 + r7
            r6.delete(r7, r11)
        L116:
            int r7 = r7 + 1
            goto Lef
        L119:
            int r7 = r6.length()
            r8 = 1
            if (r7 <= 0) goto L129
            char r7 = r6.charAt(r4)
            if (r7 != r10) goto L129
            r6.delete(r4, r8)
        L129:
            r7 = 0
        L12a:
            int r11 = r6.length()
            int r11 = r11 - r8
            r12 = 10
            if (r7 >= r11) goto L149
            char r11 = r6.charAt(r7)
            if (r11 != r12) goto L146
            int r11 = r7 + 1
            char r12 = r6.charAt(r11)
            if (r12 != r10) goto L146
            int r12 = r7 + 2
            r6.delete(r11, r12)
        L146:
            int r7 = r7 + 1
            goto L12a
        L149:
            int r7 = r6.length()
            if (r7 <= 0) goto L166
            int r7 = r6.length()
            int r7 = r7 - r8
            char r7 = r6.charAt(r7)
            if (r7 != r10) goto L166
            int r7 = r6.length()
            int r7 = r7 - r8
            int r11 = r6.length()
            r6.delete(r7, r11)
        L166:
            r7 = 0
        L167:
            int r11 = r6.length()
            int r11 = r11 - r8
            if (r7 >= r11) goto L182
            char r11 = r6.charAt(r7)
            if (r11 != r10) goto L17f
            int r11 = r7 + 1
            char r13 = r6.charAt(r11)
            if (r13 != r12) goto L17f
            r6.delete(r7, r11)
        L17f:
            int r7 = r7 + 1
            goto L167
        L182:
            int r7 = r6.length()
            if (r7 <= 0) goto L19f
            int r7 = r6.length()
            int r7 = r7 - r8
            char r7 = r6.charAt(r7)
            if (r7 != r12) goto L19f
            int r7 = r6.length()
            int r7 = r7 - r8
            int r8 = r6.length()
            r6.delete(r7, r8)
        L19f:
            float r6 = r5.f21333c
            int r7 = r5.f21334d
            r3.f12407e = r6
            r3.f12408f = r7
            int r6 = r5.f21335e
            r3.f12409g = r6
            float r6 = r5.f21332b
            r3.f12410h = r6
            float r6 = r5.f21336f
            r3.f12414l = r6
            float r6 = r5.f21339i
            int r7 = r5.f21338h
            r3.f12413k = r6
            r3.f12412j = r7
            int r5 = r5.f21340j
            r3.f12418p = r5
            i5.a r3 = r3.m7535a()
            r1.add(r3)
            goto La6
        L1c8:
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: k */
    public int mo7540k() {
            r1 = this;
            long[] r0 = r1.f21361Z
            int r0 = r0.length
            return r0
    }
}
