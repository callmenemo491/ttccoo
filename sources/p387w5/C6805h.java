package p387w5;

/* renamed from: w5.h */
/* loaded from: classes.dex */
public class C6805h extends p406x4.AbstractC6940n {

    /* renamed from: l2 */
    public static final int[] f26439l2 = null;

    /* renamed from: m2 */
    public static boolean f26440m2;

    /* renamed from: n2 */
    public static boolean f26441n2;

    /* renamed from: C1 */
    public final android.content.Context f26442C1;

    /* renamed from: D1 */
    public final p387w5.C6807j f26443D1;

    /* renamed from: E1 */
    public final p387w5.InterfaceC6812o.a f26444E1;

    /* renamed from: F1 */
    public final long f26445F1;

    /* renamed from: G1 */
    public final int f26446G1;

    /* renamed from: H1 */
    public final boolean f26447H1;

    /* renamed from: I1 */
    public p387w5.C6805h.a f26448I1;

    /* renamed from: J1 */
    public boolean f26449J1;

    /* renamed from: K1 */
    public boolean f26450K1;

    /* renamed from: L1 */
    public android.view.Surface f26451L1;

    /* renamed from: M1 */
    public p387w5.C6801d f26452M1;

    /* renamed from: N1 */
    public boolean f26453N1;

    /* renamed from: O1 */
    public int f26454O1;

    /* renamed from: P1 */
    public boolean f26455P1;

    /* renamed from: Q1 */
    public boolean f26456Q1;

    /* renamed from: R1 */
    public boolean f26457R1;

    /* renamed from: S1 */
    public long f26458S1;

    /* renamed from: T1 */
    public long f26459T1;

    /* renamed from: U1 */
    public long f26460U1;

    /* renamed from: V1 */
    public int f26461V1;

    /* renamed from: W1 */
    public int f26462W1;

    /* renamed from: X1 */
    public int f26463X1;

    /* renamed from: Y1 */
    public long f26464Y1;

    /* renamed from: Z1 */
    public long f26465Z1;

    /* renamed from: a2 */
    public long f26466a2;

    /* renamed from: b2 */
    public int f26467b2;

    /* renamed from: c2 */
    public int f26468c2;

    /* renamed from: d2 */
    public int f26469d2;

    /* renamed from: e2 */
    public int f26470e2;

    /* renamed from: f2 */
    public float f26471f2;

    /* renamed from: g2 */
    public p387w5.C6813p f26472g2;

    /* renamed from: h2 */
    public boolean f26473h2;

    /* renamed from: i2 */
    public int f26474i2;

    /* renamed from: j2 */
    public p387w5.C6805h.b f26475j2;

    /* renamed from: k2 */
    public p387w5.InterfaceC6806i f26476k2;

    /* renamed from: w5.h$a */
    public static final class a {

        /* renamed from: a */
        public final int f26477a;

        /* renamed from: b */
        public final int f26478b;

        /* renamed from: c */
        public final int f26479c;

        public a(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f26477a = r1
                r0.f26478b = r2
                r0.f26479c = r3
                return
        }
    }

    /* renamed from: w5.h$b */
    public final class b implements p406x4.InterfaceC6937k.c, android.os.Handler.Callback {

        /* renamed from: Y */
        public final android.os.Handler f26480Y;

        /* renamed from: Z */
        public final /* synthetic */ p387w5.C6805h f26481Z;

        public b(p387w5.C6805h r2, p406x4.InterfaceC6937k r3) {
                r1 = this;
                r1.f26481Z = r2
                r1.<init>()
                int r2 = p371v5.C6552b0.f25624a
                android.os.Looper r2 = android.os.Looper.myLooper()
                p371v5.C6549a.m13292f(r2)
                android.os.Handler r0 = new android.os.Handler
                r0.<init>(r2, r1)
                r1.f26480Y = r0
                r3.mo14040j(r1, r0)
                return
        }

        /* renamed from: a */
        public final void m13872a(long r5) {
                r4 = this;
                w5.h r0 = r4.f26481Z
                w5.h$b r1 = r0.f26475j2
                if (r4 == r1) goto L7
                return
            L7:
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 != 0) goto L14
                r5 = 1
                r0.f27088v1 = r5
                goto L1d
            L14:
                r0.m13858P0(r5)     // Catch: p088f4.C2038q -> L18
                goto L1d
            L18:
                r5 = move-exception
                w5.h r6 = r4.f26481Z
                r6.f27090w1 = r5
            L1d:
                return
        }

