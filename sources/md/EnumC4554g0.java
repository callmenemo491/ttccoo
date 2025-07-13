package md;

/* renamed from: md.g0 */
/* loaded from: classes.dex */
public enum EnumC4554g0 extends java.lang.Enum<md.EnumC4554g0> {
    private static final /* synthetic */ md.EnumC4554g0[] $VALUES = null;
    public static final md.EnumC4554g0 ABUNDANT = null;
    public static final md.EnumC4554g0 COMMON = null;
    public static final md.EnumC4554g0.a Companion = null;
    public static final md.EnumC4554g0 ECOLOGICAL = null;
    public static final md.EnumC4554g0 IMMORTAL = null;
    public static final md.EnumC4554g0 LEGENDARY = null;
    public static final md.EnumC4554g0 MYTHICAL = null;
    public static final md.EnumC4554g0 ORGANIC = null;
    public static final md.EnumC4554g0 RARE = null;
    public static final md.EnumC4554g0 ULTRARARE = null;
    public static final md.EnumC4554g0 UNCOMMON = null;

    /* renamed from: md.g0$a */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final md.EnumC4554g0 findByKey(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "string"
                p214m2.C4339q.m9706k(r7, r0)
                md.g0[] r0 = md.EnumC4554g0.values()
                int r1 = r0.length
                r2 = 0
            Lb:
                if (r2 >= r1) goto L1e
                r3 = r0[r2]
                java.lang.String r4 = r3.getKey()
                r5 = 1
                boolean r4 = p362uh.C6463i.m13053J(r4, r7, r5)
                if (r4 == 0) goto L1b
                goto L1f
            L1b:
                int r2 = r2 + 1
                goto Lb
            L1e:
                r3 = 0
            L1f:
                return r3
        }
    }

    /* renamed from: md.g0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                md.g0[] r0 = md.EnumC4554g0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                md.g0 r1 = md.EnumC4554g0.ABUNDANT
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.COMMON
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.UNCOMMON
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.ECOLOGICAL
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.ORGANIC
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.RARE
                int r1 = r1.ordinal()
                r2 = 6
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.ULTRARARE
                int r1 = r1.ordinal()
                r2 = 7
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.LEGENDARY
                int r1 = r1.ordinal()
                r2 = 8
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.MYTHICAL
                int r1 = r1.ordinal()
                r2 = 9
                r0[r1] = r2
                md.g0 r1 = md.EnumC4554g0.IMMORTAL
                int r1 = r1.ordinal()
                r2 = 10
                r0[r1] = r2
                md.EnumC4554g0.b.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ md.EnumC4554g0[] $values() {
            r0 = 10
            md.g0[] r0 = new md.EnumC4554g0[r0]
            md.g0 r1 = md.EnumC4554g0.ABUNDANT
            r2 = 0
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.COMMON
            r2 = 1
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.UNCOMMON
            r2 = 2
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.ECOLOGICAL
            r2 = 3
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.ORGANIC
            r2 = 4
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.RARE
            r2 = 5
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.ULTRARARE
            r2 = 6
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.LEGENDARY
            r2 = 7
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.MYTHICAL
            r2 = 8
            r0[r2] = r1
            md.g0 r1 = md.EnumC4554g0.IMMORTAL
            r2 = 9
            r0[r2] = r1
            return r0
    }

    static {
            md.g0 r0 = new md.g0
            java.lang.String r1 = "ABUNDANT"
            r2 = 0
            r0.<init>(r1, r2)
            md.EnumC4554g0.ABUNDANT = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "COMMON"
            r2 = 1
            r0.<init>(r1, r2)
            md.EnumC4554g0.COMMON = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "UNCOMMON"
            r2 = 2
            r0.<init>(r1, r2)
            md.EnumC4554g0.UNCOMMON = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "ECOLOGICAL"
            r2 = 3
            r0.<init>(r1, r2)
            md.EnumC4554g0.ECOLOGICAL = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "ORGANIC"
            r2 = 4
            r0.<init>(r1, r2)
            md.EnumC4554g0.ORGANIC = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "RARE"
            r2 = 5
            r0.<init>(r1, r2)
            md.EnumC4554g0.RARE = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "ULTRARARE"
            r2 = 6
            r0.<init>(r1, r2)
            md.EnumC4554g0.ULTRARARE = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "LEGENDARY"
            r2 = 7
            r0.<init>(r1, r2)
            md.EnumC4554g0.LEGENDARY = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "MYTHICAL"
            r2 = 8
            r0.<init>(r1, r2)
            md.EnumC4554g0.MYTHICAL = r0
            md.g0 r0 = new md.g0
            java.lang.String r1 = "IMMORTAL"
            r2 = 9
            r0.<init>(r1, r2)
            md.EnumC4554g0.IMMORTAL = r0
            md.g0[] r0 = $values()
            md.EnumC4554g0.$VALUES = r0
            md.g0$a r0 = new md.g0$a
            r1 = 0
            r0.<init>(r1)
            md.EnumC4554g0.Companion = r0
            return
    }

    EnumC4554g0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static md.EnumC4554g0 valueOf(java.lang.String r1) {
            java.lang.Class<md.g0> r0 = md.EnumC4554g0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            md.g0 r1 = (md.EnumC4554g0) r1
            return r1
    }

    public static md.EnumC4554g0[] values() {
            md.g0[] r0 = md.EnumC4554g0.$VALUES
            java.lang.Object r0 = r0.clone()
            md.g0[] r0 = (md.EnumC4554g0[]) r0
            return r0
    }

    public final java.lang.String getKey() {
            r2 = this;
            int[] r0 = md.EnumC4554g0.b.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L2a;
                case 3: goto L27;
                case 4: goto L24;
                case 5: goto L21;
                case 6: goto L1e;
                case 7: goto L1b;
                case 8: goto L18;
                case 9: goto L15;
                case 10: goto L12;
                default: goto Lb;
            }
        Lb:
            e7.y7 r0 = new e7.y7
            r1 = 2
            r0.<init>(r1)
            throw r0
        L12:
            java.lang.String r0 = "Immortal"
            goto L2f
        L15:
            java.lang.String r0 = "Mythical"
            goto L2f
        L18:
            java.lang.String r0 = "Legendary"
            goto L2f
        L1b:
            java.lang.String r0 = "Ultra Rare"
            goto L2f
        L1e:
            java.lang.String r0 = "Rare"
            goto L2f
        L21:
            java.lang.String r0 = "Organic"
            goto L2f
        L24:
            java.lang.String r0 = "Ecological"
            goto L2f
        L27:
            java.lang.String r0 = "Uncommon"
            goto L2f
        L2a:
            java.lang.String r0 = "Common"
            goto L2f
        L2d:
            java.lang.String r0 = "Abundant"
        L2f:
            return r0
    }

    public final double getValue() {
            r2 = this;
            int[] r0 = md.EnumC4554g0.b.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L48;
                case 2: goto L42;
                case 3: goto L3c;
                case 4: goto L36;
                case 5: goto L30;
                case 6: goto L2a;
                case 7: goto L24;
                case 8: goto L1e;
                case 9: goto L18;
                case 10: goto L12;
                default: goto Lb;
            }
        Lb:
            e7.y7 r0 = new e7.y7
            r1 = 2
            r0.<init>(r1)
            throw r0
        L12:
            r0 = 4635687011591095138(0x405544c6afc78362, double:85.07462687)
            goto L4a
        L18:
            r0 = 4630910970972131198(0x40444cfe1340cf7e, double:40.60150376)
            goto L4a
        L1e:
            r0 = 4627870829588250624(0x4039800000000000, double:25.5)
            goto L4a
        L24:
            r0 = 4624304209492854094(0x402cd42d8c2a454e, double:14.41441)
            goto L4a
        L2a:
            r0 = 4621614189340364159(0x4023459e6c898d7f, double:9.635974304)
            goto L4a
        L30:
            r0 = 4618775643027956334(0x40192ff9dbe8626e, double:6.296851574)
            goto L4a
        L36:
            r0 = 4616750620084247284(0x4011fe3a76af9af4, double:4.498269896)
            goto L4a
        L3c:
            r0 = 4611860133358093170(0x40009e5b4a984372, double:2.077322562)
            goto L4a
        L42:
            r0 = 4608546122277984076(0x3ff4d847f562174c, double:1.302803)
            goto L4a
        L48:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L4a:
            return r0
    }
}
