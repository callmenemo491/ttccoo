package p232n5;

/* renamed from: n5.a */
/* loaded from: classes.dex */
public final class C4687a extends p143i5.AbstractC3081e {

    /* renamed from: s */
    public static final java.util.regex.Pattern f18681s = null;

    /* renamed from: n */
    public final boolean f18682n;

    /* renamed from: o */
    public final p232n5.C4688b f18683o;

    /* renamed from: p */
    public java.util.Map<java.lang.String, p232n5.C4689c> f18684p;

    /* renamed from: q */
    public float f18685q;

    /* renamed from: r */
    public float f18686r;

    static {
            java.lang.String r0 = "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p232n5.C4687a.f18681s = r0
            return
    }

    public C4687a(java.util.List<byte[]> r4) {
            r3 = this;
            java.lang.String r0 = "SsaDecoder"
            r3.<init>(r0)
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3.f18685q = r0
            r3.f18686r = r0
            r0 = 0
            if (r4 == 0) goto L43
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L43
            r1 = 1
            r3.f18682n = r1
            java.lang.Object r0 = r4.get(r0)
            byte[] r0 = (byte[]) r0
            java.lang.String r0 = p371v5.C6552b0.m13319l(r0)
            java.lang.String r2 = "Format:"
            boolean r2 = r0.startsWith(r2)
            p371v5.C6549a.m13288b(r2)
            n5.b r0 = p232n5.C4688b.m10731a(r0)
            java.util.Objects.requireNonNull(r0)
            r3.f18683o = r0
            v5.u r0 = new v5.u
            java.lang.Object r4 = r4.get(r1)
            byte[] r4 = (byte[]) r4
            r0.<init>(r4)
            r3.m10730m(r0)
            goto L48
        L43:
            r3.f18682n = r0
            r4 = 0
            r3.f18683o = r4
        L48:
            return
    }

