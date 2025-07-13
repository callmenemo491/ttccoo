package p269p5;

/* renamed from: p5.d */
/* loaded from: classes.dex */
public final class C5363d {

    /* renamed from: a */
    public final java.lang.String f21318a;

    /* renamed from: b */
    public final java.lang.String f21319b;

    /* renamed from: c */
    public final boolean f21320c;

    /* renamed from: d */
    public final long f21321d;

    /* renamed from: e */
    public final long f21322e;

    /* renamed from: f */
    public final p269p5.C5365f f21323f;

    /* renamed from: g */
    public final java.lang.String[] f21324g;

    /* renamed from: h */
    public final java.lang.String f21325h;

    /* renamed from: i */
    public final java.lang.String f21326i;

    /* renamed from: j */
    public final p269p5.C5363d f21327j;

    /* renamed from: k */
    public final java.util.HashMap<java.lang.String, java.lang.Integer> f21328k;

    /* renamed from: l */
    public final java.util.HashMap<java.lang.String, java.lang.Integer> f21329l;

    /* renamed from: m */
    public java.util.List<p269p5.C5363d> f21330m;

    public C5363d(java.lang.String r1, java.lang.String r2, long r3, long r5, p269p5.C5365f r7, java.lang.String[] r8, java.lang.String r9, java.lang.String r10, p269p5.C5363d r11) {
            r0 = this;
            r0.<init>()
            r0.f21318a = r1
            r0.f21319b = r2
            r0.f21326i = r10
            r0.f21323f = r7
            r0.f21324g = r8
            if (r2 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.f21320c = r1
            r0.f21321d = r3
            r0.f21322e = r5
            java.util.Objects.requireNonNull(r9)
            r0.f21325h = r9
            r0.f21327j = r11
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f21328k = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f21329l = r1
            return
    }

    /* renamed from: b */
    public static p269p5.C5363d m11679b(java.lang.String r13) {
            p5.d r12 = new p5.d
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r\n"
            java.lang.String r13 = r13.replaceAll(r1, r0)
            java.lang.String r1 = " *\n *"
            java.lang.String r13 = r13.replaceAll(r1, r0)
            java.lang.String r1 = " "
            java.lang.String r13 = r13.replaceAll(r0, r1)
            java.lang.String r0 = "[ \t\\x0B\f\r]+"
            java.lang.String r2 = r13.replaceAll(r0, r1)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r1 = 0
            java.lang.String r9 = ""
            r0 = r12
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
    }

    /* renamed from: f */
    public static android.text.SpannableStringBuilder m11680f(java.lang.String r2, java.util.Map<java.lang.String, p143i5.C3077a.b> r3) {
            boolean r0 = r3.containsKey(r2)
            if (r0 != 0) goto L15
            i5.a$b r0 = new i5.a$b
            r0.<init>()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r0.f12403a = r1
            r3.put(r2, r0)
        L15:
            java.lang.Object r2 = r3.get(r2)
            i5.a$b r2 = (p143i5.C3077a.b) r2
            java.lang.CharSequence r2 = r2.f12403a
            java.util.Objects.requireNonNull(r2)
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            return r2
    }

    /* renamed from: a */
    public void m11681a(p269p5.C5363d r2) {
            r1 = this;
            java.util.List<p5.d> r0 = r1.f21330m
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f21330m = r0
        Lb:
            java.util.List<p5.d> r0 = r1.f21330m
            r0.add(r2)
            return
    }

    /* renamed from: c */
    public p269p5.C5363d m11682c(int r2) {
            r1 = this;
            java.util.List<p5.d> r0 = r1.f21330m
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            p5.d r2 = (p269p5.C5363d) r2
            return r2
        Lb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    /* renamed from: d */
    public int m11683d() {
            r1 = this;
            java.util.List<p5.d> r0 = r1.f21330m
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    /* renamed from: e */
    public final void m11684e(java.util.TreeSet<java.lang.Long> r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = r6.f21318a
            java.lang.String r1 = "p"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = r6.f21318a
            java.lang.String r2 = "div"
            boolean r1 = r2.equals(r1)
            if (r8 != 0) goto L1a
            if (r0 != 0) goto L1a
            if (r1 == 0) goto L39
            java.lang.String r1 = r6.f21326i
            if (r1 == 0) goto L39
        L1a:
            long r1 = r6.f21321d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.add(r1)
        L2c:
            long r1 = r6.f21322e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.add(r1)
        L39:
            java.util.List<p5.d> r1 = r6.f21330m
            if (r1 != 0) goto L3e
            return
        L3e:
            r1 = 0
            r2 = 0
        L40:
            java.util.List<p5.d> r3 = r6.f21330m
            int r3 = r3.size()
            if (r2 >= r3) goto L5e
            java.util.List<p5.d> r3 = r6.f21330m
            java.lang.Object r3 = r3.get(r2)
            p5.d r3 = (p269p5.C5363d) r3
            if (r8 != 0) goto L57
            if (r0 == 0) goto L55
            goto L57
        L55:
            r4 = 0
            goto L58
        L57:
            r4 = 1
        L58:
            r3.m11684e(r7, r4)
            int r2 = r2 + 1
            goto L40
        L5e:
            return
    }

    /* renamed from: g */
    public boolean m11685g(long r8) {
            r7 = this;
            long r0 = r7.f21321d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            long r4 = r7.f21322e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
        L11:
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L1b
            long r4 = r7.f21322e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
        L1b:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L25
            long r2 = r7.f21322e
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
        L25:
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L31
            long r0 = r7.f21322e
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L31
        L2f:
            r8 = 1
            goto L32
        L31:
            r8 = 0
        L32:
            return r8
    }

    /* renamed from: h */
    public final void m11686h(long r3, java.lang.String r5, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r6) {
            r2 = this;
            java.lang.String r0 = r2.f21325h
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r5 = r2.f21325h
        Ld:
            boolean r0 = r2.m11685g(r3)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.f21318a
            java.lang.String r1 = "div"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.f21326i
            if (r0 == 0) goto L2c
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = r2.f21326i
            r3.<init>(r5, r4)
            r6.add(r3)
            return
        L2c:
            r0 = 0
        L2d:
            int r1 = r2.m11683d()
            if (r0 >= r1) goto L3d
            p5.d r1 = r2.m11682c(r0)
            r1.m11686h(r3, r5, r6)
            int r0 = r0 + 1
            goto L2d
        L3d:
            return
    }

    /* renamed from: i */
    public final void m11687i(long r18, java.util.Map<java.lang.String, p269p5.C5365f> r20, java.util.Map<java.lang.String, p269p5.C5364e> r21, java.lang.String r22, java.util.Map<java.lang.String, p143i5.C3077a.b> r23) {
            r17 = this;
            r0 = r17
            r8 = r20
            boolean r1 = r17.m11685g(r18)
            if (r1 != 0) goto Lb
            return
        Lb:
            java.lang.String r1 = r0.f21325h
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L18
            r9 = r22
            goto L1b
        L18:
            java.lang.String r1 = r0.f21325h
            r9 = r1
        L1b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f21329l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L254
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f21328k
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L4c
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f21328k
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 == r2) goto L24a
            r10 = r23
            java.lang.Object r4 = r10.get(r4)
            i5.a$b r4 = (p143i5.C3077a.b) r4
            java.util.Objects.requireNonNull(r4)
            r11 = r21
            java.lang.Object r6 = r11.get(r9)
            p5.e r6 = (p269p5.C5364e) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.f21340j
            p5.f r7 = r0.f21323f
            java.lang.String[] r12 = r0.f21324g
            p5.f r7 = p064e.C1492f.m4048h(r7, r12, r8)
            java.lang.CharSequence r12 = r4.f12403a
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
            if (r12 != 0) goto L86
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r4.f12403a = r12
        L86:
            if (r7 == 0) goto L24e
            p5.d r13 = r0.f21327j
            int r14 = r7.m11690b()
            r15 = 33
            r3 = -1
            if (r14 == r3) goto L9f
            android.text.style.StyleSpan r14 = new android.text.style.StyleSpan
            int r3 = r7.m11690b()
            r14.<init>(r3)
            r12.setSpan(r14, r5, r2, r15)
        L9f:
            int r3 = r7.f21346f
            r14 = 1
            if (r3 != r14) goto La6
            r3 = 1
            goto La7
        La6:
            r3 = 0
        La7:
            if (r3 == 0) goto Lb1
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r15)
        Lb1:
            int r3 = r7.f21347g
            if (r3 != r14) goto Lb7
            r3 = 1
            goto Lb8
        Lb7:
            r3 = 0
        Lb8:
            if (r3 == 0) goto Lc2
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r15)
        Lc2:
            boolean r3 = r7.f21343c
            if (r3 == 0) goto Ldd
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            boolean r14 = r7.f21343c
            if (r14 == 0) goto Ld5
            int r14 = r7.f21342b
            r3.<init>(r14)
            p064e.C1487a.m4023a(r12, r3, r5, r2, r15)
            goto Ldd
        Ld5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Font color has not been defined."
            r1.<init>(r2)
            throw r1
        Ldd:
            boolean r3 = r7.f21345e
            if (r3 == 0) goto Lf8
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            boolean r14 = r7.f21345e
            if (r14 == 0) goto Lf0
            int r14 = r7.f21344d
            r3.<init>(r14)
            p064e.C1487a.m4023a(r12, r3, r5, r2, r15)
            goto Lf8
        Lf0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Background color has not been defined."
            r1.<init>(r2)
            throw r1
        Lf8:
            java.lang.String r3 = r7.f21341a
            if (r3 == 0) goto L106
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            java.lang.String r14 = r7.f21341a
            r3.<init>(r14)
            p064e.C1487a.m4023a(r12, r3, r5, r2, r15)
        L106:
            p5.b r3 = r7.f21358r
            r14 = 2
            if (r3 == 0) goto L131
            int r15 = r3.f21299a
            r16 = r1
            r1 = -1
            if (r15 != r1) goto L11e
            if (r6 == r14) goto L11a
            r1 = 1
            if (r6 != r1) goto L118
            goto L11a
        L118:
            r1 = 1
            goto L11b
        L11a:
            r1 = 3
        L11b:
            r15 = r1
            r1 = 1
            goto L120
        L11e:
            int r1 = r3.f21300b
        L120:
            int r3 = r3.f21301c
            r6 = -2
            if (r3 != r6) goto L126
            r3 = 1
        L126:
            m5.d r6 = new m5.d
            r6.<init>(r15, r1, r3)
            r1 = 33
            p064e.C1487a.m4023a(r12, r6, r5, r2, r1)
            goto L133
        L131:
            r16 = r1
        L133:
            int r1 = r7.f21353m
            if (r1 == r14) goto L148
            r3 = 3
            if (r1 == r3) goto L13e
            r3 = 4
            if (r1 == r3) goto L13e
            goto L19b
        L13e:
            p5.a r1 = new p5.a
            r1.<init>()
            r3 = 0
        L144:
            r6 = 33
            goto L1da
        L148:
            if (r13 == 0) goto L15d
            p5.f r3 = r13.f21323f
            java.lang.String[] r6 = r13.f21324g
            p5.f r3 = p064e.C1492f.m4048h(r3, r6, r8)
            if (r3 == 0) goto L15a
            int r3 = r3.f21353m
            r6 = 1
            if (r3 != r6) goto L15a
            goto L15e
        L15a:
            p5.d r13 = r13.f21327j
            goto L148
        L15d:
            r13 = 0
        L15e:
            if (r13 != 0) goto L161
            goto L19b
        L161:
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r3.push(r13)
        L169:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L198
            java.lang.Object r6 = r3.pop()
            p5.d r6 = (p269p5.C5363d) r6
            p5.f r15 = r6.f21323f
            java.lang.String[] r1 = r6.f21324g
            p5.f r1 = p064e.C1492f.m4048h(r15, r1, r8)
            if (r1 == 0) goto L186
            int r1 = r1.f21353m
            r15 = 3
            if (r1 != r15) goto L186
            r1 = r6
            goto L199
        L186:
            int r1 = r6.m11683d()
            r15 = -1
            int r1 = r1 + r15
        L18c:
            if (r1 < 0) goto L169
            p5.d r15 = r6.m11682c(r1)
            r3.push(r15)
            int r1 = r1 + (-1)
            goto L18c
        L198:
            r1 = 0
        L199:
            if (r1 != 0) goto L19d
        L19b:
            r3 = 0
            goto L1e6
        L19d:
            int r3 = r1.m11683d()
            r6 = 1
            if (r3 != r6) goto L1de
            r3 = 0
            p5.d r6 = r1.m11682c(r3)
            java.lang.String r6 = r6.f21319b
            if (r6 == 0) goto L1df
            p5.d r6 = r1.m11682c(r3)
            java.lang.String r6 = r6.f21319b
            int r15 = p371v5.C6552b0.f25624a
            p5.f r15 = r1.f21323f
            java.lang.String[] r1 = r1.f21324g
            p5.f r1 = p064e.C1492f.m4048h(r15, r1, r8)
            if (r1 == 0) goto L1c2
            int r1 = r1.f21354n
            goto L1c3
        L1c2:
            r1 = -1
        L1c3:
            r15 = -1
            if (r1 != r15) goto L1d2
            p5.f r15 = r13.f21323f
            java.lang.String[] r13 = r13.f21324g
            p5.f r13 = p064e.C1492f.m4048h(r15, r13, r8)
            if (r13 == 0) goto L1d2
            int r1 = r13.f21354n
        L1d2:
            m5.c r13 = new m5.c
            r13.<init>(r6, r1)
            r1 = r13
            goto L144
        L1da:
            r12.setSpan(r1, r5, r2, r6)
            goto L1e6
        L1de:
            r3 = 0
        L1df:
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r6 = "Skipping rubyText node without exactly one text child."
            android.util.Log.i(r1, r6)
        L1e6:
            int r1 = r7.f21357q
            r6 = 1
            if (r1 != r6) goto L1ec
            r3 = 1
        L1ec:
            if (r3 == 0) goto L1f8
            m5.a r1 = new m5.a
            r1.<init>()
            r3 = 33
            p064e.C1487a.m4023a(r12, r1, r5, r2, r3)
        L1f8:
            int r1 = r7.f21350j
            r3 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r6) goto L215
            if (r1 == r14) goto L20d
            r6 = 3
            if (r1 == r6) goto L204
            goto L223
        L204:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r6 = r7.f21351k
            float r6 = r6 / r3
            r1.<init>(r6)
            goto L21e
        L20d:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r6 = r7.f21351k
            r1.<init>(r6)
            goto L21e
        L215:
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r6 = r7.f21351k
            int r6 = (int) r6
            r13 = 1
            r1.<init>(r6, r13)
        L21e:
            r6 = 33
            p064e.C1487a.m4023a(r12, r1, r5, r2, r6)
        L223:
            java.lang.String r1 = r0.f21318a
            java.lang.String r2 = "p"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L250
            float r1 = r7.f21359s
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L23d
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            float r1 = r1 / r3
            r4.f12419q = r1
        L23d:
            android.text.Layout$Alignment r1 = r7.f21355o
            if (r1 == 0) goto L243
            r4.f12405c = r1
        L243:
            android.text.Layout$Alignment r1 = r7.f21356p
            if (r1 == 0) goto L250
            r4.f12406d = r1
            goto L250
        L24a:
            r11 = r21
            r10 = r23
        L24e:
            r16 = r1
        L250:
            r1 = r16
            goto L25
        L254:
            r11 = r21
            r10 = r23
            r3 = 0
            r12 = 0
        L25a:
            int r1 = r17.m11683d()
            if (r12 >= r1) goto L273
            p5.d r1 = r0.m11682c(r12)
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r9
            r7 = r23
            r1.m11687i(r2, r4, r5, r6, r7)
            int r12 = r12 + 1
            goto L25a
        L273:
            return
    }

    /* renamed from: j */
    public final void m11688j(long r11, boolean r13, java.lang.String r14, java.util.Map<java.lang.String, p143i5.C3077a.b> r15) {
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r10.f21328k
            r0.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r10.f21329l
            r0.clear()
            java.lang.String r0 = r10.f21318a
            java.lang.String r1 = "metadata"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r10.f21325h
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            goto L22
        L20:
            java.lang.String r14 = r10.f21325h
        L22:
            boolean r0 = r10.f21320c
            if (r0 == 0) goto L36
            if (r13 == 0) goto L36
            android.text.SpannableStringBuilder r11 = m11680f(r14, r15)
            java.lang.String r12 = r10.f21319b
            java.util.Objects.requireNonNull(r12)
            r11.append(r12)
            goto L101
        L36:
            java.lang.String r0 = r10.f21318a
            java.lang.String r1 = "br"
            boolean r0 = r1.equals(r0)
            r6 = 10
            if (r0 == 0) goto L4d
            if (r13 == 0) goto L4d
            android.text.SpannableStringBuilder r11 = m11680f(r14, r15)
            r11.append(r6)
            goto L101
        L4d:
            boolean r0 = r10.m11685g(r11)
            if (r0 == 0) goto L101
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r10.f21328k
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            i5.a$b r1 = (p143i5.C3077a.b) r1
            java.lang.CharSequence r1 = r1.f12403a
            java.util.Objects.requireNonNull(r1)
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r1)
            goto L5b
        L86:
            java.lang.String r0 = r10.f21318a
            java.lang.String r1 = "p"
            boolean r7 = r1.equals(r0)
            r8 = 0
            r9 = 0
        L90:
            int r0 = r10.m11683d()
            if (r9 >= r0) goto Lac
            p5.d r0 = r10.m11682c(r9)
            if (r13 != 0) goto La1
            if (r7 == 0) goto L9f
            goto La1
        L9f:
            r3 = 0
            goto La3
        La1:
            r1 = 1
            r3 = 1
        La3:
            r1 = r11
            r4 = r14
            r5 = r15
            r0.m11688j(r1, r3, r4, r5)
            int r9 = r9 + 1
            goto L90
        Lac:
            if (r7 == 0) goto Lce
            android.text.SpannableStringBuilder r11 = m11680f(r14, r15)
            int r12 = r11.length()
        Lb6:
            int r12 = r12 + (-1)
            if (r12 < 0) goto Lc3
            char r13 = r11.charAt(r12)
            r14 = 32
            if (r13 != r14) goto Lc3
            goto Lb6
        Lc3:
            if (r12 < 0) goto Lce
            char r12 = r11.charAt(r12)
            if (r12 == r6) goto Lce
            r11.append(r6)
        Lce:
            java.util.Set r11 = r15.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Ld6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L101
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.util.HashMap<java.lang.String, java.lang.Integer> r13 = r10.f21329l
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            i5.a$b r12 = (p143i5.C3077a.b) r12
            java.lang.CharSequence r12 = r12.f12403a
            java.util.Objects.requireNonNull(r12)
            int r12 = r12.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.put(r14, r12)
            goto Ld6
        L101:
            return
    }
}
