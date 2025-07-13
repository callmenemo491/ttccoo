package p249o7;

/* renamed from: o7.o6 */
/* loaded from: classes.dex */
public final class C5068o6 extends p249o7.AbstractC5020i6 {
    public C5068o6(p249o7.C5052m6 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: D */
    public static <Builder extends p185k7.AbstractC4051y4> Builder m11380D(Builder r3, byte[] r4) {
            java.lang.Class<k7.q5> r0 = p185k7.C3948q5.class
            k7.q5 r1 = p185k7.C3948q5.f16845c
            if (r1 == 0) goto L7
            goto L14
        L7:
            monitor-enter(r0)
            k7.q5 r1 = p185k7.C3948q5.f16845c     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            k7.q5 r1 = p185k7.AbstractC4052y5.m9153b(r0)     // Catch: java.lang.Throwable -> L2c
            p185k7.C3948q5.f16845c = r1     // Catch: java.lang.Throwable -> L2c
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
        L14:
            r0 = 0
            java.util.Objects.requireNonNull(r3)
            if (r1 == 0) goto L21
            int r2 = r4.length
            k7.a6 r3 = (p185k7.C3731a6) r3
            r3.m8206o(r4, r0, r2, r1)
            return r3
        L21:
            int r1 = r4.length
            k7.a6 r3 = (p185k7.C3731a6) r3
            k7.q5 r2 = p185k7.C3948q5.m8909a()
            r3.m8206o(r4, r0, r1, r2)
            return r3
        L2c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }

    /* renamed from: G */
    public static java.util.List<p185k7.C4049y2> m11381G(android.os.Bundle[] r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L85
            r4 = r11[r3]
            if (r4 != 0) goto L10
            goto L82
        L10:
            k7.x2 r5 = p185k7.C4049y2.m9136w()
            java.util.Set r6 = r4.keySet()
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            k7.x2 r8 = p185k7.C4049y2.m9136w()
            r8.m9086r(r7)
            java.lang.Object r7 = r4.get(r7)
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 == 0) goto L41
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            r8.m9085q(r9)
            goto L58
        L41:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L4b
            java.lang.String r7 = (java.lang.String) r7
            r8.m9087s(r7)
            goto L58
        L4b:
            boolean r9 = r7 instanceof java.lang.Double
            if (r9 == 0) goto L1c
            java.lang.Double r7 = (java.lang.Double) r7
            double r9 = r7.doubleValue()
            r8.m9084p(r9)
        L58:
            boolean r7 = r5.f16454a0
            if (r7 == 0) goto L61
            r5.m8203j()
            r5.f16454a0 = r2
        L61:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r5.f16453Z
            k7.y2 r7 = (p185k7.C4049y2) r7
            k7.d6 r8 = r8.m8201f()
            k7.y2 r8 = (p185k7.C4049y2) r8
            p185k7.C4049y2.m9133I(r7, r8)
            goto L1c
        L6f:
            MessageType extends k7.d6<MessageType, BuilderType> r4 = r5.f16453Z
            k7.y2 r4 = (p185k7.C4049y2) r4
            int r4 = r4.m9146u()
            if (r4 <= 0) goto L82
            k7.d6 r4 = r5.m8201f()
            k7.y2 r4 = (p185k7.C4049y2) r4
            r0.add(r4)
        L82:
            int r3 = r3 + 1
            goto L8
        L85:
            return r0
    }

