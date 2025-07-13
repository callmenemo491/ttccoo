package p247o5;

/* renamed from: o5.a */
/* loaded from: classes.dex */
public final class C4893a extends p143i5.AbstractC3081e {

    /* renamed from: p */
    public static final java.util.regex.Pattern f19403p = null;

    /* renamed from: q */
    public static final java.util.regex.Pattern f19404q = null;

    /* renamed from: n */
    public final java.lang.StringBuilder f19405n;

    /* renamed from: o */
    public final java.util.ArrayList<java.lang.String> f19406o;

    static {
            java.lang.String r0 = "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p247o5.C4893a.f19403p = r0
            java.lang.String r0 = "\\{\\\\.*?\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p247o5.C4893a.f19404q = r0
            return
    }

    public C4893a() {
            r1 = this;
            java.lang.String r0 = "SubripDecoder"
            r1.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f19405n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f19406o = r0
            return
    }

    /* renamed from: k */
    public static float m11032k(int r1) {
            if (r1 == 0) goto L15
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 1064011039(0x3f6b851f, float:0.92)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L12:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L15:
            r1 = 1034147594(0x3da3d70a, float:0.08)
            return r1
    }

    /* renamed from: l */
    public static long m11033l(java.util.regex.Matcher r9, int r10) {
            int r0 = r10 + 1
            java.lang.String r0 = r9.group(r0)
            r1 = 60
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L17
            long r5 = java.lang.Long.parseLong(r0)
            long r5 = r5 * r1
            long r5 = r5 * r1
            long r5 = r5 * r3
            goto L19
        L17:
            r5 = 0
        L19:
            int r0 = r10 + 2
            java.lang.String r0 = r9.group(r0)
            java.util.Objects.requireNonNull(r0)
            long r7 = java.lang.Long.parseLong(r0)
            long r7 = r7 * r1
            long r7 = r7 * r3
            long r7 = r7 + r5
            int r0 = r10 + 3
            java.lang.String r0 = r9.group(r0)
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r3
            long r0 = r0 + r7
            int r10 = r10 + 4
            java.lang.String r9 = r9.group(r10)
            if (r9 == 0) goto L48
            long r9 = java.lang.Long.parseLong(r9)
            long r0 = r0 + r9
        L48:
            long r0 = r0 * r3
            return r0
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r30, int r31, boolean r32) {
            r29 = this;
            r0 = r29
            java.lang.String r1 = "SubripDecoder"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.g r3 = new r4.g
            r4 = 1
            r3.<init>(r4)
            v5.u r5 = new v5.u
            r6 = r30
            r7 = r31
            r5.<init>(r6, r7)
        L18:
            java.lang.String r6 = r5.m13404g()
            r7 = 0
            if (r6 == 0) goto L265
            int r8 = r6.length()
            if (r8 != 0) goto L26
            goto L18
        L26:
            java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L243
            java.lang.String r6 = r5.m13404g()
            if (r6 != 0) goto L36
            java.lang.String r4 = "Unexpected end"
            android.util.Log.w(r1, r4)
            goto L265
        L36:
            java.util.regex.Pattern r8 = p247o5.C4893a.f19403p
            java.util.regex.Matcher r8 = r8.matcher(r6)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L227
            long r9 = m11033l(r8, r4)
            r3.m12135a(r9)
            r6 = 6
            long r8 = m11033l(r8, r6)
            r3.m12135a(r8)
            java.lang.StringBuilder r8 = r0.f19405n
            r8.setLength(r7)
            java.util.ArrayList<java.lang.String> r8 = r0.f19406o
            r8.clear()
            java.lang.String r8 = r5.m13404g()
        L5f:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto Lb5
            java.lang.StringBuilder r9 = r0.f19405n
            int r9 = r9.length()
            if (r9 <= 0) goto L74
            java.lang.StringBuilder r9 = r0.f19405n
            java.lang.String r10 = "<br>"
            r9.append(r10)
        L74:
            java.lang.StringBuilder r9 = r0.f19405n
            java.util.ArrayList<java.lang.String> r10 = r0.f19406o
            java.lang.String r8 = r8.trim()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r8)
            java.util.regex.Pattern r12 = p247o5.C4893a.f19404q
            java.util.regex.Matcher r8 = r12.matcher(r8)
            r12 = 0
        L88:
            boolean r13 = r8.find()
            if (r13 == 0) goto La8
            java.lang.String r13 = r8.group()
            r10.add(r13)
            int r14 = r8.start()
            int r14 = r14 - r12
            int r13 = r13.length()
            int r15 = r14 + r13
            java.lang.String r6 = ""
            r11.replace(r14, r15, r6)
            int r12 = r12 + r13
            r6 = 6
            goto L88
        La8:
            java.lang.String r6 = r11.toString()
            r9.append(r6)
            java.lang.String r8 = r5.m13404g()
            r6 = 6
            goto L5f
        Lb5:
            java.lang.StringBuilder r6 = r0.f19405n
            java.lang.String r6 = r6.toString()
            android.text.Spanned r9 = android.text.Html.fromHtml(r6)
            r6 = 0
            r8 = 0
        Lc1:
            java.util.ArrayList<java.lang.String> r10 = r0.f19406o
            int r10 = r10.size()
            if (r8 >= r10) goto Lde
            java.util.ArrayList<java.lang.String> r10 = r0.f19406o
            java.lang.Object r10 = r10.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "\\{\\\\an[1-9]\\}"
            boolean r11 = r10.matches(r11)
            if (r11 == 0) goto Ldb
            r6 = r10
            goto Lde
        Ldb:
            int r8 = r8 + 1
            goto Lc1
        Lde:
            r12 = 0
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = 0
            r23 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = 0
            if (r6 != 0) goto L110
            i5.a r6 = new i5.a
            r8 = r6
            r26 = 0
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r15
            r24 = r15
            r18 = r15
            r14 = r15
            r25 = 0
            r10 = r12
            r11 = r12
            r13 = r21
            r16 = r21
            r19 = r21
            r20 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r28 = r3
            r27 = r5
            r0 = 1
            goto L21e
        L110:
            int r8 = r6.hashCode()
            java.lang.String r10 = "{\\an9}"
            java.lang.String r11 = "{\\an8}"
            java.lang.String r12 = "{\\an7}"
            java.lang.String r13 = "{\\an6}"
            java.lang.String r14 = "{\\an5}"
            java.lang.String r15 = "{\\an4}"
            java.lang.String r7 = "{\\an3}"
            java.lang.String r4 = "{\\an2}"
            java.lang.String r0 = "{\\an1}"
            r16 = 8
            r17 = 7
            r18 = -1
            r27 = r5
            r5 = 2
            switch(r8) {
                case -685620710: goto L174;
                case -685620679: goto L16c;
                case -685620648: goto L164;
                case -685620617: goto L15c;
                case -685620586: goto L154;
                case -685620555: goto L14c;
                case -685620524: goto L144;
                case -685620493: goto L13b;
                case -685620462: goto L133;
                default: goto L132;
            }
        L132:
            goto L17c
        L133:
            boolean r8 = r6.equals(r10)
            if (r8 == 0) goto L17c
            r8 = 5
            goto L17d
        L13b:
            boolean r8 = r6.equals(r11)
            if (r8 == 0) goto L17c
            r8 = 8
            goto L17d
        L144:
            boolean r8 = r6.equals(r12)
            if (r8 == 0) goto L17c
            r8 = 2
            goto L17d
        L14c:
            boolean r8 = r6.equals(r13)
            if (r8 == 0) goto L17c
            r8 = 4
            goto L17d
        L154:
            boolean r8 = r6.equals(r14)
            if (r8 == 0) goto L17c
            r8 = 7
            goto L17d
        L15c:
            boolean r8 = r6.equals(r15)
            if (r8 == 0) goto L17c
            r8 = 1
            goto L17d
        L164:
            boolean r8 = r6.equals(r7)
            if (r8 == 0) goto L17c
            r8 = 3
            goto L17d
        L16c:
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L17c
            r8 = 6
            goto L17d
        L174:
            boolean r8 = r6.equals(r0)
            if (r8 == 0) goto L17c
            r8 = 0
            goto L17d
        L17c:
            r8 = -1
        L17d:
            r28 = r3
            if (r8 == 0) goto L193
            r3 = 1
            if (r8 == r3) goto L193
            if (r8 == r5) goto L193
            r3 = 3
            if (r8 == r3) goto L191
            r3 = 4
            if (r8 == r3) goto L191
            r3 = 5
            if (r8 == r3) goto L191
            r3 = 1
            goto L194
        L191:
            r3 = 2
            goto L194
        L193:
            r3 = 0
        L194:
            int r8 = r6.hashCode()
            switch(r8) {
                case -685620710: goto L1dd;
                case -685620679: goto L1d5;
                case -685620648: goto L1cd;
                case -685620617: goto L1c5;
                case -685620586: goto L1bd;
                case -685620555: goto L1b4;
                case -685620524: goto L1ac;
                case -685620493: goto L1a4;
                case -685620462: goto L19c;
                default: goto L19b;
            }
        L19b:
            goto L1e5
        L19c:
            boolean r0 = r6.equals(r10)
            if (r0 == 0) goto L1e5
            r6 = 5
            goto L1e6
        L1a4:
            boolean r0 = r6.equals(r11)
            if (r0 == 0) goto L1e5
            r6 = 4
            goto L1e6
        L1ac:
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L1e5
            r6 = 3
            goto L1e6
        L1b4:
            boolean r0 = r6.equals(r13)
            if (r0 == 0) goto L1e5
            r6 = 8
            goto L1e6
        L1bd:
            boolean r0 = r6.equals(r14)
            if (r0 == 0) goto L1e5
            r6 = 7
            goto L1e6
        L1c5:
            boolean r0 = r6.equals(r15)
            if (r0 == 0) goto L1e5
            r6 = 6
            goto L1e6
        L1cd:
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L1e5
            r6 = 2
            goto L1e6
        L1d5:
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L1e5
            r6 = 1
            goto L1e6
        L1dd:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1e5
            r6 = 0
            goto L1e6
        L1e5:
            r6 = -1
        L1e6:
            r0 = 1
            if (r6 == 0) goto L1fa
            if (r6 == r0) goto L1fa
            if (r6 == r5) goto L1fa
            r4 = 3
            if (r6 == r4) goto L1f8
            r4 = 4
            if (r6 == r4) goto L1f8
            r4 = 5
            if (r6 == r4) goto L1f8
            r15 = 1
            goto L1fb
        L1f8:
            r15 = 0
            goto L1fb
        L1fa:
            r15 = 2
        L1fb:
            float r16 = m11032k(r3)
            float r13 = m11032k(r15)
            r14 = 0
            i5.a r6 = new i5.a
            r8 = r6
            r26 = 0
            r11 = 0
            r12 = r11
            r10 = r11
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r19 = r21
            r20 = r21
            r22 = 0
            r23 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r17 = r3
            r18 = r24
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L21e:
            r2.add(r6)
            i5.a r3 = p143i5.C3077a.f12384p0
            r2.add(r3)
            goto L25c
        L227:
            r28 = r3
            r27 = r5
            r0 = 1
            java.lang.String r3 = "Skipping invalid timing: "
            int r4 = r6.length()
            if (r4 == 0) goto L239
            java.lang.String r3 = r3.concat(r6)
            goto L23f
        L239:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L23f:
            android.util.Log.w(r1, r3)
            goto L25c
        L243:
            r28 = r3
            r27 = r5
            r0 = 1
            java.lang.String r3 = "Skipping invalid index: "
            int r4 = r6.length()
            if (r4 == 0) goto L255
            java.lang.String r3 = r3.concat(r6)
            goto L23f
        L255:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
            goto L23f
        L25c:
            r0 = r29
            r5 = r27
            r3 = r28
            r4 = 1
            goto L18
        L265:
            r28 = r3
            r0 = 0
            i5.a[] r0 = new p143i5.C3077a[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            i5.a[] r0 = (p143i5.C3077a[]) r0
            r1 = r28
            java.lang.Object r2 = r1.f22416a
            long[] r2 = (long[]) r2
            int r1 = r1.f22417b
            long[] r1 = java.util.Arrays.copyOf(r2, r1)
            n5.d r2 = new n5.d
            r2.<init>(r0, r1)
            return r2
    }
}
