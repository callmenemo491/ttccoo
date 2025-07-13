package p371v5;

/* renamed from: v5.b0 */
/* loaded from: classes.dex */
public final class C6552b0 {

    /* renamed from: a */
    public static final int f25624a = 0;

    /* renamed from: b */
    public static final java.lang.String f25625b = null;

    /* renamed from: c */
    public static final java.lang.String f25626c = null;

    /* renamed from: d */
    public static final java.lang.String f25627d = null;

    /* renamed from: e */
    public static final java.lang.String f25628e = null;

    /* renamed from: f */
    public static final byte[] f25629f = null;

    /* renamed from: g */
    public static java.util.HashMap<java.lang.String, java.lang.String> f25630g;

    /* renamed from: h */
    public static final java.lang.String[] f25631h = null;

    /* renamed from: i */
    public static final java.lang.String[] f25632i = null;

    /* renamed from: j */
    public static final int[] f25633j = null;

    /* renamed from: k */
    public static final int[] f25634k = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            p371v5.C6552b0.f25624a = r0
            java.lang.String r1 = android.os.Build.DEVICE
            p371v5.C6552b0.f25625b = r1
            java.lang.String r2 = android.os.Build.MANUFACTURER
            p371v5.C6552b0.f25626c = r2
            java.lang.String r3 = android.os.Build.MODEL
            p371v5.C6552b0.f25627d = r3
            r4 = 17
            int r4 = p064e.C1489c.m4038a(r1, r4)
            int r4 = p064e.C1489c.m4038a(r3, r4)
            int r4 = p064e.C1489c.m4038a(r2, r4)
            java.lang.String r5 = ", "
            java.lang.StringBuilder r1 = p064e.C1491e.m4040a(r4, r1, r5, r3, r5)
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p371v5.C6552b0.f25628e = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            p371v5.C6552b0.f25629f = r0
            java.lang.String r0 = "(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "%([A-Fa-f0-9]{2})"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = ".*\\.isml?(?:/(manifest(.*))?)?"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r1 = "alb"
            java.lang.String r2 = "sq"
            java.lang.String r3 = "arm"
            java.lang.String r4 = "hy"
            java.lang.String r5 = "baq"
            java.lang.String r6 = "eu"
            java.lang.String r7 = "bur"
            java.lang.String r8 = "my"
            java.lang.String r9 = "tib"
            java.lang.String r10 = "bo"
            java.lang.String r11 = "chi"
            java.lang.String r12 = "zh"
            java.lang.String r13 = "cze"
            java.lang.String r14 = "cs"
            java.lang.String r15 = "dut"
            java.lang.String r16 = "nl"
            java.lang.String r17 = "ger"
            java.lang.String r18 = "de"
            java.lang.String r19 = "gre"
            java.lang.String r20 = "el"
            java.lang.String r21 = "fre"
            java.lang.String r22 = "fr"
            java.lang.String r23 = "geo"
            java.lang.String r24 = "ka"
            java.lang.String r25 = "ice"
            java.lang.String r26 = "is"
            java.lang.String r27 = "mac"
            java.lang.String r28 = "mk"
            java.lang.String r29 = "mao"
            java.lang.String r30 = "mi"
            java.lang.String r31 = "may"
            java.lang.String r32 = "ms"
            java.lang.String r33 = "per"
            java.lang.String r34 = "fa"
            java.lang.String r35 = "rum"
            java.lang.String r36 = "ro"
            java.lang.String r37 = "scc"
            java.lang.String r38 = "hbs-srp"
            java.lang.String r39 = "slo"
            java.lang.String r40 = "sk"
            java.lang.String r41 = "wel"
            java.lang.String r42 = "cy"
            java.lang.String r43 = "id"
            java.lang.String r44 = "ms-ind"
            java.lang.String r45 = "iw"
            java.lang.String r46 = "he"
            java.lang.String r47 = "heb"
            java.lang.String r48 = "he"
            java.lang.String r49 = "ji"
            java.lang.String r50 = "yi"
            java.lang.String r51 = "in"
            java.lang.String r52 = "ms-ind"
            java.lang.String r53 = "ind"
            java.lang.String r54 = "ms-ind"
            java.lang.String r55 = "nb"
            java.lang.String r56 = "no-nob"
            java.lang.String r57 = "nob"
            java.lang.String r58 = "no-nob"
            java.lang.String r59 = "nn"
            java.lang.String r60 = "no-nno"
            java.lang.String r61 = "nno"
            java.lang.String r62 = "no-nno"
            java.lang.String r63 = "tw"
            java.lang.String r64 = "ak-twi"
            java.lang.String r65 = "twi"
            java.lang.String r66 = "ak-twi"
            java.lang.String r67 = "bs"
            java.lang.String r68 = "hbs-bos"
            java.lang.String r69 = "bos"
            java.lang.String r70 = "hbs-bos"
            java.lang.String r71 = "hr"
            java.lang.String r72 = "hbs-hrv"
            java.lang.String r73 = "hrv"
            java.lang.String r74 = "hbs-hrv"
            java.lang.String r75 = "sr"
            java.lang.String r76 = "hbs-srp"
            java.lang.String r77 = "srp"
            java.lang.String r78 = "hbs-srp"
            java.lang.String r79 = "cmn"
            java.lang.String r80 = "zh-cmn"
            java.lang.String r81 = "hak"
            java.lang.String r82 = "zh-hak"
            java.lang.String r83 = "nan"
            java.lang.String r84 = "zh-nan"
            java.lang.String r85 = "hsn"
            java.lang.String r86 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86}
            p371v5.C6552b0.f25631h = r0
            java.lang.String r1 = "i-lux"
            java.lang.String r2 = "lb"
            java.lang.String r3 = "i-hak"
            java.lang.String r4 = "zh-hak"
            java.lang.String r5 = "i-navajo"
            java.lang.String r6 = "nv"
            java.lang.String r7 = "no-bok"
            java.lang.String r8 = "no-nob"
            java.lang.String r9 = "no-nyn"
            java.lang.String r10 = "no-nno"
            java.lang.String r11 = "zh-guoyu"
            java.lang.String r12 = "zh-cmn"
            java.lang.String r13 = "zh-hakka"
            java.lang.String r14 = "zh-hak"
            java.lang.String r15 = "zh-min-nan"
            java.lang.String r16 = "zh-nan"
            java.lang.String r17 = "zh-xiang"
            java.lang.String r18 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            p371v5.C6552b0.f25632i = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r1 = {x013a: FILL_ARRAY_DATA , data: [0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108} // fill-array
            p371v5.C6552b0.f25633j = r1
            int[] r0 = new int[r0]
            r0 = {x033e: FILL_ARRAY_DATA , data: [0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243} // fill-array
            p371v5.C6552b0.f25634k = r0
            return
    }

    /* renamed from: A */
    public static long m13297A(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L14
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L14
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
        L14:
            return r3
    }

    /* renamed from: B */
    public static java.lang.String m13298B(java.lang.String r9) {
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            r0 = 95
            r1 = 45
            java.lang.String r0 = r9.replace(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1c
            java.lang.String r1 = "und"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r9 = r0
        L1c:
            java.lang.String r9 = p185k7.C3836i.m8629n(r9)
            java.lang.String r0 = "-"
            java.lang.String[] r0 = m13304H(r9, r0)
            r1 = 0
            r0 = r0[r1]
            java.util.HashMap<java.lang.String, java.lang.String> r2 = p371v5.C6552b0.f25630g
            if (r2 != 0) goto L6a
            java.lang.String[] r2 = java.util.Locale.getISOLanguages()
            java.util.HashMap r3 = new java.util.HashMap
            int r4 = r2.length
            java.lang.String[] r5 = p371v5.C6552b0.f25631h
            int r5 = r5.length
            int r4 = r4 + r5
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
        L3d:
            if (r5 >= r4) goto L56
            r6 = r2[r5]
            java.util.Locale r7 = new java.util.Locale     // Catch: java.util.MissingResourceException -> L53
            r7.<init>(r6)     // Catch: java.util.MissingResourceException -> L53
            java.lang.String r7 = r7.getISO3Language()     // Catch: java.util.MissingResourceException -> L53
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.util.MissingResourceException -> L53
            if (r8 != 0) goto L53
            r3.put(r7, r6)     // Catch: java.util.MissingResourceException -> L53
        L53:
            int r5 = r5 + 1
            goto L3d
        L56:
            r2 = 0
        L57:
            java.lang.String[] r4 = p371v5.C6552b0.f25631h
            int r5 = r4.length
            if (r2 >= r5) goto L68
            r5 = r4[r2]
            int r6 = r2 + 1
            r4 = r4[r6]
            r3.put(r5, r4)
            int r2 = r2 + 2
            goto L57
        L68:
            p371v5.C6552b0.f25630g = r3
        L6a:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = p371v5.C6552b0.f25630g
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L91
            int r0 = r0.length()
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r0 = r9.length()
            if (r0 == 0) goto L8b
            java.lang.String r9 = r2.concat(r9)
            goto L90
        L8b:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L90:
            r0 = r2
        L91:
            java.lang.String r2 = "no"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La9
            java.lang.String r2 = "i"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La9
            java.lang.String r2 = "zh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le0
        La9:
            java.lang.String[] r0 = p371v5.C6552b0.f25632i
            int r2 = r0.length
            if (r1 >= r2) goto Le0
            r2 = r0[r1]
            boolean r2 = r9.startsWith(r2)
            if (r2 == 0) goto Ldd
            int r2 = r1 + 1
            r2 = r0[r2]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0 = r0[r1]
            int r0 = r0.length()
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r0 = r9.length()
            if (r0 == 0) goto Ld7
            java.lang.String r9 = r2.concat(r9)
            goto Le0
        Ld7:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
            goto Le0
        Ldd:
            int r1 = r1 + 2
            goto La9
        Le0:
            return r9
    }

    /* renamed from: C */
    public static <T> T[] m13299C(T[] r1, int r2) {
            int r0 = r1.length
            if (r2 > r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            p371v5.C6549a.m13288b(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
    }

    /* renamed from: D */
    public static boolean m13300D(android.os.Handler r2, java.lang.Runnable r3) {
            android.os.Looper r0 = r2.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L10
            r2 = 0
            return r2
        L10:
            android.os.Looper r0 = r2.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L1f
            r3.run()
            r2 = 1
            return r2
        L1f:
            boolean r2 = r2.post(r3)
            return r2
    }

    /* renamed from: E */
    public static long m13301E(long r6, long r8, long r10) {
            r0 = 0
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto Lf
            long r3 = r10 % r8
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto Lf
            long r10 = r10 / r8
            long r6 = r6 / r10
            return r6
        Lf:
            if (r2 >= 0) goto L1b
            long r2 = r8 % r10
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1b
            long r8 = r8 / r10
            long r8 = r8 * r6
            return r8
        L1b:
            double r8 = (double) r8
            double r10 = (double) r10
            double r8 = r8 / r10
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            return r6
    }

    /* renamed from: F */
    public static void m13302F(long[] r7, long r8, long r10) {
            r0 = 0
            r2 = 0
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 < 0) goto L19
            long r4 = r10 % r8
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L19
            long r10 = r10 / r8
        Le:
            int r8 = r7.length
            if (r2 >= r8) goto L3f
            r8 = r7[r2]
            long r8 = r8 / r10
            r7[r2] = r8
            int r2 = r2 + 1
            goto Le
        L19:
            if (r3 >= 0) goto L2e
            long r3 = r8 % r10
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L2e
            long r8 = r8 / r10
        L22:
            int r10 = r7.length
            if (r2 >= r10) goto L3f
            r10 = r7[r2]
            long r10 = r10 * r8
            r7[r2] = r10
            int r2 = r2 + 1
            goto L22
        L2e:
            double r8 = (double) r8
            double r10 = (double) r10
            double r8 = r8 / r10
        L31:
            int r10 = r7.length
            if (r2 >= r10) goto L3f
            r10 = r7[r2]
            double r10 = (double) r10
            double r10 = r10 * r8
            long r10 = (long) r10
            r7[r2] = r10
            int r2 = r2 + 1
            goto L31
        L3f:
            return
    }

    /* renamed from: G */
    public static java.lang.String[] m13303G(java.lang.String r1, java.lang.String r2) {
            r0 = -1
            java.lang.String[] r1 = r1.split(r2, r0)
            return r1
    }

    /* renamed from: H */
    public static java.lang.String[] m13304H(java.lang.String r1, java.lang.String r2) {
            r0 = 2
            java.lang.String[] r1 = r1.split(r2, r0)
            return r1
    }

    /* renamed from: I */
    public static byte[] m13305I(java.io.InputStream r4) {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        L9:
            int r2 = r4.read(r0)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r1.write(r0, r3, r2)
            goto L9
        L15:
            byte[] r4 = r1.toByteArray()
            return r4
    }

    /* renamed from: J */
    public static long m13306J(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    /* renamed from: K */
    public static long m13307K(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L13
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L13
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
        L13:
            return r3
    }

    /* renamed from: a */
    public static boolean m13308a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    /* renamed from: b */
    public static int m13309b(long[] r4, long r5, boolean r7, boolean r8) {
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L8
            int r5 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L14
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L14
            goto L8
        L14:
            if (r7 == 0) goto L19
            int r5 = r0 + (-1)
            goto L1a
        L19:
            r5 = r0
        L1a:
            if (r8 == 0) goto L23
            int r4 = r4.length
            int r4 = r4 + (-1)
            int r5 = java.lang.Math.min(r4, r5)
        L23:
            return r5
    }

    /* renamed from: c */
    public static int m13310c(p304r4.C5786g r7, long r8, boolean r10, boolean r11) {
            int r0 = r7.f22417b
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        L6:
            if (r2 > r0) goto L1b
            int r3 = r2 + r0
            int r3 = r3 >>> 1
            long r4 = r7.m12136b(r3)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L17
            int r2 = r3 + 1
            goto L6
        L17:
            int r3 = r3 + (-1)
            r0 = r3
            goto L6
        L1b:
            if (r10 == 0) goto L2d
            int r10 = r0 + 1
            int r2 = r7.f22417b
            if (r10 >= r2) goto L2d
            long r2 = r7.m12136b(r10)
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 != 0) goto L2d
            r1 = r10
            goto L34
        L2d:
            if (r11 == 0) goto L33
            r7 = -1
            if (r0 != r7) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            return r1
    }

    /* renamed from: d */
    public static int m13311d(int[] r2, int r3, boolean r4, boolean r5) {
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
    }

    /* renamed from: e */
    public static int m13312e(long[] r4, long r5, boolean r7, boolean r8) {
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r4 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L15
            goto La
        L15:
            if (r7 == 0) goto L1a
            int r4 = r0 + 1
            goto L1b
        L1a:
            r4 = r0
        L1b:
            if (r8 == 0) goto L22
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L22:
            return r4
    }

    /* renamed from: f */
    public static int m13313f(int r0, int r1) {
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            int r0 = r0 / r1
            return r0
    }

    /* renamed from: g */
    public static float m13314g(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r0, r2)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    /* renamed from: h */
    public static int m13315h(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    /* renamed from: i */
    public static long m13316i(long r0, long r2, long r4) {
            long r0 = java.lang.Math.min(r0, r4)
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    /* renamed from: j */
    public static android.os.Handler m13317j() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            p371v5.C6549a.m13292f(r0)
            android.os.Handler r1 = new android.os.Handler
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }

    /* renamed from: k */
    public static java.lang.String m13318k(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    /* renamed from: l */
    public static java.lang.String m13319l(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p010a9.C0035c.f82c
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: m */
    public static java.lang.String m13320m(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p010a9.C0035c.f82c
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    /* renamed from: n */
    public static int m13321n(int r3) {
            r0 = 0
            switch(r3) {
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L5;
                default: goto L4;
            }
        L4:
            return r0
        L5:
            int r3 = p371v5.C6552b0.f25624a
            r1 = 23
            r2 = 6396(0x18fc, float:8.963E-42)
            if (r3 < r1) goto Le
            return r2
        Le:
            r1 = 21
            if (r3 < r1) goto L13
            return r2
        L13:
            return r0
        L14:
            r3 = 1276(0x4fc, float:1.788E-42)
            return r3
        L17:
            r3 = 252(0xfc, float:3.53E-43)
            return r3
        L1a:
            r3 = 220(0xdc, float:3.08E-43)
            return r3
        L1d:
            r3 = 204(0xcc, float:2.86E-43)
            return r3
        L20:
            r3 = 28
            return r3
        L23:
            r3 = 12
            return r3
        L26:
            r3 = 4
            return r3
    }

    /* renamed from: o */
    public static android.os.Looper m13322o() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L7
            goto Lb
        L7:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        Lb:
            return r0
    }

    /* renamed from: p */
    public static int m13323p(int r1) {
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 4
            if (r1 == r0) goto L23
            r0 = 10
            if (r1 == r0) goto L20
            r0 = 7
            if (r1 == r0) goto L23
            r0 = 8
            if (r1 == r0) goto L1d
            switch(r1) {
                case 15: goto L1d;
                case 16: goto L23;
                case 17: goto L20;
                case 18: goto L23;
                case 19: goto L20;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 24: goto L1a;
                case 25: goto L1a;
                case 26: goto L1a;
                case 27: goto L1a;
                case 28: goto L1a;
                default: goto L17;
            }
        L17:
            r1 = 6006(0x1776, float:8.416E-42)
            return r1
        L1a:
            r1 = 6002(0x1772, float:8.41E-42)
            return r1
        L1d:
            r1 = 6003(0x1773, float:8.412E-42)
            return r1
        L20:
            r1 = 6004(0x1774, float:8.413E-42)
            return r1
        L23:
            r1 = 6005(0x1775, float:8.415E-42)
            return r1
    }

    /* renamed from: q */
    public static long m13324q(long r2, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L7:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 * r0
            long r2 = java.lang.Math.round(r2)
            return r2
    }

    /* renamed from: r */
    public static int m13325r(int r1) {
            r0 = 8
            if (r1 == r0) goto L1a
            r0 = 16
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L15
            r0 = 32
            if (r1 == r0) goto L12
            r1 = 0
            return r1
        L12:
            r1 = 805306368(0x30000000, float:4.656613E-10)
            return r1
        L15:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            return r1
        L18:
            r1 = 2
            return r1
        L1a:
            r1 = 3
            return r1
    }

    /* renamed from: s */
    public static int m13326s(int r4, int r5) {
            r0 = 2
            if (r4 == r0) goto L22
            r1 = 3
            if (r4 == r1) goto L21
            r2 = 4
            if (r4 == r2) goto L1f
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 == r3) goto L22
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 == r0) goto L1c
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 != r0) goto L16
            goto L1f
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L1c:
            int r5 = r5 * 3
            return r5
        L1f:
            int r5 = r5 * 4
        L21:
            return r5
        L22:
            int r5 = r5 * 2
            return r5
    }

    /* renamed from: t */
    public static int m13327t(int r1) {
            r0 = 13
            if (r1 == r0) goto L14
            switch(r1) {
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Ld;
                case 5: goto Lb;
                case 6: goto L9;
                case 7: goto Lb;
                case 8: goto Lb;
                case 9: goto Lb;
                case 10: goto Lb;
                default: goto L7;
            }
        L7:
            r1 = 3
            return r1
        L9:
            r1 = 2
            return r1
        Lb:
            r1 = 5
            return r1
        Ld:
            r1 = 4
            return r1
        Lf:
            r1 = 8
            return r1
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    /* renamed from: u */
    public static java.lang.String m13328u(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1f
            return r0
        L1f:
            r0 = move-exception
            java.lang.String r1 = "Failed to read system property "
            int r2 = r6.length()
            if (r2 == 0) goto L2d
            java.lang.String r6 = r1.concat(r6)
            goto L32
        L2d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
        L32:
            java.lang.String r1 = "Util"
            p371v5.C6565o.m13369b(r1, r6, r0)
            r6 = 0
            return r6
    }

    /* renamed from: v */
    public static byte[] m13329v(java.lang.String r1) {
            java.nio.charset.Charset r0 = p010a9.C0035c.f82c
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    /* renamed from: w */
    public static boolean m13330w(p371v5.C6571u r3, p371v5.C6571u r4, java.util.zip.Inflater r5) {
            int r0 = r3.m13398a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.f25710a
            int r0 = r0.length
            int r2 = r3.m13398a()
            if (r0 >= r2) goto L1a
            int r0 = r3.m13398a()
            int r0 = r0 * 2
            r4.m13399b(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.f25710a
            int r2 = r3.f25711b
            int r3 = r3.m13398a()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L2d:
            byte[] r0 = r4.f25710a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L44
            r4.m13395E(r3)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            r3 = 1
            r5.reset()
            return r3
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 != 0) goto L5d
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L51
            goto L5d
        L51:
            byte[] r0 = r4.f25710a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r0 = r0 * 2
            r4.m13399b(r0)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            goto L2d
        L5d:
            r5.reset()
            return r1
        L61:
            r3 = move-exception
            r5.reset()
            throw r3
        L66:
            r5.reset()
            return r1
    }

    /* renamed from: x */
    public static boolean m13331x(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto Le
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto Le
            r0 = 4
            if (r1 != r0) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            return r1
    }

    /* renamed from: y */
    public static boolean m13332y(int r1) {
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L18
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 == r0) goto L18
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L18
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 != r0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
    }

    /* renamed from: z */
    public static boolean m13333z(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L17
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }
}