    /* renamed from: I */
    public static java.util.List<java.lang.Long> m11382I(java.util.BitSet r10) {
            int r0 = r10.length()
            int r0 = r0 + 63
            r1 = 64
            int r0 = r0 / r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r0) goto L38
            r5 = 0
            r7 = 0
        L15:
            if (r7 >= r1) goto L2e
            int r8 = r4 * 64
            int r8 = r8 + r7
            int r9 = r10.length()
            if (r8 < r9) goto L21
            goto L2e
        L21:
            boolean r8 = r10.get(r8)
            if (r8 == 0) goto L2b
            r8 = 1
            long r8 = r8 << r7
            long r5 = r5 | r8
        L2b:
            int r7 = r7 + 1
            goto L15
        L2e:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L10
        L38:
            return r2
    }

    /* renamed from: M */
    public static boolean m11383M(java.util.List<java.lang.Long> r4, int r5) {
            r0 = r4
            k7.u6 r0 = (p185k7.C4001u6) r0
            int r0 = r0.f16894a0
            int r0 = r0 * 64
            if (r5 >= r0) goto L26
            int r0 = r5 / 64
            k7.u6 r4 = (p185k7.C4001u6) r4
            java.lang.Object r4 = r4.get(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2 = 1
            int r5 = r5 % 64
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L26
            r4 = 1
            return r4
        L26:
            r4 = 0
            return r4
    }

    /* renamed from: O */
    public static boolean m11384O(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.String r0 = "([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L14
            int r1 = r1.length()
            r0 = 310(0x136, float:4.34E-43)
            if (r1 > r0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    /* renamed from: m */
    public static final void m11385m(p185k7.C3984t2 r4, java.lang.String r5, java.lang.Object r6) {
            java.util.List r0 = r4.m9014y()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L20
            java.lang.Object r3 = r0.get(r2)
            k7.y2 r3 = (p185k7.C4049y2) r3
            java.lang.String r3 = r3.m9148y()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1d
            goto L21
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            r2 = -1
        L21:
            k7.x2 r0 = p185k7.C4049y2.m9136w()
            r0.m9086r(r5)
            boolean r5 = r6 instanceof java.lang.Long
            if (r5 == 0) goto L36
            java.lang.Long r6 = (java.lang.Long) r6
            long r5 = r6.longValue()
            r0.m9085q(r5)
            goto L68
        L36:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L40
            java.lang.String r6 = (java.lang.String) r6
            r0.m9087s(r6)
            goto L68
        L40:
            boolean r5 = r6 instanceof java.lang.Double
            if (r5 == 0) goto L4e
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            r0.m9084p(r5)
            goto L68
        L4e:
            boolean r5 = r6 instanceof android.os.Bundle[]
            if (r5 == 0) goto L68
            android.os.Bundle[] r6 = (android.os.Bundle[]) r6
            java.util.List r5 = m11381G(r6)
            boolean r6 = r0.f16454a0
            if (r6 == 0) goto L61
            r0.m8203j()
            r0.f16454a0 = r1
        L61:
            MessageType extends k7.d6<MessageType, BuilderType> r6 = r0.f16453Z
            k7.y2 r6 = (p185k7.C4049y2) r6
            p185k7.C4049y2.m9134J(r6, r5)
        L68:
            if (r2 < 0) goto L81
            boolean r5 = r4.f16454a0
            if (r5 == 0) goto L73
            r4.m8203j()
            r4.f16454a0 = r1
        L73:
            MessageType extends k7.d6<MessageType, BuilderType> r4 = r4.f16453Z
            k7.u2 r4 = (p185k7.C3997u2) r4
            k7.d6 r5 = r0.m8201f()
            k7.y2 r5 = (p185k7.C4049y2) r5
            p185k7.C3997u2.m9032B(r4, r2, r5)
            return
        L81:
            r4.m9008s(r0)
            return
    }

    /* renamed from: n */
    public static final boolean m11386n(p249o7.C5077q r1, p249o7.C5116u6 r2) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r1 = r2.f20032Z
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L17
            java.lang.String r1 = r2.f20047o0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L17
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    /* renamed from: o */
    public static final p185k7.C4049y2 m11387o(p185k7.C3997u2 r2, java.lang.String r3) {
            java.util.List r2 = r2.m9042A()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            k7.y2 r0 = (p185k7.C4049y2) r0
            java.lang.String r1 = r0.m9148y()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8
            return r0
        L1f:
            r2 = 0
            return r2
    }

    /* renamed from: p */
    public static final java.lang.Object m11388p(p185k7.C3997u2 r6, java.lang.String r7) {
            k7.y2 r6 = m11387o(r6, r7)
            if (r6 == 0) goto Lb6
            boolean r7 = r6.m9143P()
            if (r7 == 0) goto L11
            java.lang.String r6 = r6.m9149z()
            return r6
        L11:
            boolean r7 = r6.m9141N()
            if (r7 == 0) goto L20
            long r6 = r6.m9147v()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L20:
            boolean r7 = r6.m9139L()
            if (r7 == 0) goto L2f
            double r6 = r6.m9144s()
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            return r6
        L2f:
            int r7 = r6.m9146u()
            if (r7 <= 0) goto Lb6
            java.util.List r6 = r6.m9138A()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L42:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r6.next()
            k7.y2 r0 = (p185k7.C4049y2) r0
            if (r0 == 0) goto L42
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.List r0 = r0.m9138A()
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r0.next()
            k7.y2 r2 = (p185k7.C4049y2) r2
            boolean r3 = r2.m9143P()
            if (r3 == 0) goto L7b
            java.lang.String r3 = r2.m9148y()
            java.lang.String r2 = r2.m9149z()
            r1.putString(r3, r2)
            goto L5d
        L7b:
            boolean r3 = r2.m9141N()
            if (r3 == 0) goto L8d
            java.lang.String r3 = r2.m9148y()
            long r4 = r2.m9147v()
            r1.putLong(r3, r4)
            goto L5d
        L8d:
            boolean r3 = r2.m9139L()
            if (r3 == 0) goto L5d
            java.lang.String r3 = r2.m9148y()
            double r4 = r2.m9144s()
            r1.putDouble(r3, r4)
            goto L5d
        L9f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L42
            r7.add(r1)
            goto L42
        La9:
            int r6 = r7.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r6 = r7.toArray(r6)
            android.os.Bundle[] r6 = (android.os.Bundle[]) r6
            return r6
        Lb6:
            r6 = 0
            return r6
    }

    /* renamed from: s */
    public static final void m11389s(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            java.lang.String r1 = "  "
            r2.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    /* renamed from: t */
    public static final java.lang.String m11390t(boolean r1, boolean r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Dynamic "
            r0.append(r1)
        Lc:
            if (r2 == 0) goto L13
            java.lang.String r1 = "Sequence "
            r0.append(r1)
        L13:
            if (r3 == 0) goto L1a
            java.lang.String r1 = "Session-Scoped "
            r0.append(r1)
        L1a:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* renamed from: u */
    public static final void m11391u(java.lang.StringBuilder r9, int r10, java.lang.String r11, p185k7.C3840i3 r12) {
            if (r12 != 0) goto L3
            return
        L3:
            r10 = 3
            m11389s(r9, r10)
            r9.append(r11)
            java.lang.String r11 = " {\n"
            r9.append(r11)
            int r11 = r12.m8656t()
            r0 = 10
            r1 = 4
            java.lang.String r2 = ", "
            r3 = 0
            if (r11 == 0) goto L47
            m11389s(r9, r1)
            java.lang.String r11 = "results: "
            r9.append(r11)
            java.util.List r11 = r12.m8652C()
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L2c:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r11.next()
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r4 + 1
            if (r4 == 0) goto L3f
            r9.append(r2)
        L3f:
            r9.append(r5)
            r4 = r6
            goto L2c
        L44:
            r9.append(r0)
        L47:
            int r11 = r12.m8658v()
            if (r11 == 0) goto L79
            m11389s(r9, r1)
            java.lang.String r11 = "status: "
            r9.append(r11)
            java.util.List r11 = r12.m8654E()
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L5e:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r11.next()
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r4 + 1
            if (r4 == 0) goto L71
            r9.append(r2)
        L71:
            r9.append(r5)
            r4 = r6
            goto L5e
        L76:
            r9.append(r0)
        L79:
            int r11 = r12.m8655s()
            r0 = 0
            java.lang.String r4 = "}\n"
            if (r11 == 0) goto Ld6
            m11389s(r9, r1)
            java.lang.String r11 = "dynamic_filter_timestamps: {"
            r9.append(r11)
            java.util.List r11 = r12.m8651B()
            java.util.Iterator r11 = r11.iterator()
            r5 = 0
        L93:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r11.next()
            k7.s2 r6 = (p185k7.C3971s2) r6
            int r7 = r5 + 1
            if (r5 == 0) goto La6
            r9.append(r2)
        La6:
            boolean r5 = r6.m8949z()
            if (r5 == 0) goto Lb5
            int r5 = r6.m8946s()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto Lb6
        Lb5:
            r5 = r0
        Lb6:
            r9.append(r5)
            java.lang.String r5 = ":"
            r9.append(r5)
            boolean r5 = r6.m8948y()
            if (r5 == 0) goto Lcd
            long r5 = r6.m8947t()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto Lce
        Lcd:
            r5 = r0
        Lce:
            r9.append(r5)
            r5 = r7
            goto L93
        Ld3:
            r9.append(r4)
        Ld6:
            int r11 = r12.m8657u()
            if (r11 == 0) goto L147
            m11389s(r9, r1)
            java.lang.String r11 = "sequence_filter_timestamps: {"
            r9.append(r11)
            java.util.List r11 = r12.m8653D()
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        Led:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L144
            java.lang.Object r1 = r11.next()
            k7.k3 r1 = (p185k7.C3868k3) r1
            int r5 = r12 + 1
            if (r12 == 0) goto L100
            r9.append(r2)
        L100:
            boolean r12 = r1.m8758A()
            if (r12 == 0) goto L10f
            int r12 = r1.m8760t()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L110
        L10f:
            r12 = r0
        L110:
            r9.append(r12)
            java.lang.String r12 = ": ["
            r9.append(r12)
            java.util.List r12 = r1.m8762x()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
        L121:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L13d
            java.lang.Object r6 = r12.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = r1 + 1
            if (r1 == 0) goto L138
            r9.append(r2)
        L138:
            r9.append(r6)
            r1 = r8
            goto L121
        L13d:
            java.lang.String r12 = "]"
            r9.append(r12)
            r12 = r5
            goto Led
        L144:
            r9.append(r4)
        L147:
            m11389s(r9, r10)
            r9.append(r4)
            return
    }

    /* renamed from: v */
    public static final void m11392v(java.lang.StringBuilder r0, int r1, java.lang.String r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            return
        L3:
            int r1 = r1 + 1
            m11389s(r0, r1)
            r0.append(r2)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            r1 = 10
            r0.append(r1)
            return
    }

    /* renamed from: w */
    public static final void m11393w(java.lang.StringBuilder r1, int r2, java.lang.String r3, p185k7.C4048y1 r4) {
            if (r4 != 0) goto L3
            return
        L3:
            m11389s(r1, r2)
            r1.append(r3)
            java.lang.String r3 = " {\n"
            r1.append(r3)
            boolean r3 = r4.m9124y()
            if (r3 == 0) goto L37
            int r3 = r4.m9119D()
            r0 = 1
            if (r3 == r0) goto L30
            r0 = 2
            if (r3 == r0) goto L2d
            r0 = 3
            if (r3 == r0) goto L2a
            r0 = 4
            if (r3 == r0) goto L27
            java.lang.String r3 = "BETWEEN"
            goto L32
        L27:
            java.lang.String r3 = "EQUAL"
            goto L32
        L2a:
            java.lang.String r3 = "GREATER_THAN"
            goto L32
        L2d:
            java.lang.String r3 = "LESS_THAN"
            goto L32
        L30:
            java.lang.String r3 = "UNKNOWN_COMPARISON_TYPE"
        L32:
            java.lang.String r0 = "comparison_type"
            m11392v(r1, r2, r0, r3)
        L37:
            boolean r3 = r4.m9116A()
            if (r3 == 0) goto L4a
            boolean r3 = r4.m9123x()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "match_as_float"
            m11392v(r1, r2, r0, r3)
        L4a:
            boolean r3 = r4.m9125z()
            if (r3 == 0) goto L59
            java.lang.String r3 = r4.m9120u()
            java.lang.String r0 = "comparison_value"
            m11392v(r1, r2, r0, r3)
        L59:
            boolean r3 = r4.m9118C()
            if (r3 == 0) goto L68
            java.lang.String r3 = r4.m9122w()
            java.lang.String r0 = "min_comparison_value"
            m11392v(r1, r2, r0, r3)
        L68:
            boolean r3 = r4.m9117B()
            if (r3 == 0) goto L77
            java.lang.String r3 = r4.m9121v()
            java.lang.String r4 = "max_comparison_value"
            m11392v(r1, r2, r4, r3)
        L77:
            m11389s(r1, r2)
            java.lang.String r2 = "}\n"
            r1.append(r2)
            return
    }

    /* renamed from: x */
    public static int m11394x(p185k7.C3756c3 r2, java.lang.String r3) {
            r0 = 0
        L1:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r2.f16453Z
            k7.d3 r1 = (p185k7.C3770d3) r1
            int r1 = r1.m8461m1()
            if (r0 >= r1) goto L21
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r2.f16453Z
            k7.d3 r1 = (p185k7.C3770d3) r1
            k7.m3 r1 = r1.m8427B1(r0)
            java.lang.String r1 = r1.m8814x()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r2 = -1
            return r2
    }

    /* renamed from: A */
    public final <T extends android.os.Parcelable> T m11395A(byte[] r5, android.os.Parcelable.Creator<T> r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch: java.lang.Throwable -> L1a p270p6.C5368b.a -> L1c
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch: java.lang.Throwable -> L1a p270p6.C5368b.a -> L1c
            r1.setDataPosition(r3)     // Catch: java.lang.Throwable -> L1a p270p6.C5368b.a -> L1c
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L1a p270p6.C5368b.a -> L1c
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch: java.lang.Throwable -> L1a p270p6.C5368b.a -> L1c
            r1.recycle()
            return r5
        L1a:
            r5 = move-exception
            goto L2d
        L1c:
            com.google.android.gms.measurement.internal.d r5 = r4.f5736a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1a
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.m11169c(r6)     // Catch: java.lang.Throwable -> L1a
            r1.recycle()
            return r0
        L2d:
            r1.recycle()
            throw r5
    }

    /* renamed from: B */
    public final p249o7.C5077q m11396B(p185k7.C3738b r9) {
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f16463c
            r1 = 1
            android.os.Bundle r0 = r8.m11409z(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L1a
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "app"
        L1c:
            r5 = r1
            java.lang.String r1 = r9.f16461a
            java.lang.String r1 = p249o7.C5066o4.m11379b(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = r9.f16461a
        L27:
            r3 = r1
            o7.q r1 = new o7.q
            o7.o r4 = new o7.o
            r4.<init>(r0)
            long r6 = r9.f16462b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
    }

    /* renamed from: C */
    public final p185k7.C3997u2 m11397C(p249o7.C5045m r6) {
            r5 = this;
            k7.t2 r0 = p185k7.C3997u2.m9040w()
            long r1 = r6.f19837e
            boolean r3 = r0.f16454a0
            if (r3 == 0) goto L10
            r0.m8203j()
            r3 = 0
            r0.f16454a0 = r3
        L10:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r0.f16453Z
            k7.u2 r3 = (p185k7.C3997u2) r3
            p185k7.C3997u2.m9039I(r3, r1)
            o7.o r1 = r6.f19838f
            android.os.Bundle r1 = r1.f19913Y
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            k7.x2 r3 = p185k7.C4049y2.m9136w()
            r3.m9086r(r2)
            o7.o r4 = r6.f19838f
            android.os.Bundle r4 = r4.f19913Y
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r2, r4)
            r5.m11402K(r3, r2)
            r0.m9008s(r3)
            goto L23
        L4a:
            k7.d6 r6 = r0.m8201f()
            k7.u2 r6 = (p185k7.C3997u2) r6
            return r6
    }

    /* renamed from: E */
    public final java.lang.String m11398E(p185k7.C3742b3 r12) {
            r11 = this;
            java.lang.String r0 = "\nbatch {\n"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List r12 = r12.m8223v()
            java.util.Iterator r12 = r12.iterator()
        Le:
            boolean r1 = r12.hasNext()
            java.lang.String r2 = "}\n"
            if (r1 == 0) goto L390
            java.lang.Object r1 = r12.next()
            k7.d3 r1 = (p185k7.C3770d3) r1
            if (r1 == 0) goto Le
            r3 = 1
            m11389s(r0, r3)
            java.lang.String r4 = "bundle {\n"
            r0.append(r4)
            boolean r4 = r1.m8448b1()
            if (r4 == 0) goto L3a
            int r4 = r1.m8456j1()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "protocol_version"
            m11392v(r0, r3, r5, r4)
        L3a:
            java.lang.String r4 = r1.m8428C()
            java.lang.String r5 = "platform"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8444X0()
            if (r4 == 0) goto L56
            long r4 = r1.m8473s1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "gmp_version"
            m11392v(r0, r3, r5, r4)
        L56:
            boolean r4 = r1.m8454h1()
            if (r4 == 0) goto L69
            long r4 = r1.m8483x1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uploading_gmp_version"
            m11392v(r0, r3, r5, r4)
        L69:
            boolean r4 = r1.m8442V0()
            if (r4 == 0) goto L7c
            long r4 = r1.m8469q1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dynamite_version"
            m11392v(r0, r3, r5, r4)
        L7c:
            boolean r4 = r1.m8468q0()
            if (r4 == 0) goto L8f
            long r4 = r1.m8465o1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "config_version"
            m11392v(r0, r3, r5, r4)
        L8f:
            java.lang.String r4 = r1.m8486z()
            java.lang.String r5 = "gmp_app_id"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8429C1()
            java.lang.String r5 = "admob_app_id"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8431D1()
            java.lang.String r5 = "app_id"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8474t()
            java.lang.String r5 = "app_version"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8464o0()
            if (r4 == 0) goto Lc6
            int r4 = r1.m8437R()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "app_version_major"
            m11392v(r0, r3, r5, r4)
        Lc6:
            java.lang.String r4 = r1.m8482x()
            java.lang.String r5 = "firebase_instance_id"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8441U0()
            if (r4 == 0) goto Le2
            long r4 = r1.m8467p1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dev_cert_hash"
            m11392v(r0, r3, r5, r4)
        Le2:
            java.lang.String r4 = r1.m8472s()
            java.lang.String r5 = "app_store"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8453g1()
            if (r4 == 0) goto Lfe
            long r4 = r1.m8481w1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "upload_timestamp_millis"
            m11392v(r0, r3, r5, r4)
        Lfe:
            boolean r4 = r1.m8451e1()
            if (r4 == 0) goto L111
            long r4 = r1.m8479v1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "start_timestamp_millis"
            m11392v(r0, r3, r5, r4)
        L111:
            boolean r4 = r1.m8443W0()
            if (r4 == 0) goto L124
            long r4 = r1.m8471r1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "end_timestamp_millis"
            m11392v(r0, r3, r5, r4)
        L124:
            boolean r4 = r1.m8447a1()
            if (r4 == 0) goto L137
            long r4 = r1.m8477u1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "previous_bundle_start_timestamp_millis"
            m11392v(r0, r3, r5, r4)
        L137:
            boolean r4 = r1.m8446Z0()
            if (r4 == 0) goto L14a
            long r4 = r1.m8475t1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "previous_bundle_end_timestamp_millis"
            m11392v(r0, r3, r5, r4)
        L14a:
            java.lang.String r4 = r1.m8433E1()
            java.lang.String r5 = "app_instance_id"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8430D()
            java.lang.String r5 = "resettable_device_id"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8480w()
            java.lang.String r5 = "ds_id"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8445Y0()
            if (r4 == 0) goto L178
            boolean r4 = r1.m8458l0()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "limited_ad_tracking"
            m11392v(r0, r3, r5, r4)
        L178:
            java.lang.String r4 = r1.m8426B()
            java.lang.String r5 = "os_version"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8478v()
            java.lang.String r5 = "device_model"
            m11392v(r0, r3, r5, r4)
            java.lang.String r4 = r1.m8432E()
            java.lang.String r5 = "user_default_language"
            m11392v(r0, r3, r5, r4)
            boolean r4 = r1.m8452f1()
            if (r4 == 0) goto L1a6
            int r4 = r1.m8459l1()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "time_zone_offset_minutes"
            m11392v(r0, r3, r5, r4)
        L1a6:
            boolean r4 = r1.m8466p0()
            if (r4 == 0) goto L1b9
            int r4 = r1.m8438R0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "bundle_sequential_index"
            m11392v(r0, r3, r5, r4)
        L1b9:
            boolean r4 = r1.m8450d1()
            if (r4 == 0) goto L1cc
            boolean r4 = r1.m8460m0()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "service_upload"
            m11392v(r0, r3, r5, r4)
        L1cc:
            java.lang.String r4 = r1.m8425A()
            java.lang.String r5 = "health_monitor"
            m11392v(r0, r3, r5, r4)
            com.google.android.gms.measurement.internal.d r4 = r11.f5736a
            o7.f r4 = r4.f5716g
            o7.u2<java.lang.Boolean> r5 = p249o7.C5120v2.f20107m0
            r6 = 0
            boolean r4 = r4.m11162v(r6, r5)
            if (r4 != 0) goto L1ff
            boolean r4 = r1.m8462n0()
            if (r4 == 0) goto L1ff
            long r4 = r1.m8463n1()
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L1ff
            long r4 = r1.m8463n1()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "android_id"
            m11392v(r0, r3, r5, r4)
        L1ff:
            boolean r4 = r1.m8449c1()
            if (r4 == 0) goto L212
            int r4 = r1.m8457k1()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "retry_counter"
            m11392v(r0, r3, r5, r4)
        L212:
            boolean r4 = r1.m8470r0()
            if (r4 == 0) goto L221
            java.lang.String r4 = r1.m8476u()
            java.lang.String r5 = "consent_signals"
            m11392v(r0, r3, r5, r4)
        L221:
            java.util.List r4 = r1.m8436H()
            java.lang.String r5 = "name"
            r7 = 2
            if (r4 != 0) goto L22c
            goto L2a4
        L22c:
            java.util.Iterator r4 = r4.iterator()
        L230:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L2a4
            java.lang.Object r8 = r4.next()
            k7.m3 r8 = (p185k7.C3894m3) r8
            if (r8 == 0) goto L230
            m11389s(r0, r7)
            java.lang.String r9 = "user_property {\n"
            r0.append(r9)
            boolean r9 = r8.m8809J()
            if (r9 == 0) goto L255
            long r9 = r8.m8813u()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L256
        L255:
            r9 = r6
        L256:
            java.lang.String r10 = "set_timestamp_millis"
            m11392v(r0, r7, r10, r9)
            com.google.android.gms.measurement.internal.d r9 = r11.f5736a
            o7.c3 r9 = r9.f5722m
            java.lang.String r10 = r8.m8814x()
            java.lang.String r9 = r9.m11118f(r10)
            m11392v(r0, r7, r5, r9)
            java.lang.String r9 = r8.m8815y()
            java.lang.String r10 = "string_value"
            m11392v(r0, r7, r10, r9)
            boolean r9 = r8.m8808I()
            if (r9 == 0) goto L282
            long r9 = r8.m8812t()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L283
        L282:
            r9 = r6
        L283:
            java.lang.String r10 = "int_value"
            m11392v(r0, r7, r10, r9)
            boolean r9 = r8.m8807H()
            if (r9 == 0) goto L297
            double r8 = r8.m8811s()
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            goto L298
        L297:
            r8 = r6
        L298:
            java.lang.String r9 = "double_value"
            m11392v(r0, r7, r9, r8)
            m11389s(r0, r7)
            r0.append(r2)
            goto L230
        L2a4:
            java.util.List r4 = r1.m8434F()
            if (r4 != 0) goto L2ab
            goto L30a
        L2ab:
            java.util.Iterator r4 = r4.iterator()
        L2af:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L30a
            java.lang.Object r6 = r4.next()
            k7.q2 r6 = (p185k7.C3945q2) r6
            if (r6 == 0) goto L2af
            m11389s(r0, r7)
            java.lang.String r8 = "audience_membership {\n"
            r0.append(r8)
            boolean r8 = r6.m8901C()
            if (r8 == 0) goto L2d8
            int r8 = r6.m8904s()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "audience_id"
            m11392v(r0, r7, r9, r8)
        L2d8:
            boolean r8 = r6.m8902D()
            if (r8 == 0) goto L2eb
            boolean r8 = r6.m8900B()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "new_audience"
            m11392v(r0, r7, r9, r8)
        L2eb:
            k7.i3 r8 = r6.m8905v()
            java.lang.String r9 = "current_data"
            m11391u(r0, r7, r9, r8)
            boolean r8 = r6.m8903E()
            if (r8 == 0) goto L303
            k7.i3 r6 = r6.m8906w()
            java.lang.String r8 = "previous_data"
            m11391u(r0, r7, r8, r6)
        L303:
            m11389s(r0, r7)
            r0.append(r2)
            goto L2af
        L30a:
            java.util.List r1 = r1.m8435G()
            if (r1 != 0) goto L312
            goto L388
        L312:
            java.util.Iterator r1 = r1.iterator()
        L316:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L388
            java.lang.Object r4 = r1.next()
            k7.u2 r4 = (p185k7.C3997u2) r4
            if (r4 == 0) goto L316
            m11389s(r0, r7)
            java.lang.String r6 = "event {\n"
            r0.append(r6)
            com.google.android.gms.measurement.internal.d r6 = r11.f5736a
            o7.c3 r6 = r6.f5722m
            java.lang.String r8 = r4.m9052z()
            java.lang.String r6 = r6.m11116d(r8)
            m11392v(r0, r7, r5, r6)
            boolean r6 = r4.m9045L()
            if (r6 == 0) goto L34e
            long r8 = r4.m9050v()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "timestamp_millis"
            m11392v(r0, r7, r8, r6)
        L34e:
            boolean r6 = r4.m9044K()
            if (r6 == 0) goto L361
            long r8 = r4.m9049u()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "previous_timestamp_millis"
            m11392v(r0, r7, r8, r6)
        L361:
            boolean r6 = r4.m9043J()
            if (r6 == 0) goto L374
            int r6 = r4.m9047s()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "count"
            m11392v(r0, r7, r8, r6)
        L374:
            int r6 = r4.m9048t()
            if (r6 == 0) goto L381
            java.util.List r4 = r4.m9042A()
            r11.m11406q(r0, r7, r4)
        L381:
            m11389s(r0, r7)
            r0.append(r2)
            goto L316
        L388:
            m11389s(r0, r3)
            r0.append(r2)
            goto Le
        L390:
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            return r12
    }

    /* renamed from: F */
    public final java.lang.String m11399F(p185k7.C3727a2 r6) {
            r5 = this;
            java.lang.String r0 = "\nproperty_filter {\n"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r6.m8187B()
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r6.m8190s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "filter_id"
            m11392v(r0, r2, r3, r1)
        L1a:
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r3 = r6.m8192w()
            java.lang.String r1 = r1.m11118f(r3)
            java.lang.String r3 = "property_name"
            m11392v(r0, r2, r3, r1)
            boolean r1 = r6.m8193y()
            boolean r3 = r6.m8194z()
            boolean r4 = r6.m8186A()
            java.lang.String r1 = m11390t(r1, r3, r4)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L46
            java.lang.String r3 = "filter_type"
            m11392v(r0, r2, r3, r1)
        L46:
            r1 = 1
            k7.u1 r6 = r6.m8191t()
            r5.m11407r(r0, r1, r6)
            java.lang.String r6 = "}\n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* renamed from: H */
    public final java.util.List<java.lang.Long> m11400H(java.util.List<java.lang.Long> r8, java.util.List<java.lang.Integer> r9) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L68
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r1 = r9.intValue()
            if (r1 >= 0) goto L29
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = "Ignoring negative bit index to be cleared"
            r1.m11170d(r2, r9)
            goto L9
        L29:
            int r1 = r9.intValue()
            int r1 = r1 / 64
            int r2 = r0.size()
            if (r1 < r2) goto L4b
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Ignoring bit index greater than bitSet size"
            r1.m11171e(r3, r9, r2)
            goto L9
        L4b:
            java.lang.Object r2 = r0.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4 = 1
            int r9 = r9.intValue()
            int r9 = r9 % 64
            long r4 = r4 << r9
            long r4 = ~r4
            long r2 = r2 & r4
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r0.set(r1, r9)
            goto L9
        L68:
            int r8 = r0.size()
            int r9 = r0.size()
            int r9 = r9 + (-1)
        L72:
            r6 = r9
            r9 = r8
            r8 = r6
            if (r8 < 0) goto L8b
            java.lang.Object r1 = r0.get(r8)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L88
            goto L8b
        L88:
            int r9 = r8 + (-1)
            goto L72
        L8b:
            r8 = 0
            java.util.List r8 = r0.subList(r8, r9)
            return r8
    }

    /* renamed from: J */
    public final java.util.Map<java.lang.String, java.lang.Object> m11401J(android.os.Bundle r11, boolean r12) {
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L54
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L40:
            if (r7 >= r5) goto L82
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L51
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m11401J(r8, r6)
            r4.add(r8)
        L51:
            int r7 = r7 + 1
            goto L40
        L54:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L75
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L5f:
            if (r7 >= r5) goto L82
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L72
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m11401J(r8, r6)
            r4.add(r8)
        L72:
            int r7 = r7 + 1
            goto L5f
        L75:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L82
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m11401J(r3, r6)
            r4.add(r3)
        L82:
            r0.put(r2, r4)
            goto Ld
        L86:
            return r0
    }

    /* renamed from: K */
    public final void m11402K(p185k7.C4036x2 r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r3.f16454a0
            r1 = 0
            if (r0 == 0) goto La
            r3.m8203j()
            r3.f16454a0 = r1
        La:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.y2 r0 = (p185k7.C4049y2) r0
            p185k7.C4049y2.m9128D(r0)
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto L1a
            r3.m8203j()
            r3.f16454a0 = r1
        L1a:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.y2 r0 = (p185k7.C4049y2) r0
            p185k7.C4049y2.m9130F(r0)
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto L2a
            r3.m8203j()
            r3.f16454a0 = r1
        L2a:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.y2 r0 = (p185k7.C4049y2) r0
            p185k7.C4049y2.m9132H(r0)
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto L3a
            r3.m8203j()
            r3.f16454a0 = r1
        L3a:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.y2 r0 = (p185k7.C4049y2) r0
            p185k7.C4049y2.m9135K(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L4b
            java.lang.String r4 = (java.lang.String) r4
            r3.m9087s(r4)
            return
        L4b:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L59
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r3.m9085q(r0)
            return
        L59:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L67
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r3.m9084p(r0)
            return
        L67:
            boolean r0 = r4 instanceof android.os.Bundle[]
            if (r0 == 0) goto L82
            android.os.Bundle[] r4 = (android.os.Bundle[]) r4
            java.util.List r4 = m11381G(r4)
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto L7a
            r3.m8203j()
            r3.f16454a0 = r1
        L7a:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r3.f16453Z
            k7.y2 r3 = (p185k7.C4049y2) r3
            p185k7.C4049y2.m9134J(r3, r4)
            return
        L82:
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5672f
            java.lang.String r0 = "Ignoring invalid (type) event param value"
            r3.m11170d(r0, r4)
            return
    }

    /* renamed from: L */
    public final void m11403L(p185k7.C3881l3 r5, java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r0 = r5.f16454a0
            r1 = 0
            if (r0 == 0) goto Lf
            r5.m8203j()
            r5.f16454a0 = r1
        Lf:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r5.f16453Z
            k7.m3 r0 = (p185k7.C3894m3) r0
            p185k7.C3894m3.m8799C(r0)
            boolean r0 = r5.f16454a0
            if (r0 == 0) goto L1f
            r5.m8203j()
            r5.f16454a0 = r1
        L1f:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r5.f16453Z
            k7.m3 r0 = (p185k7.C3894m3) r0
            p185k7.C3894m3.m8801E(r0)
            boolean r0 = r5.f16454a0
            if (r0 == 0) goto L2f
            r5.m8203j()
            r5.f16454a0 = r1
        L2f:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r5.f16453Z
            k7.m3 r0 = (p185k7.C3894m3) r0
            p185k7.C3894m3.m8803G(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L4d
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r5.f16454a0
            if (r0 == 0) goto L45
            r5.m8203j()
            r5.f16454a0 = r1
        L45:
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r5.f16453Z
            k7.m3 r5 = (p185k7.C3894m3) r5
            p185k7.C3894m3.m8798B(r5, r6)
            return
        L4d:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L5b
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r5.m8791p(r0)
            return
        L5b:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L76
            java.lang.Double r6 = (java.lang.Double) r6
            double r2 = r6.doubleValue()
            boolean r6 = r5.f16454a0
            if (r6 == 0) goto L6e
            r5.m8203j()
            r5.f16454a0 = r1
        L6e:
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r5.f16453Z
            k7.m3 r5 = (p185k7.C3894m3) r5
            p185k7.C3894m3.m8802F(r5, r2)
            return
        L76:
            com.google.android.gms.measurement.internal.d r5 = r4.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5672f
            java.lang.String r0 = "Ignoring invalid (type) user attribute value"
            r5.m11170d(r0, r6)
            return
    }

    /* renamed from: N */
    public final boolean m11404N(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r4 = java.lang.Math.abs(r0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L21
            goto L23
        L21:
            r4 = 0
            return r4
        L23:
            r4 = 1
            return r4
    }

    /* renamed from: P */
    public final byte[] m11405P(byte[] r3) {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L18
            r0.<init>()     // Catch: java.io.IOException -> L18
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L18
            r1.<init>(r0)     // Catch: java.io.IOException -> L18
            r1.write(r3)     // Catch: java.io.IOException -> L18
            r1.close()     // Catch: java.io.IOException -> L18
            r0.close()     // Catch: java.io.IOException -> L18
            byte[] r3 = r0.toByteArray()     // Catch: java.io.IOException -> L18
            return r3
        L18:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Failed to gzip content"
            r0.m11170d(r1, r3)
            throw r3
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: q */
    public final void m11406q(java.lang.StringBuilder r6, int r7, java.util.List<p185k7.C4049y2> r8) {
            r5 = this;
            if (r8 != 0) goto L3
            return
        L3:
            int r7 = r7 + 1
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r8.next()
            k7.y2 r0 = (p185k7.C4049y2) r0
            if (r0 == 0) goto L9
            m11389s(r6, r7)
            java.lang.String r1 = "param {\n"
            r6.append(r1)
            boolean r1 = r0.m9142O()
            r2 = 0
            if (r1 == 0) goto L33
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r3 = r0.m9148y()
            java.lang.String r1 = r1.m11117e(r3)
            goto L34
        L33:
            r1 = r2
        L34:
            java.lang.String r3 = "name"
            m11392v(r6, r7, r3, r1)
            boolean r1 = r0.m9143P()
            if (r1 == 0) goto L44
            java.lang.String r1 = r0.m9149z()
            goto L45
        L44:
            r1 = r2
        L45:
            java.lang.String r3 = "string_value"
            m11392v(r6, r7, r3, r1)
            boolean r1 = r0.m9141N()
            if (r1 == 0) goto L59
            long r3 = r0.m9147v()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L5a
        L59:
            r1 = r2
        L5a:
            java.lang.String r3 = "int_value"
            m11392v(r6, r7, r3, r1)
            boolean r1 = r0.m9139L()
            if (r1 == 0) goto L6d
            double r1 = r0.m9144s()
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L6d:
            java.lang.String r1 = "double_value"
            m11392v(r6, r7, r1, r2)
            int r1 = r0.m9146u()
            if (r1 <= 0) goto L7f
            java.util.List r0 = r0.m9138A()
            r5.m11406q(r6, r7, r0)
        L7f:
            m11389s(r6, r7)
            java.lang.String r0 = "}\n"
            r6.append(r0)
            goto L9
        L88:
            return
    }

    /* renamed from: r */
    public final void m11407r(java.lang.StringBuilder r6, int r7, p185k7.C3996u1 r8) {
            r5 = this;
            if (r8 != 0) goto L3
            return
        L3:
            m11389s(r6, r7)
            java.lang.String r0 = "filter {\n"
            r6.append(r0)
            boolean r0 = r8.m9031z()
            if (r0 == 0) goto L1e
            boolean r0 = r8.m9030y()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "complement"
            m11392v(r6, r7, r1, r0)
        L1e:
            boolean r0 = r8.m9025B()
            if (r0 == 0) goto L35
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.c3 r0 = r0.f5722m
            java.lang.String r1 = r8.m9029w()
            java.lang.String r0 = r0.m11117e(r1)
            java.lang.String r1 = "param_name"
            m11392v(r6, r7, r1, r0)
        L35:
            boolean r0 = r8.m9026C()
            java.lang.String r1 = "}\n"
            if (r0 == 0) goto Ld2
            int r0 = r7 + 1
            k7.e2 r2 = r8.m9028v()
            if (r2 != 0) goto L47
            goto Ld2
        L47:
            m11389s(r6, r0)
            java.lang.String r3 = "string_filter {\n"
            r6.append(r3)
            boolean r3 = r2.m8510A()
            if (r3 == 0) goto L75
            int r3 = r2.m8511B()
            switch(r3) {
                case 1: goto L6e;
                case 2: goto L6b;
                case 3: goto L68;
                case 4: goto L65;
                case 5: goto L62;
                case 6: goto L5f;
                default: goto L5c;
            }
        L5c:
            java.lang.String r3 = "IN_LIST"
            goto L70
        L5f:
            java.lang.String r3 = "EXACT"
            goto L70
        L62:
            java.lang.String r3 = "PARTIAL"
            goto L70
        L65:
            java.lang.String r3 = "ENDS_WITH"
            goto L70
        L68:
            java.lang.String r3 = "BEGINS_WITH"
            goto L70
        L6b:
            java.lang.String r3 = "REGEXP"
            goto L70
        L6e:
            java.lang.String r3 = "UNKNOWN_MATCH_TYPE"
        L70:
            java.lang.String r4 = "match_type"
            m11392v(r6, r0, r4, r3)
        L75:
            boolean r3 = r2.m8517z()
            if (r3 == 0) goto L84
            java.lang.String r3 = r2.m8513v()
            java.lang.String r4 = "expression"
            m11392v(r6, r0, r4, r3)
        L84:
            boolean r3 = r2.m8516y()
            if (r3 == 0) goto L97
            boolean r3 = r2.m8515x()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "case_sensitive"
            m11392v(r6, r0, r4, r3)
        L97:
            int r3 = r2.m8512s()
            if (r3 <= 0) goto Lcc
            int r3 = r0 + 1
            m11389s(r6, r3)
            java.lang.String r3 = "expression_list {\n"
            r6.append(r3)
            java.util.List r2 = r2.m8514w()
            java.util.Iterator r2 = r2.iterator()
        Laf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r0 + 2
            m11389s(r6, r4)
            r6.append(r3)
            java.lang.String r3 = "\n"
            r6.append(r3)
            goto Laf
        Lc9:
            r6.append(r1)
        Lcc:
            m11389s(r6, r0)
            r6.append(r1)
        Ld2:
            boolean r0 = r8.m9024A()
            if (r0 == 0) goto Le3
            int r0 = r7 + 1
            k7.y1 r8 = r8.m9027u()
            java.lang.String r2 = "number_filter"
            m11393w(r6, r0, r2, r8)
        Le3:
            m11389s(r6, r7)
            r6.append(r1)
            return
    }

    /* renamed from: y */
    public final long m11408y(byte[] r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            r0.mo3183i()
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = com.google.android.gms.measurement.internal.C1115f.m3193s(r0)
            if (r0 != 0) goto L21
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5672f
            java.lang.String r0 = "Failed to get MD5"
            r3.m11169c(r0)
            r0 = 0
            return r0
        L21:
            byte[] r3 = r0.digest(r3)
            long r0 = com.google.android.gms.measurement.internal.C1115f.m3192n0(r3)
            return r0
    }

    /* renamed from: z */
    public final android.os.Bundle m11409z(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
            r9 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            if (r3 != 0) goto L24
            r3 = 0
        L20:
            r0.putString(r2, r3)
            goto Ld
        L24:
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L32
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.putLong(r2, r3)
            goto Ld
        L32:
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 == 0) goto L40
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r0.putDouble(r2, r3)
            goto Ld
        L40:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L69
            if (r11 == 0) goto Ld
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.size()
            r6 = 0
            r7 = 0
        L53:
            if (r7 >= r5) goto L65
            java.lang.Object r8 = r3.get(r7)
            java.util.Map r8 = (java.util.Map) r8
            android.os.Bundle r8 = r9.m11409z(r8, r6)
            r4.add(r8)
            int r7 = r7 + 1
            goto L53
        L65:
            r0.putParcelableArrayList(r2, r4)
            goto Ld
        L69:
            java.lang.String r3 = r3.toString()
            goto L20
        L6e:
            return r0
    }
}