        /* renamed from: b */
        public void m13873b(p406x4.InterfaceC6937k r3, long r4, long r6) {
                r2 = this;
                int r3 = p371v5.C6552b0.f25624a
                r6 = 30
                if (r3 >= r6) goto L19
                android.os.Handler r3 = r2.f26480Y
                r6 = 0
                r7 = 32
                long r0 = r4 >> r7
                int r7 = (int) r0
                int r5 = (int) r4
                android.os.Message r3 = android.os.Message.obtain(r3, r6, r7, r5)
                android.os.Handler r4 = r2.f26480Y
                r4.sendMessageAtFrontOfQueue(r3)
                goto L1c
            L19:
                r2.m13872a(r4)
            L1c:
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r5) {
                r4 = this;
                int r0 = r5.what
                if (r0 == 0) goto L6
                r5 = 0
                return r5
            L6:
                int r0 = r5.arg1
                int r5 = r5.arg2
                long r0 = p371v5.C6552b0.m13306J(r0)
                r2 = 32
                long r0 = r0 << r2
                long r2 = p371v5.C6552b0.m13306J(r5)
                long r0 = r0 | r2
                r4.m13872a(r0)
                r5 = 1
                return r5
        }
    }

    static {
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1920, 1600, 1440, 1280, 960, 854, 640, 540, 480} // fill-array
            p387w5.C6805h.f26439l2 = r0
            return
    }

    public C6805h(android.content.Context r7, p406x4.InterfaceC6937k.b r8, p406x4.InterfaceC6942p r9, long r10, boolean r12, android.os.Handler r13, p387w5.InterfaceC6812o r14, int r15) {
            r6 = this;
            r1 = 2
            r5 = 1106247680(0x41f00000, float:30.0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f26445F1 = r10
            r6.f26446G1 = r15
            android.content.Context r7 = r7.getApplicationContext()
            r6.f26442C1 = r7
            w5.j r8 = new w5.j
            r8.<init>(r7)
            r6.f26443D1 = r8
            w5.o$a r7 = new w5.o$a
            r7.<init>(r13, r14)
            r6.f26444E1 = r7
            java.lang.String r7 = p371v5.C6552b0.f25626c
            java.lang.String r8 = "NVIDIA"
            boolean r7 = r8.equals(r7)
            r6.f26447H1 = r7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f26459T1 = r7
            r7 = -1
            r6.f26468c2 = r7
            r6.f26469d2 = r7
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.f26471f2 = r7
            r7 = 1
            r6.f26454O1 = r7
            r7 = 0
            r6.f26474i2 = r7
            r7 = 0
            r6.f26472g2 = r7
            return
    }

    /* renamed from: G0 */
    public static boolean m13846G0() {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L6d
            java.lang.String r10 = p371v5.C6552b0.f25625b
            java.util.Objects.requireNonNull(r10)
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L5e;
                case -1220081023: goto L53;
                case -1220066608: goto L48;
                case -1012436106: goto L3d;
                case -64886864: goto L32;
                case 3415681: goto L27;
                case 825323514: goto L1c;
                default: goto L1a;
            }
        L1a:
            r10 = -1
            goto L68
        L1c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L25
            goto L1a
        L25:
            r10 = 6
            goto L68
        L27:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L30
            goto L1a
        L30:
            r10 = 5
            goto L68
        L32:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L3b
            goto L1a
        L3b:
            r10 = 4
            goto L68
        L3d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L46
            goto L1a
        L46:
            r10 = 3
            goto L68
        L48:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L51
            goto L1a
        L51:
            r10 = 2
            goto L68
        L53:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L5c
            goto L1a
        L5c:
            r10 = 1
            goto L68
        L5e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L67
            goto L1a
        L67:
            r10 = 0
        L68:
            switch(r10) {
                case 0: goto L6c;
                case 1: goto L6c;
                case 2: goto L6c;
                case 3: goto L6c;
                case 4: goto L6c;
                case 5: goto L6c;
                case 6: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L6d
        L6c:
            return r9
        L6d:
            r10 = 27
            if (r0 > r10) goto L7c
            java.lang.String r11 = p371v5.C6552b0.f25625b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L7c
            return r9
        L7c:
            r11 = 26
            if (r0 > r11) goto L84e
            java.lang.String r0 = p371v5.C6552b0.f25625b
            java.util.Objects.requireNonNull(r0)
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L80f;
                case -2144781185: goto L803;
                case -2144781160: goto L7f7;
                case -2097309513: goto L7eb;
                case -2022874474: goto L7df;
                case -1978993182: goto L7d3;
                case -1978990237: goto L7c9;
                case -1936688988: goto L7bd;
                case -1936688066: goto L7b0;
                case -1936688065: goto L7a2;
                case -1931988508: goto L794;
                case -1885099851: goto L786;
                case -1696512866: goto L778;
                case -1680025915: goto L76a;
                case -1615810839: goto L75c;
                case -1600724499: goto L74e;
                case -1554255044: goto L740;
                case -1481772737: goto L732;
                case -1481772730: goto L724;
                case -1481772729: goto L716;
                case -1320080169: goto L708;
                case -1217592143: goto L6fa;
                case -1180384755: goto L6ec;
                case -1139198265: goto L6de;
                case -1052835013: goto L6d0;
                case -993250464: goto L6c2;
                case -993250458: goto L6b4;
                case -965403638: goto L6a6;
                case -958336948: goto L698;
                case -879245230: goto L68a;
                case -842500323: goto L67c;
                case -821392978: goto L66e;
                case -797483286: goto L660;
                case -794946968: goto L652;
                case -788334647: goto L644;
                case -782144577: goto L636;
                case -575125681: goto L628;
                case -521118391: goto L61a;
                case -430914369: goto L60c;
                case -290434366: goto L5fe;
                case -282781963: goto L5f0;
                case -277133239: goto L5e2;
                case -173639913: goto L5d4;
                case -56598463: goto L5c6;
                case 2126: goto L5b8;
                case 2564: goto L5aa;
                case 2715: goto L59c;
                case 2719: goto L58e;
                case 3091: goto L580;
                case 3483: goto L572;
                case 73405: goto L564;
                case 75537: goto L556;
                case 75739: goto L548;
                case 76779: goto L53a;
                case 78669: goto L52c;
                case 79305: goto L51e;
                case 80618: goto L510;
                case 88274: goto L502;
                case 98846: goto L4f4;
                case 98848: goto L4e6;
                case 99329: goto L4d8;
                case 101481: goto L4ca;
                case 1513190: goto L4bc;
                case 1514184: goto L4ae;
                case 1514185: goto L4a0;
                case 2133089: goto L492;
                case 2133091: goto L484;
                case 2133120: goto L476;
                case 2133151: goto L468;
                case 2133182: goto L45a;
                case 2133184: goto L44c;
                case 2436959: goto L43e;
                case 2463773: goto L430;
                case 2464648: goto L422;
                case 2689555: goto L414;
                case 3154429: goto L406;
                case 3284551: goto L3f8;
                case 3351335: goto L3ea;
                case 3386211: goto L3dc;
                case 41325051: goto L3ce;
                case 51349633: goto L3c0;
                case 51350594: goto L3b2;
                case 55178625: goto L3a4;
                case 61542055: goto L396;
                case 65355429: goto L388;
                case 66214468: goto L37a;
                case 66214470: goto L36c;
                case 66214473: goto L35e;
                case 66215429: goto L350;
                case 66215431: goto L342;
                case 66215433: goto L334;
                case 66216390: goto L326;
                case 76402249: goto L318;
                case 76404105: goto L30a;
                case 76404911: goto L2fc;
                case 80963634: goto L2ee;
                case 82882791: goto L2e0;
                case 98715550: goto L2d2;
                case 101370885: goto L2c4;
                case 102844228: goto L2b6;
                case 165221241: goto L2a8;
                case 182191441: goto L29a;
                case 245388979: goto L28c;
                case 287431619: goto L27e;
                case 307593612: goto L270;
                case 308517133: goto L262;
                case 316215098: goto L254;
                case 316215116: goto L246;
                case 316246811: goto L238;
                case 316246818: goto L22a;
                case 407160593: goto L21c;
                case 507412548: goto L20e;
                case 793982701: goto L200;
                case 794038622: goto L1f2;
                case 794040393: goto L1e4;
                case 835649806: goto L1d6;
                case 917340916: goto L1c8;
                case 958008161: goto L1ba;
                case 1060579533: goto L1ac;
                case 1150207623: goto L19e;
                case 1176899427: goto L190;
                case 1280332038: goto L182;
                case 1306947716: goto L174;
                case 1349174697: goto L166;
                case 1522194893: goto L158;
                case 1691543273: goto L14a;
                case 1691544261: goto L13c;
                case 1709443163: goto L12e;
                case 1865889110: goto L120;
                case 1906253259: goto L112;
                case 1977196784: goto L104;
                case 2006372676: goto Lf7;
                case 2019281702: goto Lea;
                case 2029784656: goto Ldd;
                case 2030379515: goto Ld0;
                case 2033393791: goto Lc3;
                case 2047190025: goto Lb6;
                case 2047252157: goto La9;
                case 2048319463: goto L9c;
                case 2048855701: goto L8f;
                default: goto L8c;
            }
        L8c:
            r1 = -1
            goto L81a
        L8f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L98
            goto L8c
        L98:
            r1 = 139(0x8b, float:1.95E-43)
            goto L81a
        L9c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La5
            goto L8c
        La5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L81a
        La9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb2
            goto L8c
        Lb2:
            r1 = 137(0x89, float:1.92E-43)
            goto L81a
        Lb6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbf
            goto L8c
        Lbf:
            r1 = 136(0x88, float:1.9E-43)
            goto L81a
        Lc3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lcc
            goto L8c
        Lcc:
            r1 = 135(0x87, float:1.89E-43)
            goto L81a
        Ld0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld9
            goto L8c
        Ld9:
            r1 = 134(0x86, float:1.88E-43)
            goto L81a
        Ldd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le6
            goto L8c
        Le6:
            r1 = 133(0x85, float:1.86E-43)
            goto L81a
        Lea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf3
            goto L8c
        Lf3:
            r1 = 132(0x84, float:1.85E-43)
            goto L81a
        Lf7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L100
            goto L8c
        L100:
            r1 = 131(0x83, float:1.84E-43)
            goto L81a
        L104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10e
            goto L8c
        L10e:
            r1 = 130(0x82, float:1.82E-43)
            goto L81a
        L112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11c
            goto L8c
        L11c:
            r1 = 129(0x81, float:1.81E-43)
            goto L81a
        L120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12a
            goto L8c
        L12a:
            r1 = 128(0x80, float:1.8E-43)
            goto L81a
        L12e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L138
            goto L8c
        L138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L81a
        L13c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L146
            goto L8c
        L146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L81a
        L14a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L154
            goto L8c
        L154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L81a
        L158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L162
            goto L8c
        L162:
            r1 = 124(0x7c, float:1.74E-43)
            goto L81a
        L166:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L170
            goto L8c
        L170:
            r1 = 123(0x7b, float:1.72E-43)
            goto L81a
        L174:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17e
            goto L8c
        L17e:
            r1 = 122(0x7a, float:1.71E-43)
            goto L81a
        L182:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18c
            goto L8c
        L18c:
            r1 = 121(0x79, float:1.7E-43)
            goto L81a
        L190:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19a
            goto L8c
        L19a:
            r1 = 120(0x78, float:1.68E-43)
            goto L81a
        L19e:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a8
            goto L8c
        L1a8:
            r1 = 119(0x77, float:1.67E-43)
            goto L81a
        L1ac:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b6
            goto L8c
        L1b6:
            r1 = 118(0x76, float:1.65E-43)
            goto L81a
        L1ba:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c4
            goto L8c
        L1c4:
            r1 = 117(0x75, float:1.64E-43)
            goto L81a
        L1c8:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d2
            goto L8c
        L1d2:
            r1 = 116(0x74, float:1.63E-43)
            goto L81a
        L1d6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e0
            goto L8c
        L1e0:
            r1 = 115(0x73, float:1.61E-43)
            goto L81a
        L1e4:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1ee
            goto L8c
        L1ee:
            r1 = 114(0x72, float:1.6E-43)
            goto L81a
        L1f2:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1fc
            goto L8c
        L1fc:
            r1 = 113(0x71, float:1.58E-43)
            goto L81a
        L200:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20a
            goto L8c
        L20a:
            r1 = 112(0x70, float:1.57E-43)
            goto L81a
        L20e:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L218
            goto L8c
        L218:
            r1 = 111(0x6f, float:1.56E-43)
            goto L81a
        L21c:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L226
            goto L8c
        L226:
            r1 = 110(0x6e, float:1.54E-43)
            goto L81a
        L22a:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L234
            goto L8c
        L234:
            r1 = 109(0x6d, float:1.53E-43)
            goto L81a
        L238:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L242
            goto L8c
        L242:
            r1 = 108(0x6c, float:1.51E-43)
            goto L81a
        L246:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L250
            goto L8c
        L250:
            r1 = 107(0x6b, float:1.5E-43)
            goto L81a
        L254:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25e
            goto L8c
        L25e:
            r1 = 106(0x6a, float:1.49E-43)
            goto L81a
        L262:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26c
            goto L8c
        L26c:
            r1 = 105(0x69, float:1.47E-43)
            goto L81a
        L270:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27a
            goto L8c
        L27a:
            r1 = 104(0x68, float:1.46E-43)
            goto L81a
        L27e:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L288
            goto L8c
        L288:
            r1 = 103(0x67, float:1.44E-43)
            goto L81a
        L28c:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L296
            goto L8c
        L296:
            r1 = 102(0x66, float:1.43E-43)
            goto L81a
        L29a:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a4
            goto L8c
        L2a4:
            r1 = 101(0x65, float:1.42E-43)
            goto L81a
        L2a8:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b2
            goto L8c
        L2b2:
            r1 = 100
            goto L81a
        L2b6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c0
            goto L8c
        L2c0:
            r1 = 99
            goto L81a
        L2c4:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2ce
            goto L8c
        L2ce:
            r1 = 98
            goto L81a
        L2d2:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2dc
            goto L8c
        L2dc:
            r1 = 97
            goto L81a
        L2e0:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2ea
            goto L8c
        L2ea:
            r1 = 96
            goto L81a
        L2ee:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f8
            goto L8c
        L2f8:
            r1 = 95
            goto L81a
        L2fc:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L306
            goto L8c
        L306:
            r1 = 94
            goto L81a
        L30a:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L314
            goto L8c
        L314:
            r1 = 93
            goto L81a
        L318:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L322
            goto L8c
        L322:
            r1 = 92
            goto L81a
        L326:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L330
            goto L8c
        L330:
            r1 = 91
            goto L81a
        L334:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33e
            goto L8c
        L33e:
            r1 = 90
            goto L81a
        L342:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34c
            goto L8c
        L34c:
            r1 = 89
            goto L81a
        L350:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35a
            goto L8c
        L35a:
            r1 = 88
            goto L81a
        L35e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L368
            goto L8c
        L368:
            r1 = 87
            goto L81a
        L36c:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L376
            goto L8c
        L376:
            r1 = 86
            goto L81a
        L37a:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L384
            goto L8c
        L384:
            r1 = 85
            goto L81a
        L388:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L392
            goto L8c
        L392:
            r1 = 84
            goto L81a
        L396:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a0
            goto L8c
        L3a0:
            r1 = 83
            goto L81a
        L3a4:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3ae
            goto L8c
        L3ae:
            r1 = 82
            goto L81a
        L3b2:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3bc
            goto L8c
        L3bc:
            r1 = 81
            goto L81a
        L3c0:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3ca
            goto L8c
        L3ca:
            r1 = 80
            goto L81a
        L3ce:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d8
            goto L8c
        L3d8:
            r1 = 79
            goto L81a
        L3dc:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e6
            goto L8c
        L3e6:
            r1 = 78
            goto L81a
        L3ea:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f4
            goto L8c
        L3f4:
            r1 = 77
            goto L81a
        L3f8:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L402
            goto L8c
        L402:
            r1 = 76
            goto L81a
        L406:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L410
            goto L8c
        L410:
            r1 = 75
            goto L81a
        L414:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41e
            goto L8c
        L41e:
            r1 = 74
            goto L81a
        L422:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42c
            goto L8c
        L42c:
            r1 = 73
            goto L81a
        L430:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43a
            goto L8c
        L43a:
            r1 = 72
            goto L81a
        L43e:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L448
            goto L8c
        L448:
            r1 = 71
            goto L81a
        L44c:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L456
            goto L8c
        L456:
            r1 = 70
            goto L81a
        L45a:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L464
            goto L8c
        L464:
            r1 = 69
            goto L81a
        L468:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L472
            goto L8c
        L472:
            r1 = 68
            goto L81a
        L476:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L480
            goto L8c
        L480:
            r1 = 67
            goto L81a
        L484:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48e
            goto L8c
        L48e:
            r1 = 66
            goto L81a
        L492:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49c
            goto L8c
        L49c:
            r1 = 65
            goto L81a
        L4a0:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4aa
            goto L8c
        L4aa:
            r1 = 64
            goto L81a
        L4ae:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b8
            goto L8c
        L4b8:
            r1 = 63
            goto L81a
        L4bc:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c6
            goto L8c
        L4c6:
            r1 = 62
            goto L81a
        L4ca:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d4
            goto L8c
        L4d4:
            r1 = 61
            goto L81a
        L4d8:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e2
            goto L8c
        L4e2:
            r1 = 60
            goto L81a
        L4e6:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f0
            goto L8c
        L4f0:
            r1 = 59
            goto L81a
        L4f4:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4fe
            goto L8c
        L4fe:
            r1 = 58
            goto L81a
        L502:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50c
            goto L8c
        L50c:
            r1 = 57
            goto L81a
        L510:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51a
            goto L8c
        L51a:
            r1 = 56
            goto L81a
        L51e:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L528
            goto L8c
        L528:
            r1 = 55
            goto L81a
        L52c:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L536
            goto L8c
        L536:
            r1 = 54
            goto L81a
        L53a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L544
            goto L8c
        L544:
            r1 = 53
            goto L81a
        L548:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L552
            goto L8c
        L552:
            r1 = 52
            goto L81a
        L556:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L560
            goto L8c
        L560:
            r1 = 51
            goto L81a
        L564:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56e
            goto L8c
        L56e:
            r1 = 50
            goto L81a
        L572:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57c
            goto L8c
        L57c:
            r1 = 49
            goto L81a
        L580:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58a
            goto L8c
        L58a:
            r1 = 48
            goto L81a
        L58e:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L598
            goto L8c
        L598:
            r1 = 47
            goto L81a
        L59c:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a6
            goto L8c
        L5a6:
            r1 = 46
            goto L81a
        L5aa:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b4
            goto L8c
        L5b4:
            r1 = 45
            goto L81a
        L5b8:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5c2
            goto L8c
        L5c2:
            r1 = 44
            goto L81a
        L5c6:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d0
            goto L8c
        L5d0:
            r1 = 43
            goto L81a
        L5d4:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5de
            goto L8c
        L5de:
            r1 = 42
            goto L81a
        L5e2:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5ec
            goto L8c
        L5ec:
            r1 = 41
            goto L81a
        L5f0:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5fa
            goto L8c
        L5fa:
            r1 = 40
            goto L81a
        L5fe:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L608
            goto L8c
        L608:
            r1 = 39
            goto L81a
        L60c:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L616
            goto L8c
        L616:
            r1 = 38
            goto L81a
        L61a:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L624
            goto L8c
        L624:
            r1 = 37
            goto L81a
        L628:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L632
            goto L8c
        L632:
            r1 = 36
            goto L81a
        L636:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L640
            goto L8c
        L640:
            r1 = 35
            goto L81a
        L644:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64e
            goto L8c
        L64e:
            r1 = 34
            goto L81a
        L652:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65c
            goto L8c
        L65c:
            r1 = 33
            goto L81a
        L660:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66a
            goto L8c
        L66a:
            r1 = 32
            goto L81a
        L66e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L678
            goto L8c
        L678:
            r1 = 31
            goto L81a
        L67c:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L686
            goto L8c
        L686:
            r1 = 30
            goto L81a
        L68a:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L694
            goto L8c
        L694:
            r1 = 29
            goto L81a
        L698:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6a2
            goto L8c
        L6a2:
            r1 = 28
            goto L81a
        L6a6:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6b0
            goto L8c
        L6b0:
            r1 = 27
            goto L81a
        L6b4:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6be
            goto L8c
        L6be:
            r1 = 26
            goto L81a
        L6c2:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6cc
            goto L8c
        L6cc:
            r1 = 25
            goto L81a
        L6d0:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6da
            goto L8c
        L6da:
            r1 = 24
            goto L81a
        L6de:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e8
            goto L8c
        L6e8:
            r1 = 23
            goto L81a
        L6ec:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f6
            goto L8c
        L6f6:
            r1 = 22
            goto L81a
        L6fa:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L704
            goto L8c
        L704:
            r1 = 21
            goto L81a
        L708:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L712
            goto L8c
        L712:
            r1 = 20
            goto L81a
        L716:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L720
            goto L8c
        L720:
            r1 = 19
            goto L81a
        L724:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72e
            goto L8c
        L72e:
            r1 = 18
            goto L81a
        L732:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73c
            goto L8c
        L73c:
            r1 = 17
            goto L81a
        L740:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74a
            goto L8c
        L74a:
            r1 = 16
            goto L81a
        L74e:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L758
            goto L8c
        L758:
            r1 = 15
            goto L81a
        L75c:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L766
            goto L8c
        L766:
            r1 = 14
            goto L81a
        L76a:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L774
            goto L8c
        L774:
            r1 = 13
            goto L81a
        L778:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L782
            goto L8c
        L782:
            r1 = 12
            goto L81a
        L786:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L790
            goto L8c
        L790:
            r1 = 11
            goto L81a
        L794:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79e
            goto L8c
        L79e:
            r1 = 10
            goto L81a
        L7a2:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7ac
            goto L8c
        L7ac:
            r1 = 9
            goto L81a
        L7b0:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7ba
            goto L8c
        L7ba:
            r1 = 8
            goto L81a
        L7bd:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7c7
            goto L8c
        L7c7:
            r1 = 7
            goto L81a
        L7c9:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L81a
            goto L8c
        L7d3:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7dd
            goto L8c
        L7dd:
            r1 = 5
            goto L81a
        L7df:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e9
            goto L8c
        L7e9:
            r1 = 4
            goto L81a
        L7eb:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7f5
            goto L8c
        L7f5:
            r1 = 3
            goto L81a
        L7f7:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L801
            goto L8c
        L801:
            r1 = 2
            goto L81a
        L803:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80d
            goto L8c
        L80d:
            r1 = 1
            goto L81a
        L80f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L819
            goto L8c
        L819:
            r1 = 0
        L81a:
            switch(r1) {
                case 0: goto L84d;
                case 1: goto L84d;
                case 2: goto L84d;
                case 3: goto L84d;
                case 4: goto L84d;
                case 5: goto L84d;
                case 6: goto L84d;
                case 7: goto L84d;
                case 8: goto L84d;
                case 9: goto L84d;
                case 10: goto L84d;
                case 11: goto L84d;
                case 12: goto L84d;
                case 13: goto L84d;
                case 14: goto L84d;
                case 15: goto L84d;
                case 16: goto L84d;
                case 17: goto L84d;
                case 18: goto L84d;
                case 19: goto L84d;
                case 20: goto L84d;
                case 21: goto L84d;
                case 22: goto L84d;
                case 23: goto L84d;
                case 24: goto L84d;
                case 25: goto L84d;
                case 26: goto L84d;
                case 27: goto L84d;
                case 28: goto L84d;
                case 29: goto L84d;
                case 30: goto L84d;
                case 31: goto L84d;
                case 32: goto L84d;
                case 33: goto L84d;
                case 34: goto L84d;
                case 35: goto L84d;
                case 36: goto L84d;
                case 37: goto L84d;
                case 38: goto L84d;
                case 39: goto L84d;
                case 40: goto L84d;
                case 41: goto L84d;
                case 42: goto L84d;
                case 43: goto L84d;
                case 44: goto L84d;
                case 45: goto L84d;
                case 46: goto L84d;
                case 47: goto L84d;
                case 48: goto L84d;
                case 49: goto L84d;
                case 50: goto L84d;
                case 51: goto L84d;
                case 52: goto L84d;
                case 53: goto L84d;
                case 54: goto L84d;
                case 55: goto L84d;
                case 56: goto L84d;
                case 57: goto L84d;
                case 58: goto L84d;
                case 59: goto L84d;
                case 60: goto L84d;
                case 61: goto L84d;
                case 62: goto L84d;
                case 63: goto L84d;
                case 64: goto L84d;
                case 65: goto L84d;
                case 66: goto L84d;
                case 67: goto L84d;
                case 68: goto L84d;
                case 69: goto L84d;
                case 70: goto L84d;
                case 71: goto L84d;
                case 72: goto L84d;
                case 73: goto L84d;
                case 74: goto L84d;
                case 75: goto L84d;
                case 76: goto L84d;
                case 77: goto L84d;
                case 78: goto L84d;
                case 79: goto L84d;
                case 80: goto L84d;
                case 81: goto L84d;
                case 82: goto L84d;
                case 83: goto L84d;
                case 84: goto L84d;
                case 85: goto L84d;
                case 86: goto L84d;
                case 87: goto L84d;
                case 88: goto L84d;
                case 89: goto L84d;
                case 90: goto L84d;
                case 91: goto L84d;
                case 92: goto L84d;
                case 93: goto L84d;
                case 94: goto L84d;
                case 95: goto L84d;
                case 96: goto L84d;
                case 97: goto L84d;
                case 98: goto L84d;
                case 99: goto L84d;
                case 100: goto L84d;
                case 101: goto L84d;
                case 102: goto L84d;
                case 103: goto L84d;
                case 104: goto L84d;
                case 105: goto L84d;
                case 106: goto L84d;
                case 107: goto L84d;
                case 108: goto L84d;
                case 109: goto L84d;
                case 110: goto L84d;
                case 111: goto L84d;
                case 112: goto L84d;
                case 113: goto L84d;
                case 114: goto L84d;
                case 115: goto L84d;
                case 116: goto L84d;
                case 117: goto L84d;
                case 118: goto L84d;
                case 119: goto L84d;
                case 120: goto L84d;
                case 121: goto L84d;
                case 122: goto L84d;
                case 123: goto L84d;
                case 124: goto L84d;
                case 125: goto L84d;
                case 126: goto L84d;
                case 127: goto L84d;
                case 128: goto L84d;
                case 129: goto L84d;
                case 130: goto L84d;
                case 131: goto L84d;
                case 132: goto L84d;
                case 133: goto L84d;
                case 134: goto L84d;
                case 135: goto L84d;
                case 136: goto L84d;
                case 137: goto L84d;
                case 138: goto L84d;
                case 139: goto L84d;
                default: goto L81d;
            }
        L81d:
            java.lang.String r0 = p371v5.C6552b0.f25627d
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L83f;
                case 2006354: goto L834;
                case 2006367: goto L82b;
                default: goto L829;
            }
        L829:
            r6 = -1
            goto L849
        L82b:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L849
            goto L829
        L834:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83d
            goto L829
        L83d:
            r6 = 1
            goto L849
        L83f:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L848
            goto L829
        L848:
            r6 = 0
        L849:
            switch(r6) {
                case 0: goto L84d;
                case 1: goto L84d;
                case 2: goto L84d;
                default: goto L84c;
            }
        L84c:
            goto L84e
        L84d:
            return r9
        L84e:
            return r8
    }

    /* renamed from: H0 */
    public static int m13847H0(p406x4.C6939m r11, p088f4.C2003e0 r12) {
            int r0 = r12.f8901o0
            int r1 = r12.f8902p0
            r2 = -1
            if (r0 == r2) goto Ld5
            if (r1 != r2) goto Lb
            goto Ld5
        Lb:
            java.lang.String r3 = r12.f8896j0
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r12 = p406x4.C6944r.m14098c(r12)
            if (r12 == 0) goto L33
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r12 == r3) goto L31
            if (r12 == r7) goto L31
            if (r12 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r6
        L34:
            java.util.Objects.requireNonNull(r3)
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 3
            r10 = 4
            switch(r12) {
                case -1664118616: goto L75;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L41;
            }
        L41:
            goto L80
        L42:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L4b
            goto L80
        L4b:
            r12 = 5
            goto L81
        L4d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L56
            goto L80
        L56:
            r12 = 4
            goto L81
        L58:
            boolean r12 = r3.equals(r5)
            if (r12 != 0) goto L5f
            goto L80
        L5f:
            r12 = 3
            goto L81
        L61:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L6a
            goto L80
        L6a:
            r12 = 2
            goto L81
        L6c:
            boolean r12 = r3.equals(r6)
            if (r12 != 0) goto L73
            goto L80
        L73:
            r12 = 1
            goto L81
        L75:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L7e
            goto L80
        L7e:
            r12 = 0
            goto L81
        L80:
            r12 = -1
        L81:
            if (r12 == 0) goto Lcc
            if (r12 == r7) goto Lc9
            if (r12 == r8) goto Lcc
            if (r12 == r9) goto L8e
            if (r12 == r10) goto Lcc
            if (r12 == r4) goto Lc9
            return r2
        L8e:
            java.lang.String r12 = p371v5.C6552b0.f25627d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto Lc8
            java.lang.String r3 = p371v5.C6552b0.f25626c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lb7
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto Lc8
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto Lb7
            boolean r11 = r11.f27024f
            if (r11 == 0) goto Lb7
            goto Lc8
        Lb7:
            r11 = 16
            int r12 = p371v5.C6552b0.m13313f(r0, r11)
            int r0 = p371v5.C6552b0.m13313f(r1, r11)
            int r0 = r0 * r12
            int r0 = r0 * 16
            int r0 = r0 * 16
            goto Lce
        Lc8:
            return r2
        Lc9:
            int r0 = r0 * r1
            goto Lcf
        Lcc:
            int r0 = r0 * r1
        Lce:
            r10 = 2
        Lcf:
            int r0 = r0 * 3
            int r10 = r10 * 2
            int r0 = r0 / r10
            return r0
        Ld5:
            return r2
    }

    /* renamed from: I0 */
    public static java.util.List<p406x4.C6939m> m13848I0(p406x4.InterfaceC6942p r3, p088f4.C2003e0 r4, boolean r5, boolean r6) {
            java.lang.String r0 = r4.f8896j0
            if (r0 != 0) goto L9
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
        L9:
            java.util.List r1 = r3.mo14095a(r0, r5, r6)
            java.util.regex.Pattern r2 = p406x4.C6944r.f27104a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            u3.b r1 = new u3.b
            r1.<init>(r4)
            p406x4.C6944r.m14105j(r2, r1)
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4b
            android.util.Pair r4 = p406x4.C6944r.m14098c(r4)
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r4.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 16
            if (r4 == r0) goto L42
            r0 = 256(0x100, float:3.59E-43)
            if (r4 != r0) goto L3b
            goto L42
        L3b:
            r0 = 512(0x200, float:7.17E-43)
            if (r4 != r0) goto L4b
            java.lang.String r4 = "video/avc"
            goto L44
        L42:
            java.lang.String r4 = "video/hevc"
        L44:
            java.util.List r3 = r3.mo14095a(r4, r5, r6)
            r2.addAll(r3)
        L4b:
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)
            return r3
    }

    /* renamed from: J0 */
    public static int m13849J0(p406x4.C6939m r3, p088f4.C2003e0 r4) {
            int r0 = r4.f8897k0
            r1 = -1
            if (r0 == r1) goto L20
            java.util.List<byte[]> r3 = r4.f8898l0
            int r3 = r3.size()
            r0 = 0
            r1 = 0
        Ld:
            if (r0 >= r3) goto L1c
            java.util.List<byte[]> r2 = r4.f8898l0
            java.lang.Object r2 = r2.get(r0)
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L1c:
            int r3 = r4.f8897k0
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = m13847H0(r3, r4)
            return r3
    }

    /* renamed from: K0 */
    public static boolean m13850K0(long r3) {
            r0 = -30000(0xffffffffffff8ad0, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: A0 */
    public int mo6334A0(p406x4.InterfaceC6942p r7, p088f4.C2003e0 r8) {
            r6 = this;
            java.lang.String r0 = r8.f8896j0
            boolean r0 = p371v5.C6567q.m13380j(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            j4.d r0 = r8.f8899m0
            r2 = 1
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.util.List r3 = m13848I0(r7, r8, r0, r1)
            if (r0 == 0) goto L22
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L22
            java.util.List r3 = m13848I0(r7, r8, r1, r1)
        L22:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L29
            return r2
        L29:
            int r4 = r8.f8883C0
            r5 = 2
            if (r4 == 0) goto L33
            if (r4 != r5) goto L31
            goto L33
        L31:
            r4 = 0
            goto L34
        L33:
            r4 = 1
        L34:
            if (r4 != 0) goto L37
            return r5
        L37:
            java.lang.Object r3 = r3.get(r1)
            x4.m r3 = (p406x4.C6939m) r3
            boolean r4 = r3.m14067e(r8)
            boolean r3 = r3.m14068f(r8)
            if (r3 == 0) goto L4a
            r3 = 16
            goto L4c
        L4a:
            r3 = 8
        L4c:
            if (r4 == 0) goto L6c
            java.util.List r7 = m13848I0(r7, r8, r0, r2)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L6c
            java.lang.Object r7 = r7.get(r1)
            x4.m r7 = (p406x4.C6939m) r7
            boolean r0 = r7.m14067e(r8)
            if (r0 == 0) goto L6c
            boolean r7 = r7.m14068f(r8)
            if (r7 == 0) goto L6c
            r1 = 32
        L6c:
            if (r4 == 0) goto L70
            r7 = 4
            goto L71
        L70:
            r7 = 3
        L71:
            r7 = r7 | r3
            r7 = r7 | r1
            return r7
    }

    @Override // p406x4.AbstractC6940n, p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r6 = this;
            r0 = 0
            r6.f26472g2 = r0
            r6.m13851E0()
            r1 = 0
            r6.f26453N1 = r1
            w5.j r2 = r6.f26443D1
            w5.j$b r3 = r2.f26483b
            if (r3 == 0) goto L1d
            r3.mo13880b()
            w5.j$e r2 = r2.f26484c
            java.util.Objects.requireNonNull(r2)
            android.os.Handler r2 = r2.f26504Z
            r3 = 2
            r2.sendEmptyMessage(r3)
        L1d:
            r6.f26475j2 = r0
            super.mo5244D()     // Catch: java.lang.Throwable -> L38
            w5.o$a r0 = r6.f26444E1
            i4.e r2 = r6.f27092x1
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r2)
            monitor-exit(r2)
            android.os.Handler r3 = r0.f26517a
            if (r3 == 0) goto L37
            w5.m r4 = new w5.m
            r4.<init>(r0, r2, r1)
            r3.post(r4)
        L37:
            return
        L38:
            r0 = move-exception
            w5.o$a r2 = r6.f26444E1
            i4.e r3 = r6.f27092x1
            java.util.Objects.requireNonNull(r2)
            monitor-enter(r3)
            monitor-exit(r3)
            android.os.Handler r4 = r2.f26517a
            if (r4 == 0) goto L4e
            w5.m r5 = new w5.m
            r5.<init>(r2, r3, r1)
            r4.post(r5)
        L4e:
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: E */
    public void mo5245E(boolean r6, boolean r7) {
            r5 = this;
            i4.e r6 = new i4.e
            r6.<init>()
            r5.f27092x1 = r6
            f4.g1 r6 = r5.f8949a0
            java.util.Objects.requireNonNull(r6)
            boolean r6 = r6.f8959a
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L19
            int r2 = r5.f26474i2
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            p371v5.C6549a.m13291e(r2)
            boolean r2 = r5.f26473h2
            if (r2 == r6) goto L26
            r5.f26473h2 = r6
            r5.m14089q0()
        L26:
            w5.o$a r6 = r5.f26444E1
            i4.e r2 = r5.f27092x1
            android.os.Handler r3 = r6.f26517a
            if (r3 == 0) goto L36
            w5.m r4 = new w5.m
            r4.<init>(r6, r2, r0)
            r3.post(r4)
        L36:
            w5.j r6 = r5.f26443D1
            w5.j$b r2 = r6.f26483b
            if (r2 == 0) goto L50
            w5.j$e r2 = r6.f26484c
            java.util.Objects.requireNonNull(r2)
            android.os.Handler r2 = r2.f26504Z
            r2.sendEmptyMessage(r0)
            w5.j$b r0 = r6.f26483b
            u3.b r2 = new u3.b
            r2.<init>(r6)
            r0.mo13879a(r2)
        L50:
            r5.f26456Q1 = r7
            r5.f26457R1 = r1
            return
    }

    /* renamed from: E0 */
    public final void m13851E0() {
            r2 = this;
            r0 = 0
            r2.f26455P1 = r0
            int r0 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r0 < r1) goto L18
            boolean r0 = r2.f26473h2
            if (r0 == 0) goto L18
            x4.k r0 = r2.f27034G0
            if (r0 == 0) goto L18
            w5.h$b r1 = new w5.h$b
            r1.<init>(r2, r0)
            r2.f26475j2 = r1
        L18:
            return
    }

    @Override // p406x4.AbstractC6940n, p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r2, boolean r4) {
            r1 = this;
            super.mo5246F(r2, r4)
            r1.m13851E0()
            w5.j r2 = r1.f26443D1
            r2.m13875b()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f26464Y1 = r2
            r1.f26458S1 = r2
            r0 = 0
            r1.f26462W1 = r0
            if (r4 == 0) goto L1d
            r1.m13862T0()
            goto L1f
        L1d:
            r1.f26459T1 = r2
        L1f:
            return
    }

    /* renamed from: F0 */
    public boolean m13852F0(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "OMX.google"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Class<w5.h> r2 = p387w5.C6805h.class
            monitor-enter(r2)
            boolean r0 = p387w5.C6805h.f26440m2     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1a
            boolean r0 = m13846G0()     // Catch: java.lang.Throwable -> L1e
            p387w5.C6805h.f26441n2 = r0     // Catch: java.lang.Throwable -> L1e
            r0 = 1
            p387w5.C6805h.f26440m2 = r0     // Catch: java.lang.Throwable -> L1e
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r2 = p387w5.C6805h.f26441n2
            return r2
        L1e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    @android.annotation.TargetApi(17)
    /* renamed from: G */
    public void mo5247G() {
            r2 = this;
            r0 = 0
            r2.m14075O()     // Catch: java.lang.Throwable -> L14
            r2.m14089q0()     // Catch: java.lang.Throwable -> L14
            r2.m14093w0(r0)     // Catch: java.lang.Throwable -> L12
            w5.d r0 = r2.f26452M1
            if (r0 == 0) goto L11
            r2.m13859Q0()
        L11:
            return
        L12:
            r0 = move-exception
            goto L19
        L14:
            r1 = move-exception
            r2.m14093w0(r0)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L19:
            w5.d r1 = r2.f26452M1
            if (r1 == 0) goto L20
            r2.m13859Q0()
        L20:
            throw r0
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: H */
    public void mo5248H() {
            r5 = this;
            r0 = 0
            r5.f26461V1 = r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5.f26460U1 = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r5.f26465Z1 = r1
            r1 = 0
            r5.f26466a2 = r1
            r5.f26467b2 = r0
            w5.j r1 = r5.f26443D1
            r2 = 1
            r1.f26485d = r2
            r1.m13875b()
            r1.m13877d(r0)
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: I */
    public void mo5249I() {
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f26459T1 = r0
            r7.m13853L0()
            int r0 = r7.f26467b2
            r1 = 0
            if (r0 == 0) goto L25
            w5.o$a r2 = r7.f26444E1
            long r3 = r7.f26466a2
            android.os.Handler r5 = r2.f26517a
            if (r5 == 0) goto L1f
            w5.l r6 = new w5.l
            r6.<init>(r2, r3, r0)
            r5.post(r6)
        L1f:
            r2 = 0
            r7.f26466a2 = r2
            r7.f26467b2 = r1
        L25:
            w5.j r0 = r7.f26443D1
            r0.f26485d = r1
            r0.m13874a()
            return
    }

    /* renamed from: L0 */
    public final void m13853L0() {
            r8 = this;
            int r0 = r8.f26461V1
            if (r0 <= 0) goto L21
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.f26460U1
            long r2 = r0 - r2
            w5.o$a r4 = r8.f26444E1
            int r5 = r8.f26461V1
            android.os.Handler r6 = r4.f26517a
            if (r6 == 0) goto L1c
            w5.l r7 = new w5.l
            r7.<init>(r4, r5, r2)
            r6.post(r7)
        L1c:
            r2 = 0
            r8.f26461V1 = r2
            r8.f26460U1 = r0
        L21:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: M */
    public p142i4.C3075i mo6337M(p406x4.C6939m r9, p088f4.C2003e0 r10, p088f4.C2003e0 r11) {
            r8 = this;
            i4.i r0 = r9.m14065c(r10, r11)
            int r1 = r0.f12369e
            int r2 = r11.f8901o0
            w5.h$a r3 = r8.f26448I1
            int r4 = r3.f26477a
            if (r2 > r4) goto L14
            int r2 = r11.f8902p0
            int r3 = r3.f26478b
            if (r2 <= r3) goto L16
        L14:
            r1 = r1 | 256(0x100, float:3.59E-43)
        L16:
            int r2 = m13849J0(r9, r11)
            w5.h$a r3 = r8.f26448I1
            int r3 = r3.f26479c
            if (r2 <= r3) goto L22
            r1 = r1 | 64
        L22:
            r7 = r1
            i4.i r1 = new i4.i
            java.lang.String r3 = r9.f27019a
            if (r7 == 0) goto L2c
            r9 = 0
            r6 = 0
            goto L2f
        L2c:
            int r9 = r0.f12368d
            r6 = r9
        L2f:
            r2 = r1
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
    }

    /* renamed from: M0 */
    public void m13854M0() {
            r7 = this;
            r0 = 1
            r7.f26457R1 = r0
            boolean r1 = r7.f26455P1
            if (r1 != 0) goto L21
            r7.f26455P1 = r0
            w5.o$a r1 = r7.f26444E1
            android.view.Surface r2 = r7.f26451L1
            android.os.Handler r3 = r1.f26517a
            if (r3 == 0) goto L1f
            long r3 = android.os.SystemClock.elapsedRealtime()
            android.os.Handler r5 = r1.f26517a
            w5.n r6 = new w5.n
            r6.<init>(r1, r2, r3)
            r5.post(r6)
        L1f:
            r7.f26453N1 = r0
        L21:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: N */
    public p406x4.C6938l mo13855N(java.lang.Throwable r3, p406x4.C6939m r4) {
            r2 = this;
            w5.g r0 = new w5.g
            android.view.Surface r1 = r2.f26451L1
            r0.<init>(r3, r4, r1)
            return r0
    }

    /* renamed from: N0 */
    public final void m13856N0() {
            r5 = this;
            int r0 = r5.f26468c2
            r1 = -1
            if (r0 != r1) goto L9
            int r2 = r5.f26469d2
            if (r2 == r1) goto L40
        L9:
            w5.p r1 = r5.f26472g2
            if (r1 == 0) goto L25
            int r2 = r1.f26519Y
            if (r2 != r0) goto L25
            int r2 = r1.f26520Z
            int r3 = r5.f26469d2
            if (r2 != r3) goto L25
            int r2 = r1.f26521a0
            int r3 = r5.f26470e2
            if (r2 != r3) goto L25
            float r1 = r1.f26522b0
            float r2 = r5.f26471f2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L40
        L25:
            w5.p r1 = new w5.p
            int r2 = r5.f26469d2
            int r3 = r5.f26470e2
            float r4 = r5.f26471f2
            r1.<init>(r0, r2, r3, r4)
            r5.f26472g2 = r1
            w5.o$a r0 = r5.f26444E1
            android.os.Handler r2 = r0.f26517a
            if (r2 == 0) goto L40
            a4.c r3 = new a4.c
            r3.<init>(r0, r1)
            r2.post(r3)
        L40:
            return
    }

    /* renamed from: O0 */
    public final void m13857O0(long r8, long r10, p088f4.C2003e0 r12) {
            r7 = this;
            w5.i r0 = r7.f26476k2
            if (r0 == 0) goto Lc
            android.media.MediaFormat r6 = r7.f27036I0
            r1 = r8
            r3 = r10
            r5 = r12
            r0.mo5308f(r1, r3, r5, r6)
        Lc:
            return
    }

    /* renamed from: P0 */
    public void m13858P0(long r3) {
            r2 = this;
            r2.m14073D0(r3)
            r2.m13856N0()
            i4.e r0 = r2.f27092x1
            int r1 = r0.f12350e
            int r1 = r1 + 1
            r0.f12350e = r1
            r2.m13854M0()
            super.mo13869k0(r3)
            boolean r3 = r2.f26473h2
            if (r3 != 0) goto L1e
            int r3 = r2.f26463X1
            int r3 = r3 + (-1)
            r2.f26463X1 = r3
        L1e:
            return
    }

    /* renamed from: Q0 */
    public final void m13859Q0() {
            r3 = this;
            android.view.Surface r0 = r3.f26451L1
            w5.d r1 = r3.f26452M1
            r2 = 0
            if (r0 != r1) goto L9
            r3.f26451L1 = r2
        L9:
            r1.release()
            r3.f26452M1 = r2
            return
    }

    /* renamed from: R0 */
    public void m13860R0(p406x4.InterfaceC6937k r4, int r5) {
            r3 = this;
            r3.m13856N0()
            java.lang.String r0 = "releaseOutputBuffer"
            p371v5.C6549a.m13287a(r0)
            r0 = 1
            r4.mo14033c(r5, r0)
            p371v5.C6549a.m13293g()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r3.f26465Z1 = r4
            i4.e r4 = r3.f27092x1
            int r5 = r4.f12350e
            int r5 = r5 + r0
            r4.f12350e = r5
            r4 = 0
            r3.f26462W1 = r4
            r3.m13854M0()
            return
    }

    /* renamed from: S0 */
    public void m13861S0(p406x4.InterfaceC6937k r2, int r3, long r4) {
            r1 = this;
            r1.m13856N0()
            java.lang.String r0 = "releaseOutputBuffer"
            p371v5.C6549a.m13287a(r0)
            r2.mo14043m(r3, r4)
            p371v5.C6549a.m13293g()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.f26465Z1 = r2
            i4.e r2 = r1.f27092x1
            int r3 = r2.f12350e
            int r3 = r3 + 1
            r2.f12350e = r3
            r2 = 0
            r1.f26462W1 = r2
            r1.m13854M0()
            return
    }

    /* renamed from: T0 */
    public final void m13862T0() {
            r5 = this;
            long r0 = r5.f26445F1
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.f26445F1
            long r0 = r0 + r2
            goto L15
        L10:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L15:
            r5.f26459T1 = r0
            return
    }

    /* renamed from: U0 */
    public final boolean m13863U0(p406x4.C6939m r3) {
            r2 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r0 < r1) goto L20
            boolean r0 = r2.f26473h2
            if (r0 != 0) goto L20
            java.lang.String r0 = r3.f27019a
            boolean r0 = r2.m13852F0(r0)
            if (r0 != 0) goto L20
            boolean r3 = r3.f27024f
            if (r3 == 0) goto L1e
            android.content.Context r3 = r2.f26442C1
            boolean r3 = p387w5.C6801d.m13837b(r3)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
    }

    /* renamed from: V0 */
    public void m13864V0(p406x4.InterfaceC6937k r2, int r3) {
            r1 = this;
            java.lang.String r0 = "skipVideoBuffer"
            p371v5.C6549a.m13287a(r0)
            r0 = 0
            r2.mo14033c(r3, r0)
            p371v5.C6549a.m13293g()
            i4.e r2 = r1.f27092x1
            int r3 = r2.f12351f
            int r3 = r3 + 1
            r2.f12351f = r3
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: W */
    public boolean mo13865W() {
            r2 = this;
            boolean r0 = r2.f26473h2
            if (r0 == 0) goto Lc
            int r0 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: W0 */
    public void m13866W0(int r3) {
            r2 = this;
            i4.e r0 = r2.f27092x1
            int r1 = r0.f12352g
            int r1 = r1 + r3
            r0.f12352g = r1
            int r1 = r2.f26461V1
            int r1 = r1 + r3
            r2.f26461V1 = r1
            int r1 = r2.f26462W1
            int r1 = r1 + r3
            r2.f26462W1 = r1
            int r3 = r0.f12353h
            int r3 = java.lang.Math.max(r1, r3)
            r0.f12353h = r3
            int r3 = r2.f26446G1
            if (r3 <= 0) goto L24
            int r0 = r2.f26461V1
            if (r0 < r3) goto L24
            r2.m13853L0()
        L24:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: X */
    public float mo6338X(float r6, p088f4.C2003e0 r7, p088f4.C2003e0[] r8) {
            r5 = this;
            int r7 = r8.length
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L6:
            if (r1 >= r7) goto L17
            r3 = r8[r1]
            float r3 = r3.f8903q0
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L14
            float r2 = java.lang.Math.max(r2, r3)
        L14:
            int r1 = r1 + 1
            goto L6
        L17:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L1c
            goto L1e
        L1c:
            float r0 = r2 * r6
        L1e:
            return r0
    }

    /* renamed from: X0 */
    public void m13867X0(long r4) {
            r3 = this;
            i4.e r0 = r3.f27092x1
            long r1 = r0.f12355j
            long r1 = r1 + r4
            r0.f12355j = r1
            int r1 = r0.f12356k
            int r1 = r1 + 1
            r0.f12356k = r1
            long r0 = r3.f26466a2
            long r0 = r0 + r4
            r3.f26466a2 = r0
            int r4 = r3.f26467b2
            int r4 = r4 + 1
            r3.f26467b2 = r4
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: Y */
    public java.util.List<p406x4.C6939m> mo6339Y(p406x4.InterfaceC6942p r2, p088f4.C2003e0 r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.f26473h2
            java.util.List r2 = m13848I0(r2, r3, r4, r0)
            return r2
    }

    @Override // p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1
    /* renamed from: a */
    public java.lang.String mo5195a() {
            r1 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            return r0
    }

    @Override // p406x4.AbstractC6940n
    @android.annotation.TargetApi(17)
    /* renamed from: a0 */
    public p406x4.InterfaceC6937k.a mo6340a0(p406x4.C6939m r22, p088f4.C2003e0 r23, android.media.MediaCrypto r24, float r25) {
            r21 = this;
            r0 = r21
            r2 = r22
            r4 = r23
            r1 = r25
            w5.d r3 = r0.f26452M1
            if (r3 == 0) goto L15
            boolean r3 = r3.f26414Y
            boolean r5 = r2.f27024f
            if (r3 == r5) goto L15
            r21.m13859Q0()
        L15:
            java.lang.String r3 = r2.f27021c
            f4.e0[] r5 = r0.f8953e0
            java.util.Objects.requireNonNull(r5)
            int r6 = r4.f8901o0
            int r7 = r4.f8902p0
            int r8 = m13849J0(r22, r23)
            int r9 = r5.length
            r10 = -1
            r11 = 1
            if (r9 != r11) goto L42
            if (r8 == r10) goto L3b
            int r5 = m13847H0(r22, r23)
            if (r5 == r10) goto L3b
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L3b:
            w5.h$a r5 = new w5.h$a
            r5.<init>(r6, r7, r8)
            goto L162
        L42:
            int r9 = r5.length
            r11 = 0
            r12 = 0
        L45:
            if (r11 >= r9) goto L87
            r13 = r5[r11]
            w5.b r14 = r4.f8908v0
            if (r14 == 0) goto L5d
            w5.b r14 = r13.f8908v0
            if (r14 != 0) goto L5d
            f4.e0$b r13 = r13.m5191a()
            w5.b r14 = r4.f8908v0
            r13.f8939w = r14
            f4.e0 r13 = r13.m5193a()
        L5d:
            i4.i r14 = r2.m14065c(r4, r13)
            int r14 = r14.f12368d
            if (r14 == 0) goto L84
            int r14 = r13.f8901o0
            if (r14 == r10) goto L70
            int r15 = r13.f8902p0
            if (r15 != r10) goto L6e
            goto L70
        L6e:
            r15 = 0
            goto L71
        L70:
            r15 = 1
        L71:
            r12 = r12 | r15
            int r6 = java.lang.Math.max(r6, r14)
            int r14 = r13.f8902p0
            int r7 = java.lang.Math.max(r7, r14)
            int r13 = m13849J0(r2, r13)
            int r8 = java.lang.Math.max(r8, r13)
        L84:
            int r11 = r11 + 1
            goto L45
        L87:
            if (r12 == 0) goto L15d
            r5 = 66
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            java.lang.String r10 = "x"
            java.lang.String r5 = p304r4.C5785f.m12134a(r5, r9, r6, r10, r7)
            java.lang.String r9 = "MediaCodecVideoRenderer"
            android.util.Log.w(r9, r5)
            int r5 = r4.f8902p0
            int r11 = r4.f8901o0
            if (r5 <= r11) goto La0
            r12 = 1
            goto La1
        La0:
            r12 = 0
        La1:
            if (r12 == 0) goto La5
            r13 = r5
            goto La6
        La5:
            r13 = r11
        La6:
            if (r12 == 0) goto La9
            r5 = r11
        La9:
            float r11 = (float) r5
            float r14 = (float) r13
            float r11 = r11 / r14
            int[] r14 = p387w5.C6805h.f26439l2
            int r15 = r14.length
            r16 = 0
            r1 = 0
        Lb2:
            r16 = 0
            if (r1 >= r15) goto L12e
            r17 = r15
            r15 = r14[r1]
            r18 = r14
            float r14 = (float) r15
            float r14 = r14 * r11
            int r14 = (int) r14
            if (r15 <= r13) goto L12e
            if (r14 > r5) goto Lc6
            goto L12e
        Lc6:
            r19 = r5
            int r5 = p371v5.C6552b0.f25624a
            r20 = r11
            r11 = 21
            if (r5 < r11) goto Lfc
            if (r12 == 0) goto Ld4
            r5 = r14
            goto Ld5
        Ld4:
            r5 = r15
        Ld5:
            if (r12 == 0) goto Ld8
            goto Ld9
        Ld8:
            r15 = r14
        Ld9:
            android.media.MediaCodecInfo$CodecCapabilities r11 = r2.f27022d
            if (r11 != 0) goto Lde
            goto Le4
        Lde:
            android.media.MediaCodecInfo$VideoCapabilities r11 = r11.getVideoCapabilities()
            if (r11 != 0) goto Le7
        Le4:
            r5 = r16
            goto Lec
        Le7:
            android.graphics.Point r16 = p406x4.C6939m.m14062a(r11, r5, r15)
            goto Le4
        Lec:
            float r11 = r4.f8903q0
            int r14 = r5.x
            int r15 = r5.y
            r16 = r5
            double r4 = (double) r11
            boolean r4 = r2.m14069g(r14, r15, r4)
            if (r4 == 0) goto L121
            goto L12e
        Lfc:
            r4 = 16
            int r5 = p371v5.C6552b0.m13313f(r15, r4)     // Catch: p406x4.C6944r.c -> L12e
            int r5 = r5 * 16
            int r4 = p371v5.C6552b0.m13313f(r14, r4)     // Catch: p406x4.C6944r.c -> L12e
            int r4 = r4 * 16
            int r11 = r5 * r4
            int r14 = p406x4.C6944r.m14104i()     // Catch: p406x4.C6944r.c -> L12e
            if (r11 > r14) goto L121
            android.graphics.Point r1 = new android.graphics.Point     // Catch: p406x4.C6944r.c -> L12e
            if (r12 == 0) goto L118
            r11 = r4
            goto L119
        L118:
            r11 = r5
        L119:
            if (r12 == 0) goto L11c
            goto L11d
        L11c:
            r5 = r4
        L11d:
            r1.<init>(r11, r5)     // Catch: p406x4.C6944r.c -> L12e
            goto L130
        L121:
            int r1 = r1 + 1
            r4 = r23
            r15 = r17
            r14 = r18
            r5 = r19
            r11 = r20
            goto Lb2
        L12e:
            r1 = r16
        L130:
            if (r1 == 0) goto L15d
            int r4 = r1.x
            int r6 = java.lang.Math.max(r6, r4)
            int r1 = r1.y
            int r7 = java.lang.Math.max(r7, r1)
            f4.e0$b r1 = r23.m5191a()
            r1.f8932p = r6
            r1.f8933q = r7
            f4.e0 r1 = r1.m5193a()
            int r1 = m13847H0(r2, r1)
            int r8 = java.lang.Math.max(r8, r1)
            r1 = 57
            java.lang.String r4 = "Codec max resolution adjusted to: "
            java.lang.String r1 = p304r4.C5785f.m12134a(r1, r4, r6, r10, r7)
            android.util.Log.w(r9, r1)
        L15d:
            w5.h$a r5 = new w5.h$a
            r5.<init>(r6, r7, r8)
        L162:
            r0.f26448I1 = r5
            boolean r1 = r0.f26447H1
            boolean r4 = r0.f26473h2
            if (r4 == 0) goto L16d
            int r4 = r0.f26474i2
            goto L16e
        L16d:
            r4 = 0
        L16e:
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r3)
            r7 = r23
            int r3 = r7.f8901o0
            java.lang.String r8 = "width"
            r6.setInteger(r8, r3)
            int r3 = r7.f8902p0
            java.lang.String r8 = "height"
            r6.setInteger(r8, r3)
            java.util.List<byte[]> r3 = r7.f8898l0
            p064e.C1487a.m4031i(r6, r3)
            float r3 = r7.f8903q0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 == 0) goto L19a
            java.lang.String r9 = "frame-rate"
            r6.setFloat(r9, r3)
        L19a:
            int r3 = r7.f8904r0
            java.lang.String r9 = "rotation-degrees"
            p064e.C1487a.m4029g(r6, r9, r3)
            w5.b r3 = r7.f8908v0
            if (r3 == 0) goto L1c7
            int r9 = r3.f26405a0
            java.lang.String r10 = "color-transfer"
            p064e.C1487a.m4029g(r6, r10, r9)
            int r9 = r3.f26403Y
            java.lang.String r10 = "color-standard"
            p064e.C1487a.m4029g(r6, r10, r9)
            int r9 = r3.f26404Z
            java.lang.String r10 = "color-range"
            p064e.C1487a.m4029g(r6, r10, r9)
            byte[] r3 = r3.f26406b0
            if (r3 == 0) goto L1c7
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            java.lang.String r9 = "hdr-static-info"
            r6.setByteBuffer(r9, r3)
        L1c7:
            java.lang.String r3 = r7.f8896j0
            java.lang.String r9 = "video/dolby-vision"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L1e4
            android.util.Pair r3 = p406x4.C6944r.m14098c(r23)
            if (r3 == 0) goto L1e4
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r9 = "profile"
            p064e.C1487a.m4029g(r6, r9, r3)
        L1e4:
            int r3 = r5.f26477a
            java.lang.String r9 = "max-width"
            r6.setInteger(r9, r3)
            int r3 = r5.f26478b
            java.lang.String r9 = "max-height"
            r6.setInteger(r9, r3)
            int r3 = r5.f26479c
            java.lang.String r5 = "max-input-size"
            p064e.C1487a.m4029g(r6, r5, r3)
            int r3 = p371v5.C6552b0.f25624a
            r5 = 23
            if (r3 < r5) goto L210
            java.lang.String r3 = "priority"
            r5 = 0
            r6.setInteger(r3, r5)
            r3 = r25
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L210
            java.lang.String r5 = "operating-rate"
            r6.setFloat(r5, r3)
        L210:
            if (r1 == 0) goto L21f
            java.lang.String r1 = "no-post-process"
            r3 = 1
            r6.setInteger(r1, r3)
            java.lang.String r1 = "auto-frc"
            r5 = 0
            r6.setInteger(r1, r5)
            goto L220
        L21f:
            r3 = 1
        L220:
            if (r4 == 0) goto L22c
            java.lang.String r1 = "tunneled-playback"
            r6.setFeatureEnabled(r1, r3)
            java.lang.String r1 = "audio-session-id"
            r6.setInteger(r1, r4)
        L22c:
            android.view.Surface r1 = r0.f26451L1
            if (r1 != 0) goto L24f
            boolean r1 = r21.m13863U0(r22)
            if (r1 == 0) goto L249
            w5.d r1 = r0.f26452M1
            if (r1 != 0) goto L244
            android.content.Context r1 = r0.f26442C1
            boolean r3 = r2.f27024f
            w5.d r1 = p387w5.C6801d.m13838c(r1, r3)
            r0.f26452M1 = r1
        L244:
            w5.d r1 = r0.f26452M1
            r0.f26451L1 = r1
            goto L24f
        L249:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L24f:
            android.view.Surface r5 = r0.f26451L1
            x4.k$a r9 = new x4.k$a
            r8 = 0
            r10 = 0
            r1 = r9
            r2 = r22
            r3 = r6
            r4 = r23
            r6 = r24
            r7 = r8
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Override // p406x4.AbstractC6940n
    @android.annotation.TargetApi(29)
    /* renamed from: b0 */
    public void mo13868b0(p142i4.C3073g r8) {
            r7 = this;
            boolean r0 = r7.f26450K1
            if (r0 != 0) goto L5
            return
        L5:
            java.nio.ByteBuffer r8 = r8.f12361d0
            java.util.Objects.requireNonNull(r8)
            int r0 = r8.remaining()
            r1 = 7
            if (r0 < r1) goto L54
            byte r0 = r8.get()
            short r1 = r8.getShort()
            short r2 = r8.getShort()
            byte r3 = r8.get()
            byte r4 = r8.get()
            r5 = 0
            r8.position(r5)
            r6 = -75
            if (r0 != r6) goto L54
            r0 = 60
            if (r1 != r0) goto L54
            r0 = 1
            if (r2 != r0) goto L54
            r0 = 4
            if (r3 != r0) goto L54
            if (r4 != 0) goto L54
            int r0 = r8.remaining()
            byte[] r0 = new byte[r0]
            r8.get(r0)
            r8.position(r5)
            x4.k r8 = r7.f27034G0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "hdr10-plus-info"
            r1.putByteArray(r2, r0)
            r8.mo14039i(r1)
        L54:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: f0 */
    public void mo6341f0(java.lang.Exception r4) {
            r3 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            java.lang.String r1 = "Video codec error"
            p371v5.C6565o.m13369b(r0, r1, r4)
            w5.o$a r0 = r3.f26444E1
            android.os.Handler r1 = r0.f26517a
            if (r1 == 0) goto L15
            a4.c r2 = new a4.c
            r2.<init>(r0, r4)
            r1.post(r2)
        L15:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: g0 */
    public void mo6342g0(java.lang.String r10, long r11, long r13) {
            r9 = this;
            w5.o$a r1 = r9.f26444E1
            android.os.Handler r7 = r1.f26517a
            if (r7 == 0) goto L12
            h4.k r8 = new h4.k
            r0 = r8
            r2 = r10
            r3 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r5)
            r7.post(r8)
        L12:
            boolean r10 = r9.m13852F0(r10)
            r9.f26449J1 = r10
            x4.m r10 = r9.f27041N0
            java.util.Objects.requireNonNull(r10)
            int r11 = p371v5.C6552b0.f25624a
            r12 = 29
            r13 = 0
            if (r11 < r12) goto L43
            java.lang.String r11 = r10.f27020b
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L43
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r10.m14066d()
            int r11 = r10.length
            r12 = 0
        L34:
            if (r12 >= r11) goto L43
            r14 = r10[r12]
            int r14 = r14.profile
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r14 != r0) goto L40
            r13 = 1
            goto L43
        L40:
            int r12 = r12 + 1
            goto L34
        L43:
            r9.f26450K1 = r13
            int r10 = p371v5.C6552b0.f25624a
            r11 = 23
            if (r10 < r11) goto L5b
            boolean r10 = r9.f26473h2
            if (r10 == 0) goto L5b
            w5.h$b r10 = new w5.h$b
            x4.k r11 = r9.f27034G0
            java.util.Objects.requireNonNull(r11)
            r10.<init>(r9, r11)
            r9.f26475j2 = r10
        L5b:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: h0 */
    public void mo6343h0(java.lang.String r4) {
            r3 = this;
            w5.o$a r0 = r3.f26444E1
            android.os.Handler r1 = r0.f26517a
            if (r1 == 0) goto Le
            a4.c r2 = new a4.c
            r2.<init>(r0, r4)
            r1.post(r2)
        Le:
            return
    }

    @Override // p406x4.AbstractC6940n, p088f4.InterfaceC2004e1
    /* renamed from: i */
    public boolean mo5200i() {
            r9 = this;
            boolean r0 = super.mo5200i()
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L23
            boolean r0 = r9.f26455P1
            if (r0 != 0) goto L20
            w5.d r0 = r9.f26452M1
            if (r0 == 0) goto L18
            android.view.Surface r4 = r9.f26451L1
            if (r4 == r0) goto L20
        L18:
            x4.k r0 = r9.f27034G0
            if (r0 == 0) goto L20
            boolean r0 = r9.f26473h2
            if (r0 == 0) goto L23
        L20:
            r9.f26459T1 = r2
            return r1
        L23:
            long r4 = r9.f26459T1
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2b
            return r0
        L2b:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.f26459T1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L36
            return r1
        L36:
            r9.f26459T1 = r2
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: i0 */
    public p142i4.C3075i mo6344i0(androidx.appcompat.widget.C0311x r5) {
            r4 = this;
            i4.i r0 = super.mo6344i0(r5)
            w5.o$a r1 = r4.f26444E1
            java.lang.Object r5 = r5.f1482a0
            f4.e0 r5 = (p088f4.C2003e0) r5
            android.os.Handler r2 = r1.f26517a
            if (r2 == 0) goto L16
            f4.n0 r3 = new f4.n0
            r3.<init>(r1, r5, r0)
            r2.post(r3)
        L16:
            return r0
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: j0 */
    public void mo6345j0(p088f4.C2003e0 r8, android.media.MediaFormat r9) {
            r7 = this;
            x4.k r0 = r7.f27034G0
            if (r0 == 0) goto L9
            int r1 = r7.f26454O1
            r0.mo14034d(r1)
        L9:
            boolean r0 = r7.f26473h2
            r1 = 0
            if (r0 == 0) goto L17
            int r9 = r8.f8901o0
            r7.f26468c2 = r9
            int r9 = r8.f8902p0
            r7.f26469d2 = r9
            goto L68
        L17:
            java.util.Objects.requireNonNull(r9)
            java.lang.String r0 = "crop-right"
            boolean r2 = r9.containsKey(r0)
            java.lang.String r3 = "crop-top"
            java.lang.String r4 = "crop-bottom"
            java.lang.String r5 = "crop-left"
            r6 = 1
            if (r2 == 0) goto L3d
            boolean r2 = r9.containsKey(r5)
            if (r2 == 0) goto L3d
            boolean r2 = r9.containsKey(r4)
            if (r2 == 0) goto L3d
            boolean r2 = r9.containsKey(r3)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = 0
        L3e:
            if (r2 == 0) goto L4b
            int r0 = r9.getInteger(r0)
            int r5 = r9.getInteger(r5)
            int r0 = r0 - r5
            int r0 = r0 + r6
            goto L51
        L4b:
            java.lang.String r0 = "width"
            int r0 = r9.getInteger(r0)
        L51:
            r7.f26468c2 = r0
            if (r2 == 0) goto L60
            int r0 = r9.getInteger(r4)
            int r9 = r9.getInteger(r3)
            int r0 = r0 - r9
            int r0 = r0 + r6
            goto L66
        L60:
            java.lang.String r0 = "height"
            int r0 = r9.getInteger(r0)
        L66:
            r7.f26469d2 = r0
        L68:
            float r9 = r8.f8905s0
            r7.f26471f2 = r9
            int r0 = p371v5.C6552b0.f25624a
            r2 = 21
            if (r0 < r2) goto L8a
            int r0 = r8.f8904r0
            r2 = 90
            if (r0 == r2) goto L7c
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto L8e
        L7c:
            int r0 = r7.f26468c2
            int r2 = r7.f26469d2
            r7.f26468c2 = r2
            r7.f26469d2 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r9
            r7.f26471f2 = r0
            goto L8e
        L8a:
            int r9 = r8.f8904r0
            r7.f26470e2 = r9
        L8e:
            w5.j r9 = r7.f26443D1
            float r8 = r8.f8903q0
            r9.f26487f = r8
            w5.e r8 = r9.f26482a
            w5.e$a r0 = r8.f26422a
            r0.m13844c()
            w5.e$a r0 = r8.f26423b
            r0.m13844c()
            r8.f26424c = r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.f26425d = r2
            r8.f26426e = r1
            r9.m13876c()
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: k0 */
    public void mo13869k0(long r1) {
            r0 = this;
            super.mo13869k0(r1)
            boolean r1 = r0.f26473h2
            if (r1 != 0) goto Ld
            int r1 = r0.f26463X1
            int r1 = r1 + (-1)
            r0.f26463X1 = r1
        Ld:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: l0 */
    public void mo6346l0() {
            r0 = this;
            r0.m13851E0()
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: m0 */
    public void mo6347m0(p142i4.C3073g r4) {
            r3 = this;
            boolean r0 = r3.f26473h2
            if (r0 != 0) goto La
            int r1 = r3.f26463X1
            int r1 = r1 + 1
            r3.f26463X1 = r1
        La:
            int r1 = p371v5.C6552b0.f25624a
            r2 = 23
            if (r1 >= r2) goto L17
            if (r0 == 0) goto L17
            long r0 = r4.f12360c0
            r3.m13858P0(r0)
        L17:
            return
    }

    @Override // p088f4.AbstractC2008g, p088f4.C1992a1.b
    /* renamed from: n */
    public void mo5108n(int r5, java.lang.Object r6) {
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L53
            r1 = 7
            if (r5 == r1) goto L4d
            r1 = 10
            if (r5 == r1) goto L38
            r1 = 4
            if (r5 == r1) goto L27
            r1 = 5
            if (r5 == r1) goto L12
            goto L110
        L12:
            w5.j r5 = r4.f26443D1
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r1 = r5.f26491j
            if (r1 != r6) goto L20
            goto L110
        L20:
            r5.f26491j = r6
            r5.m13877d(r0)
            goto L110
        L27:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.f26454O1 = r5
            x4.k r6 = r4.f27034G0
            if (r6 == 0) goto L110
            r6.mo14034d(r5)
            goto L110
        L38:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            int r6 = r4.f26474i2
            if (r6 == r5) goto L110
            r4.f26474i2 = r5
            boolean r5 = r4.f26473h2
            if (r5 == 0) goto L110
            r4.m14089q0()
            goto L110
        L4d:
            w5.i r6 = (p387w5.InterfaceC6806i) r6
            r4.f26476k2 = r6
            goto L110
        L53:
            boolean r5 = r6 instanceof android.view.Surface
            r1 = 0
            if (r5 == 0) goto L5b
            android.view.Surface r6 = (android.view.Surface) r6
            goto L5c
        L5b:
            r6 = r1
        L5c:
            if (r6 != 0) goto L78
            w5.d r5 = r4.f26452M1
            if (r5 == 0) goto L64
            r6 = r5
            goto L78
        L64:
            x4.m r5 = r4.f27041N0
            if (r5 == 0) goto L78
            boolean r2 = r4.m13863U0(r5)
            if (r2 == 0) goto L78
            android.content.Context r6 = r4.f26442C1
            boolean r5 = r5.f27024f
            w5.d r6 = p387w5.C6801d.m13838c(r6, r5)
            r4.f26452M1 = r6
        L78:
            android.view.Surface r5 = r4.f26451L1
            if (r5 == r6) goto Lde
            r4.f26451L1 = r6
            w5.j r5 = r4.f26443D1
            java.util.Objects.requireNonNull(r5)
            boolean r2 = r6 instanceof p387w5.C6801d
            if (r2 == 0) goto L89
            r2 = r1
            goto L8a
        L89:
            r2 = r6
        L8a:
            android.view.Surface r3 = r5.f26486e
            if (r3 != r2) goto L8f
            goto L97
        L8f:
            r5.m13874a()
            r5.f26486e = r2
            r5.m13877d(r0)
        L97:
            r5 = 0
            r4.f26453N1 = r5
            int r5 = r4.f8951c0
            x4.k r0 = r4.f27034G0
            if (r0 == 0) goto Lb6
            int r2 = p371v5.C6552b0.f25624a
            r3 = 23
            if (r2 < r3) goto Lb0
            if (r6 == 0) goto Lb0
            boolean r2 = r4.f26449J1
            if (r2 != 0) goto Lb0
            r0.mo14037g(r6)
            goto Lb6
        Lb0:
            r4.m14089q0()
            r4.m14085d0()
        Lb6:
            if (r6 == 0) goto Ld8
            w5.d r0 = r4.f26452M1
            if (r6 == r0) goto Ld8
            w5.p r6 = r4.f26472g2
            if (r6 == 0) goto Lce
            w5.o$a r0 = r4.f26444E1
            android.os.Handler r1 = r0.f26517a
            if (r1 == 0) goto Lce
            a4.c r2 = new a4.c
            r2.<init>(r0, r6)
            r1.post(r2)
        Lce:
            r4.m13851E0()
            r6 = 2
            if (r5 != r6) goto L110
            r4.m13862T0()
            goto L110
        Ld8:
            r4.f26472g2 = r1
            r4.m13851E0()
            goto L110
        Lde:
            if (r6 == 0) goto L110
            w5.d r5 = r4.f26452M1
            if (r6 == r5) goto L110
            w5.p r5 = r4.f26472g2
            if (r5 == 0) goto Lf6
            w5.o$a r6 = r4.f26444E1
            android.os.Handler r0 = r6.f26517a
            if (r0 == 0) goto Lf6
            a4.c r1 = new a4.c
            r1.<init>(r6, r5)
            r0.post(r1)
        Lf6:
            boolean r5 = r4.f26453N1
            if (r5 == 0) goto L110
            w5.o$a r5 = r4.f26444E1
            android.view.Surface r6 = r4.f26451L1
            android.os.Handler r0 = r5.f26517a
            if (r0 == 0) goto L110
            long r0 = android.os.SystemClock.elapsedRealtime()
            android.os.Handler r2 = r5.f26517a
            w5.n r3 = new w5.n
            r3.<init>(r5, r6, r0)
            r2.post(r3)
        L110:
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: o0 */
    public boolean mo6348o0(long r28, long r30, p406x4.InterfaceC6937k r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, p088f4.C2003e0 r41) {
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r32
            r4 = r34
            r5 = r37
            java.util.Objects.requireNonNull(r32)
            long r7 = r0.f26458S1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L1a
            r0.f26458S1 = r1
        L1a:
            long r7 = r0.f26464Y1
            r13 = -1
            r15 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 == 0) goto Lb9
            w5.j r7 = r0.f26443D1
            long r9 = r7.f26495n
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L33
            r7.f26497p = r9
            long r8 = r7.f26496o
            r7.f26498q = r8
        L33:
            long r8 = r7.f26494m
            r19 = 1
            long r8 = r8 + r19
            r7.f26494m = r8
            w5.e r8 = r7.f26482a
            long r9 = r5 * r15
            w5.e$a r13 = r8.f26422a
            r13.m13843b(r9)
            w5.e$a r13 = r8.f26422a
            boolean r13 = r13.m13842a()
            if (r13 == 0) goto L4f
            r8.f26424c = r12
            goto L8b
        L4f:
            long r13 = r8.f26425d
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r22 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r22 == 0) goto L8b
            boolean r13 = r8.f26424c
            if (r13 == 0) goto L77
            w5.e$a r13 = r8.f26423b
            long r11 = r13.f26430d
            r22 = 0
            int r24 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r24 != 0) goto L6a
            r11 = 0
            goto L75
        L6a:
            boolean[] r13 = r13.f26433g
            long r11 = r11 - r19
            r19 = 15
            long r11 = r11 % r19
            int r12 = (int) r11
            boolean r11 = r13[r12]
        L75:
            if (r11 == 0) goto L83
        L77:
            w5.e$a r11 = r8.f26423b
            r11.m13844c()
            w5.e$a r11 = r8.f26423b
            long r12 = r8.f26425d
            r11.m13843b(r12)
        L83:
            r11 = 1
            r8.f26424c = r11
            w5.e$a r11 = r8.f26423b
            r11.m13843b(r9)
        L8b:
            boolean r11 = r8.f26424c
            if (r11 == 0) goto La2
            w5.e$a r11 = r8.f26423b
            boolean r11 = r11.m13842a()
            if (r11 == 0) goto La2
            w5.e$a r11 = r8.f26422a
            w5.e$a r12 = r8.f26423b
            r8.f26422a = r12
            r8.f26423b = r11
            r11 = 0
            r8.f26424c = r11
        La2:
            r8.f26425d = r9
            w5.e$a r9 = r8.f26422a
            boolean r9 = r9.m13842a()
            if (r9 == 0) goto Lae
            r9 = 0
            goto Lb2
        Lae:
            int r9 = r8.f26426e
            r10 = 1
            int r9 = r9 + r10
        Lb2:
            r8.f26426e = r9
            r7.m13876c()
            r0.f26464Y1 = r5
        Lb9:
            long r7 = r0.f27096z1
            long r9 = r5 - r7
            if (r39 == 0) goto Lc6
            if (r40 != 0) goto Lc6
            r0.m13864V0(r3, r4)
            r1 = 1
            return r1
        Lc6:
            float r11 = r0.f27032E0
            double r11 = (double) r11
            int r13 = r0.f8951c0
            r14 = 2
            if (r13 != r14) goto Ld0
            r13 = 1
            goto Ld1
        Ld0:
            r13 = 0
        Ld1:
            long r22 = android.os.SystemClock.elapsedRealtime()
            long r22 = r22 * r15
            long r5 = r5 - r1
            double r5 = (double) r5
            double r5 = r5 / r11
            long r5 = (long) r5
            if (r13 == 0) goto Le0
            long r11 = r22 - r30
            long r5 = r5 - r11
        Le0:
            android.view.Surface r11 = r0.f26451L1
            w5.d r12 = r0.f26452M1
            if (r11 != r12) goto Lf6
            boolean r1 = m13850K0(r5)
            if (r1 == 0) goto Lf4
            r0.m13864V0(r3, r4)
            r0.m13867X0(r5)
            r1 = 1
            return r1
        Lf4:
            r1 = 0
            return r1
        Lf6:
            long r11 = r0.f26465Z1
            long r22 = r22 - r11
            boolean r11 = r0.f26457R1
            if (r11 != 0) goto L105
            if (r13 != 0) goto L109
            boolean r11 = r0.f26456Q1
            if (r11 == 0) goto L10b
            goto L109
        L105:
            boolean r11 = r0.f26455P1
            if (r11 != 0) goto L10b
        L109:
            r11 = 1
            goto L10c
        L10b:
            r11 = 0
        L10c:
            long r14 = r0.f26459T1
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 != 0) goto L133
            int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r12 < 0) goto L133
            if (r11 != 0) goto L131
            if (r13 == 0) goto L133
            boolean r7 = m13850K0(r5)
            if (r7 == 0) goto L12e
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r11 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r11 <= 0) goto L12e
            r7 = 1
            goto L12f
        L12e:
            r7 = 0
        L12f:
            if (r7 == 0) goto L133
        L131:
            r7 = 1
            goto L134
        L133:
            r7 = 0
        L134:
            r8 = 21
            if (r7 == 0) goto L157
            long r1 = java.lang.System.nanoTime()
            r35 = r27
            r36 = r9
            r38 = r1
            r40 = r41
            r35.m13857O0(r36, r38, r40)
            int r7 = p371v5.C6552b0.f25624a
            if (r7 < r8) goto L14f
            r0.m13861S0(r3, r4, r1)
            goto L152
        L14f:
            r0.m13860R0(r3, r4)
        L152:
            r0.m13867X0(r5)
            r1 = 1
            return r1
        L157:
            if (r13 == 0) goto L2eb
            long r11 = r0.f26458S1
            int r7 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r7 != 0) goto L161
            goto L2eb
        L161:
            long r11 = java.lang.System.nanoTime()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r13
            long r5 = r5 + r11
            w5.j r7 = r0.f26443D1
            long r13 = r7.f26497p
            r15 = -1
            int r20 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r20 == 0) goto L1c9
            w5.e r13 = r7.f26482a
            boolean r13 = r13.m13841a()
            if (r13 == 0) goto L1c9
            w5.e r13 = r7.f26482a
            boolean r14 = r13.m13841a()
            if (r14 == 0) goto L19b
            w5.e$a r13 = r13.f26422a
            long r14 = r13.f26431e
            r20 = 0
            int r16 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r16 != 0) goto L195
            r25 = r9
            r8 = r20
            r20 = r25
            goto L1a2
        L195:
            r20 = r9
            long r8 = r13.f26432f
            long r8 = r8 / r14
            goto L1a2
        L19b:
            r20 = r9
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1a2:
            long r13 = r7.f26498q
            long r3 = r7.f26494m
            long r1 = r7.f26497p
            long r3 = r3 - r1
            long r3 = r3 * r8
            float r1 = (float) r3
            float r2 = r7.f26490i
            float r1 = r1 / r2
            long r1 = (long) r1
            long r13 = r13 + r1
            long r1 = r5 - r13
            long r1 = java.lang.Math.abs(r1)
            r3 = 20000000(0x1312d00, double:9.881313E-317)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L1c0
            r1 = 1
            goto L1c1
        L1c0:
            r1 = 0
        L1c1:
            if (r1 == 0) goto L1c5
            r5 = r13
            goto L1cb
        L1c5:
            r7.m13875b()
            goto L1cb
        L1c9:
            r20 = r9
        L1cb:
            long r1 = r7.f26494m
            r7.f26495n = r1
            r7.f26496o = r5
            w5.j$e r1 = r7.f26484c
            if (r1 == 0) goto L207
            long r2 = r7.f26492k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L1e1
            goto L207
        L1e1:
            long r1 = r1.f26503Y
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L1e8
            goto L207
        L1e8:
            long r3 = r7.f26492k
            long r8 = r5 - r1
            long r8 = r8 / r3
            long r8 = r8 * r3
            long r8 = r8 + r1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 > 0) goto L1f7
            long r1 = r8 - r3
            goto L1fa
        L1f7:
            long r3 = r3 + r8
            r1 = r8
            r8 = r3
        L1fa:
            long r3 = r8 - r5
            long r5 = r5 - r1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L202
            goto L203
        L202:
            r8 = r1
        L203:
            long r1 = r7.f26493l
            long r8 = r8 - r1
            r5 = r8
        L207:
            long r1 = r5 - r11
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r0.f26459T1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L219
            r3 = 1
            goto L21a
        L219:
            r3 = 0
        L21a:
            r7 = -500000(0xfffffffffff85ee0, double:NaN)
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 >= 0) goto L223
            r4 = 1
            goto L224
        L223:
            r4 = 0
        L224:
            if (r4 == 0) goto L22a
            if (r40 != 0) goto L22a
            r4 = 1
            goto L22b
        L22a:
            r4 = 0
        L22b:
            if (r4 == 0) goto L262
            g5.c0 r4 = r0.f8952d0
            java.util.Objects.requireNonNull(r4)
            long r7 = r0.f8954f0
            long r7 = r28 - r7
            int r4 = r4.mo5967c(r7)
            if (r4 != 0) goto L23e
            r4 = 0
            goto L25e
        L23e:
            i4.e r7 = r0.f27092x1
            int r8 = r7.f12354i
            r9 = 1
            int r8 = r8 + r9
            r7.f12354i = r8
            int r8 = r0.f26463X1
            int r8 = r8 + r4
            if (r3 == 0) goto L251
            int r4 = r7.f12351f
            int r4 = r4 + r8
            r7.f12351f = r4
            goto L254
        L251:
            r0.m13866W0(r8)
        L254:
            boolean r4 = r27.m14081U()
            if (r4 == 0) goto L25d
            r27.m14085d0()
        L25d:
            r4 = 1
        L25e:
            if (r4 == 0) goto L262
            r4 = 0
            return r4
        L262:
            boolean r4 = m13850K0(r1)
            if (r4 == 0) goto L26c
            if (r40 != 0) goto L26c
            r4 = 1
            goto L26d
        L26c:
            r4 = 0
        L26d:
            if (r4 == 0) goto L292
            if (r3 == 0) goto L27a
            r3 = r32
            r4 = r34
            r0.m13864V0(r3, r4)
            r3 = 1
            goto L28e
        L27a:
            r3 = r32
            r4 = r34
            java.lang.String r5 = "dropVideoBuffer"
            p371v5.C6549a.m13287a(r5)
            r5 = 0
            r3.mo14033c(r4, r5)
            p371v5.C6549a.m13293g()
            r3 = 1
            r0.m13866W0(r3)
        L28e:
            r0.m13867X0(r1)
            return r3
        L292:
            r3 = r32
            r4 = r34
            int r7 = p371v5.C6552b0.f25624a
            r8 = 21
            if (r7 < r8) goto L2b6
            r7 = 50000(0xc350, double:2.47033E-319)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2e9
            r35 = r27
            r36 = r20
            r38 = r5
            r40 = r41
            r35.m13857O0(r36, r38, r40)
            r0.m13861S0(r3, r4, r5)
            r0.m13867X0(r1)
            r1 = 1
            return r1
        L2b6:
            r7 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2e9
            r7 = 11000(0x2af8, double:5.4347E-320)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2d6
            r7 = 10000(0x2710, double:4.9407E-320)
            long r7 = r1 - r7
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L2cd
            goto L2d6
        L2cd:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L2d6:
            r35 = r27
            r36 = r20
            r38 = r5
            r40 = r41
            r35.m13857O0(r36, r38, r40)
            r0.m13860R0(r3, r4)
            r0.m13867X0(r1)
            r1 = 1
            return r1
        L2e9:
            r1 = 0
            return r1
        L2eb:
            r1 = 0
            return r1
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: s0 */
    public void mo13870s0() {
            r1 = this;
            super.mo13870s0()
            r0 = 0
            r1.f26463X1 = r0
            return
    }

    @Override // p406x4.AbstractC6940n
    /* renamed from: y0 */
    public boolean mo13871y0(p406x4.C6939m r2) {
            r1 = this;
            android.view.Surface r0 = r1.f26451L1
            if (r0 != 0) goto Ld
            boolean r2 = r1.m13863U0(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // p406x4.AbstractC6940n, p088f4.AbstractC2008g, p088f4.InterfaceC2004e1
    /* renamed from: z */
    public void mo5214z(float r1, float r2) {
            r0 = this;
            r0.f27032E0 = r1
            r0.f27033F0 = r2
            f4.e0 r2 = r0.f27035H0
            r0.m14071B0(r2)
            w5.j r2 = r0.f26443D1
            r2.f26490i = r1
            r2.m13875b()
            r1 = 0
            r2.m13877d(r1)
            return
    }
}