    /* renamed from: k */
    public static int m10727k(long r4, java.util.List<java.lang.Long> r6, java.util.List<java.util.List<p143i5.C3077a>> r7) {
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L2b
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L17
            return r0
        L17:
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 >= 0) goto L28
            int r0 = r0 + 1
            goto L2c
        L28:
            int r0 = r0 + (-1)
            goto L6
        L2b:
            r0 = 0
        L2c:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.add(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            if (r0 != 0) goto L3b
            r4.<init>()
            goto L46
        L3b:
            int r5 = r0 + (-1)
            java.lang.Object r5 = r7.get(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            r4.<init>(r5)
        L46:
            r7.add(r0, r4)
            return r0
    }

    /* renamed from: l */
    public static float m10728l(int r1) {
            if (r1 == 0) goto L13
            r0 = 1
            if (r1 == r0) goto L10
            r0 = 2
            if (r1 == r0) goto Lc
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            return r1
        Lc:
            r1 = 1064514355(0x3f733333, float:0.95)
            return r1
        L10:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L13:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            return r1
    }

    /* renamed from: n */
    public static long m10729n(java.lang.String r8) {
            java.util.regex.Pattern r0 = p232n5.C4687a.f18681s
            java.lang.String r8 = r8.trim()
            java.util.regex.Matcher r8 = r0.matcher(r8)
            boolean r0 = r8.matches()
            if (r0 != 0) goto L16
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L16:
            r0 = 1
            java.lang.String r0 = r8.group(r0)
            int r1 = p371v5.C6552b0.f25624a
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 60
            long r0 = r0 * r2
            long r0 = r0 * r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
            r6 = 2
            java.lang.String r6 = r8.group(r6)
            long r6 = java.lang.Long.parseLong(r6)
            long r6 = r6 * r2
            long r6 = r6 * r4
            long r6 = r6 + r0
            r0 = 3
            java.lang.String r0 = r8.group(r0)
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r4
            long r0 = r0 + r6
            r2 = 4
            java.lang.String r8 = r8.group(r2)
            long r2 = java.lang.Long.parseLong(r8)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 * r4
            long r2 = r2 + r0
            return r2
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r37, int r38, boolean r39) {
            r36 = this;
            r0 = r36
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            v5.u r3 = new v5.u
            r4 = r37
            r5 = r38
            r3.<init>(r4, r5)
            boolean r4 = r0.f18682n
            if (r4 != 0) goto L1c
            r0.m10730m(r3)
        L1c:
            boolean r4 = r0.f18682n
            if (r4 == 0) goto L23
            n5.b r4 = r0.f18683o
            goto L24
        L23:
            r4 = 0
        L24:
            java.lang.String r5 = r3.m13404g()
            if (r5 == 0) goto L2ae
            java.lang.String r6 = "Format:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L37
            n5.b r4 = p232n5.C4688b.m10731a(r5)
            goto L24
        L37:
            java.lang.String r6 = "Dialogue:"
            boolean r7 = r5.startsWith(r6)
            if (r7 == 0) goto L2a2
            java.lang.String r7 = "SsaDecoder"
            if (r4 != 0) goto L5a
            java.lang.String r6 = "Skipping dialogue line before complete format: "
            int r8 = r5.length()
            if (r8 == 0) goto L50
            java.lang.String r5 = r6.concat(r5)
            goto L55
        L50:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L55:
            android.util.Log.w(r7, r5)
            goto L2a2
        L5a:
            boolean r6 = r5.startsWith(r6)
            p371v5.C6549a.m13288b(r6)
            r6 = 9
            java.lang.String r6 = r5.substring(r6)
            int r8 = r4.f18691e
            java.lang.String r9 = ","
            java.lang.String[] r6 = r6.split(r9, r8)
            int r8 = r6.length
            int r9 = r4.f18691e
            if (r8 == r9) goto L87
            java.lang.String r6 = "Skipping dialogue line with fewer columns than format: "
            int r8 = r5.length()
            if (r8 == 0) goto L81
            java.lang.String r5 = r6.concat(r5)
            goto Lc3
        L81:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto Lc3
        L87:
            int r8 = r4.f18687a
            r8 = r6[r8]
            long r8 = m10729n(r8)
            java.lang.String r10 = "Skipping invalid timing: "
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto La7
            int r6 = r5.length()
            if (r6 == 0) goto La1
            goto Lb9
        La1:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r10)
            goto Lc3
        La7:
            int r13 = r4.f18688b
            r13 = r6[r13]
            long r13 = m10729n(r13)
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto Lc8
            int r6 = r5.length()
            if (r6 == 0) goto Lbe
        Lb9:
            java.lang.String r5 = r10.concat(r5)
            goto Lc3
        Lbe:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r10)
        Lc3:
            android.util.Log.w(r7, r5)
            goto L2a2
        Lc8:
            java.util.Map<java.lang.String, n5.c> r5 = r0.f18684p
            r10 = -1
            if (r5 == 0) goto Lde
            int r11 = r4.f18689c
            if (r11 == r10) goto Lde
            r10 = r6[r11]
            java.lang.String r10 = r10.trim()
            java.lang.Object r5 = r5.get(r10)
            n5.c r5 = (p232n5.C4689c) r5
            goto Ldf
        Lde:
            r5 = 0
        Ldf:
            int r10 = r4.f18690d
            r6 = r6[r10]
            java.util.regex.Pattern r10 = p232n5.C4689c.b.f18709a
            java.util.regex.Matcher r10 = r10.matcher(r6)
            r11 = 0
            r12 = -1
        Leb:
            boolean r15 = r10.find()
            r39 = r3
            r3 = 1
            if (r15 == 0) goto L123
            java.lang.String r3 = r10.group(r3)
            java.util.Objects.requireNonNull(r3)
            android.graphics.PointF r15 = p232n5.C4689c.b.m10735a(r3)     // Catch: java.lang.RuntimeException -> L102
            if (r15 == 0) goto L102
            r11 = r15
        L102:
            java.util.regex.Pattern r15 = p232n5.C4689c.b.f18712d     // Catch: java.lang.RuntimeException -> L120
            java.util.regex.Matcher r3 = r15.matcher(r3)     // Catch: java.lang.RuntimeException -> L120
            boolean r15 = r3.find()     // Catch: java.lang.RuntimeException -> L120
            if (r15 == 0) goto L11b
            r15 = 1
            java.lang.String r3 = r3.group(r15)     // Catch: java.lang.RuntimeException -> L120
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.RuntimeException -> L120
            int r3 = p232n5.C4689c.m10732a(r3)     // Catch: java.lang.RuntimeException -> L120
            goto L11c
        L11b:
            r3 = -1
        L11c:
            r15 = -1
            if (r3 == r15) goto L120
            r12 = r3
        L120:
            r3 = r39
            goto Leb
        L123:
            n5.c$b r3 = new n5.c$b
            java.util.regex.Pattern r3 = p232n5.C4689c.b.f18709a
            java.util.regex.Matcher r3 = r3.matcher(r6)
            java.lang.String r6 = ""
            java.lang.String r3 = r3.replaceAll(r6)
            java.lang.String r6 = "\n"
            java.lang.String r10 = "\\N"
            java.lang.String r3 = r3.replace(r10, r6)
            java.lang.String r10 = "\\n"
            java.lang.String r3 = r3.replace(r10, r6)
            java.lang.String r6 = "\\h"
            java.lang.String r10 = "\u00a0"
            java.lang.String r3 = r3.replace(r6, r10)
            float r6 = r0.f18685q
            float r10 = r0.f18686r
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r3)
            r19 = 0
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r31 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = 0
            r30 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r5 == 0) goto L1ee
            java.lang.Integer r3 = r5.f18694c
            if (r3 == 0) goto L17b
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r0 = r5.f18694c
            int r0 = r0.intValue()
            r3.<init>(r0)
            int r0 = r15.length()
            r38 = r4
            r4 = 33
            r34 = r13
            r13 = 0
            r15.setSpan(r3, r13, r0, r4)
            goto L17f
        L17b:
            r38 = r4
            r34 = r13
        L17f:
            float r0 = r5.f18695d
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L18f
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 == 0) goto L18f
            float r0 = r0 / r10
            r3 = 1
            goto L194
        L18f:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L194:
            boolean r4 = r5.f18696e
            if (r4 == 0) goto L1a3
            boolean r13 = r5.f18697f
            if (r13 == 0) goto L1a3
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r13 = 3
            r4.<init>(r13)
            goto L1b6
        L1a3:
            if (r4 == 0) goto L1ac
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r13 = 1
            r4.<init>(r13)
            goto L1b6
        L1ac:
            boolean r4 = r5.f18697f
            if (r4 == 0) goto L1c3
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r13 = 2
            r4.<init>(r13)
        L1b6:
            int r13 = r15.length()
            r14 = 0
            r16 = r0
            r0 = 33
            r15.setSpan(r4, r14, r13, r0)
            goto L1c8
        L1c3:
            r16 = r0
            r14 = 0
            r0 = 33
        L1c8:
            boolean r4 = r5.f18698g
            if (r4 == 0) goto L1d8
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            int r13 = r15.length()
            r15.setSpan(r4, r14, r13, r0)
        L1d8:
            boolean r4 = r5.f18699h
            if (r4 == 0) goto L1e8
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            int r13 = r15.length()
            r15.setSpan(r4, r14, r13, r0)
        L1e8:
            r0 = -1
            r25 = r3
            r26 = r16
            goto L1fd
        L1ee:
            r38 = r4
            r34 = r13
            r0 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L1fd:
            if (r12 == r0) goto L200
            goto L206
        L200:
            if (r5 == 0) goto L205
            int r12 = r5.f18693b
            goto L206
        L205:
            r12 = r0
        L206:
            java.lang.String r0 = "Unknown alignment: "
            r3 = 30
            switch(r12) {
                case -1: goto L21e;
                case 0: goto L20d;
                case 1: goto L218;
                case 2: goto L215;
                case 3: goto L212;
                case 4: goto L218;
                case 5: goto L215;
                case 6: goto L212;
                case 7: goto L218;
                case 8: goto L215;
                case 9: goto L212;
                default: goto L20d;
            }
        L20d:
            java.lang.String r4 = p064e.C1490d.m4039a(r3, r0, r12)
            goto L21b
        L212:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L21f
        L215:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L21f
        L218:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L21f
        L21b:
            android.util.Log.w(r7, r4)
        L21e:
            r4 = 0
        L21f:
            r17 = r4
            switch(r12) {
                case -1: goto L238;
                case 0: goto L224;
                case 1: goto L231;
                case 2: goto L22d;
                case 3: goto L229;
                case 4: goto L231;
                case 5: goto L22d;
                case 6: goto L229;
                case 7: goto L231;
                case 8: goto L22d;
                case 9: goto L229;
                default: goto L224;
            }
        L224:
            java.lang.String r4 = p064e.C1490d.m4039a(r3, r0, r12)
            goto L235
        L229:
            r4 = 2
            r24 = 2
            goto L23c
        L22d:
            r4 = 1
            r24 = 1
            goto L23c
        L231:
            r4 = 0
            r24 = 0
            goto L23c
        L235:
            android.util.Log.w(r7, r4)
        L238:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
        L23c:
            switch(r12) {
                case -1: goto L253;
                case 0: goto L23f;
                case 1: goto L24c;
                case 2: goto L24c;
                case 3: goto L24c;
                case 4: goto L248;
                case 5: goto L248;
                case 6: goto L248;
                case 7: goto L244;
                case 8: goto L244;
                case 9: goto L244;
                default: goto L23f;
            }
        L23f:
            java.lang.String r0 = p064e.C1490d.m4039a(r3, r0, r12)
            goto L250
        L244:
            r0 = 0
            r22 = 0
            goto L257
        L248:
            r0 = 1
            r22 = 1
            goto L257
        L24c:
            r0 = 2
            r22 = 2
            goto L257
        L250:
            android.util.Log.w(r7, r0)
        L253:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
        L257:
            if (r11 == 0) goto L26b
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 == 0) goto L26b
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L26b
            float r0 = r11.x
            float r0 = r0 / r6
            float r3 = r11.y
            float r3 = r3 / r10
            goto L273
        L26b:
            float r0 = m10728l(r24)
            float r3 = m10728l(r22)
        L273:
            r23 = r0
            r20 = r3
            i5.a r0 = new i5.a
            r3 = r15
            r15 = r0
            r33 = 0
            r32 = 0
            r21 = 0
            r16 = r3
            r18 = r19
            r27 = r28
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r3 = m10727k(r8, r2, r1)
            r4 = r34
            int r4 = m10727k(r4, r2, r1)
        L294:
            if (r3 >= r4) goto L2a6
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L294
        L2a2:
            r39 = r3
            r38 = r4
        L2a6:
            r0 = r36
            r4 = r38
            r3 = r39
            goto L24
        L2ae:
            n5.d r0 = new n5.d
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: m */
    public final void m10730m(p371v5.C6571u r26) {
            r25 = this;
            r1 = r25
        L2:
            java.lang.String r0 = r26.m13404g()
            if (r0 == 0) goto L2b9
            java.lang.String r2 = "[Script Info]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            r3 = 91
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L6b
        L15:
            java.lang.String r0 = r26.m13404g()
            if (r0 == 0) goto L2
            int r2 = r26.m13398a()
            if (r2 == 0) goto L27
            int r2 = r26.m13400c()
            if (r2 == r3) goto L2
        L27:
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            if (r2 == r4) goto L31
            goto L15
        L31:
            r2 = r0[r5]
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = p185k7.C3836i.m8629n(r2)
            java.util.Objects.requireNonNull(r2)
            java.lang.String r7 = "playresx"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L5c
            java.lang.String r7 = "playresy"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L4f
            goto L15
        L4f:
            r0 = r0[r6]     // Catch: java.lang.NumberFormatException -> L69
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L69
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L69
            r1.f18686r = r0     // Catch: java.lang.NumberFormatException -> L69
            goto L15
        L5c:
            r0 = r0[r6]     // Catch: java.lang.NumberFormatException -> L69
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L69
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L69
            r1.f18685q = r0     // Catch: java.lang.NumberFormatException -> L69
            goto L15
        L69:
            goto L15
        L6b:
            java.lang.String r2 = "[V4+ Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            java.lang.String r7 = "SsaDecoder"
            if (r2 == 0) goto L2a2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L7a:
            r8 = 0
            r9 = r8
        L7c:
            java.lang.String r10 = r26.m13404g()
            if (r10 == 0) goto L29e
            int r0 = r26.m13398a()
            if (r0 == 0) goto L8e
            int r0 = r26.m13400c()
            if (r0 == r3) goto L29e
        L8e:
            java.lang.String r0 = "Format:"
            boolean r0 = r10.startsWith(r0)
            java.lang.String r11 = ","
            r12 = 6
            r13 = 3
            r14 = -1
            if (r0 == 0) goto L15d
            r0 = 7
            java.lang.String r0 = r10.substring(r0)
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r11)
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r17 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1
        Lbe:
            int r11 = r0.length
            if (r9 >= r11) goto L14e
            r11 = r0[r9]
            java.lang.String r11 = r11.trim()
            java.lang.String r11 = p185k7.C3836i.m8629n(r11)
            java.util.Objects.requireNonNull(r11)
            int r12 = r11.hashCode()
            switch(r12) {
                case -1178781136: goto L124;
                case -1026963764: goto L119;
                case -192095652: goto L10e;
                case -70925746: goto L103;
                case 3029637: goto Lf8;
                case 3373707: goto Led;
                case 366554320: goto Le2;
                case 1767875043: goto Ld7;
                default: goto Ld5;
            }
        Ld5:
            goto L12f
        Ld7:
            java.lang.String r12 = "alignment"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto Le0
            goto L12f
        Le0:
            r11 = 7
            goto L130
        Le2:
            java.lang.String r12 = "fontsize"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto Leb
            goto L12f
        Leb:
            r11 = 6
            goto L130
        Led:
            java.lang.String r12 = "name"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto Lf6
            goto L12f
        Lf6:
            r11 = 5
            goto L130
        Lf8:
            java.lang.String r12 = "bold"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L101
            goto L12f
        L101:
            r11 = 4
            goto L130
        L103:
            java.lang.String r12 = "primarycolour"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L10c
            goto L12f
        L10c:
            r11 = 3
            goto L130
        L10e:
            java.lang.String r12 = "strikeout"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L117
            goto L12f
        L117:
            r11 = 2
            goto L130
        L119:
            java.lang.String r12 = "underline"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L122
            goto L12f
        L122:
            r11 = 1
            goto L130
        L124:
            java.lang.String r12 = "italic"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L12d
            goto L12f
        L12d:
            r11 = 0
            goto L130
        L12f:
            r11 = -1
        L130:
            switch(r11) {
                case 0: goto L148;
                case 1: goto L145;
                case 2: goto L142;
                case 3: goto L13f;
                case 4: goto L13c;
                case 5: goto L13a;
                case 6: goto L137;
                case 7: goto L134;
                default: goto L133;
            }
        L133:
            goto L14a
        L134:
            r17 = r9
            goto L14a
        L137:
            r19 = r9
            goto L14a
        L13a:
            r10 = r9
            goto L14a
        L13c:
            r20 = r9
            goto L14a
        L13f:
            r18 = r9
            goto L14a
        L142:
            r23 = r9
            goto L14a
        L145:
            r22 = r9
            goto L14a
        L148:
            r21 = r9
        L14a:
            int r9 = r9 + 1
            goto Lbe
        L14e:
            if (r10 == r14) goto L7a
            n5.c$a r9 = new n5.c$a
            int r0 = r0.length
            r15 = r9
            r16 = r10
            r24 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L7c
        L15d:
            java.lang.String r0 = "Style:"
            boolean r3 = r10.startsWith(r0)
            if (r3 == 0) goto L298
            if (r9 != 0) goto L17f
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            int r3 = r10.length()
            if (r3 == 0) goto L174
            java.lang.String r0 = r0.concat(r10)
            goto L17a
        L174:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L17a:
            android.util.Log.w(r7, r0)
            goto L298
        L17f:
            java.lang.String r3 = "'"
            boolean r0 = r10.startsWith(r0)
            p371v5.C6549a.m13288b(r0)
            java.lang.String r0 = r10.substring(r12)
            java.lang.String[] r11 = android.text.TextUtils.split(r0, r11)
            int r0 = r11.length
            int r12 = r9.f18708i
            java.lang.String r15 = "SsaStyle"
            if (r0 == r12) goto L1b3
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r5] = r3
            int r3 = r11.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r6] = r3
            r0[r4] = r10
            java.lang.String r3 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = p371v5.C6552b0.m13318k(r3, r0)
            android.util.Log.w(r15, r0)
            goto L290
        L1b3:
            n5.c r4 = new n5.c     // Catch: java.lang.RuntimeException -> L280
            int r0 = r9.f18700a     // Catch: java.lang.RuntimeException -> L280
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r17 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            int r0 = r9.f18701b     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L1ce
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            int r0 = p232n5.C4689c.m10732a(r0)     // Catch: java.lang.RuntimeException -> L280
            r18 = r0
            goto L1d1
        L1ce:
            r0 = -1
            r18 = -1
        L1d1:
            int r0 = r9.f18702c     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L1e2
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            java.lang.Integer r0 = p232n5.C4689c.m10734c(r0)     // Catch: java.lang.RuntimeException -> L280
            r19 = r0
            goto L1e4
        L1e2:
            r19 = r8
        L1e4:
            int r0 = r9.f18703d     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L218
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r5 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            float r0 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L1f5 java.lang.RuntimeException -> L280
            r20 = r0
            goto L21e
        L1f5:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: java.lang.RuntimeException -> L280
            int r0 = r0.length()     // Catch: java.lang.RuntimeException -> L280
            int r0 = r0 + 29
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L280
            r13.<init>(r0)     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = "Failed to parse font size: '"
            r13.append(r0)     // Catch: java.lang.RuntimeException -> L280
            r13.append(r5)     // Catch: java.lang.RuntimeException -> L280
            r13.append(r3)     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r13.toString()     // Catch: java.lang.RuntimeException -> L280
            p371v5.C6565o.m13370c(r15, r0, r12)     // Catch: java.lang.RuntimeException -> L280
        L218:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r20 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L21e:
            int r0 = r9.f18704e     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L232
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            boolean r0 = p232n5.C4689c.m10733b(r0)     // Catch: java.lang.RuntimeException -> L280
            if (r0 == 0) goto L232
            r0 = 1
            r21 = 1
            goto L235
        L232:
            r0 = 0
            r21 = 0
        L235:
            int r0 = r9.f18705f     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L249
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            boolean r0 = p232n5.C4689c.m10733b(r0)     // Catch: java.lang.RuntimeException -> L280
            if (r0 == 0) goto L249
            r0 = 1
            r22 = 1
            goto L24c
        L249:
            r0 = 0
            r22 = 0
        L24c:
            int r0 = r9.f18706g     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L260
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            boolean r0 = p232n5.C4689c.m10733b(r0)     // Catch: java.lang.RuntimeException -> L280
            if (r0 == 0) goto L260
            r0 = 1
            r23 = 1
            goto L263
        L260:
            r0 = 0
            r23 = 0
        L263:
            int r0 = r9.f18707h     // Catch: java.lang.RuntimeException -> L280
            if (r0 == r14) goto L277
            r0 = r11[r0]     // Catch: java.lang.RuntimeException -> L280
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L280
            boolean r0 = p232n5.C4689c.m10733b(r0)     // Catch: java.lang.RuntimeException -> L280
            if (r0 == 0) goto L277
            r0 = 1
            r24 = 1
            goto L27a
        L277:
            r0 = 0
            r24 = 0
        L27a:
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.RuntimeException -> L280
            goto L291
        L280:
            r0 = move-exception
            int r4 = r10.length()
            int r4 = r4 + 36
            java.lang.String r5 = "Skipping malformed 'Style:' line: '"
            java.lang.String r3 = p088f4.C2035p.m5377a(r4, r5, r10, r3)
            p371v5.C6565o.m13370c(r15, r3, r0)
        L290:
            r4 = r8
        L291:
            if (r4 == 0) goto L298
            java.lang.String r0 = r4.f18692a
            r2.put(r0, r4)
        L298:
            r3 = 91
            r4 = 2
            r5 = 0
            goto L7c
        L29e:
            r1.f18684p = r2
            goto L2
        L2a2:
            java.lang.String r2 = "[V4 Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L2b1
            java.lang.String r0 = "[V4 Styles] are not supported"
            android.util.Log.i(r7, r0)
            goto L2
        L2b1:
            java.lang.String r2 = "[Events]"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2
        L2b9:
            return
    }
}
