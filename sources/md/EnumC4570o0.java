package md;

/* renamed from: md.o0 */
/* loaded from: classes.dex */
public enum EnumC4570o0 extends java.lang.Enum<md.EnumC4570o0> {
    private static final /* synthetic */ md.EnumC4570o0[] $VALUES = null;
    public static final md.EnumC4570o0 COMMON = null;
    public static final md.EnumC4570o0.a Companion = null;
    public static final md.EnumC4570o0 ELEMENTS = null;
    public static final md.EnumC4570o0 RARE = null;
    public static final md.EnumC4570o0 ULTRARARE = null;

    /* renamed from: md.o0$a */
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

        public final md.EnumC4570o0 findByKey(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "string"
                p214m2.C4339q.m9706k(r7, r0)
                md.o0[] r0 = md.EnumC4570o0.values()
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

    /* renamed from: md.o0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                md.o0[] r0 = md.EnumC4570o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                md.o0 r1 = md.EnumC4570o0.COMMON
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                md.o0 r1 = md.EnumC4570o0.ELEMENTS
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                md.o0 r1 = md.EnumC4570o0.RARE
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                md.o0 r1 = md.EnumC4570o0.ULTRARARE
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                md.EnumC4570o0.b.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ md.EnumC4570o0[] $values() {
            r0 = 4
            md.o0[] r0 = new md.EnumC4570o0[r0]
            md.o0 r1 = md.EnumC4570o0.COMMON
            r2 = 0
            r0[r2] = r1
            md.o0 r1 = md.EnumC4570o0.ELEMENTS
            r2 = 1
            r0[r2] = r1
            md.o0 r1 = md.EnumC4570o0.RARE
            r2 = 2
            r0[r2] = r1
            md.o0 r1 = md.EnumC4570o0.ULTRARARE
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            md.o0 r0 = new md.o0
            java.lang.String r1 = "COMMON"
            r2 = 0
            r0.<init>(r1, r2)
            md.EnumC4570o0.COMMON = r0
            md.o0 r0 = new md.o0
            java.lang.String r1 = "ELEMENTS"
            r2 = 1
            r0.<init>(r1, r2)
            md.EnumC4570o0.ELEMENTS = r0
            md.o0 r0 = new md.o0
            java.lang.String r1 = "RARE"
            r2 = 2
            r0.<init>(r1, r2)
            md.EnumC4570o0.RARE = r0
            md.o0 r0 = new md.o0
            java.lang.String r1 = "ULTRARARE"
            r2 = 3
            r0.<init>(r1, r2)
            md.EnumC4570o0.ULTRARARE = r0
            md.o0[] r0 = $values()
            md.EnumC4570o0.$VALUES = r0
            md.o0$a r0 = new md.o0$a
            r1 = 0
            r0.<init>(r1)
            md.EnumC4570o0.Companion = r0
            return
    }

    EnumC4570o0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static md.EnumC4570o0 valueOf(java.lang.String r1) {
            java.lang.Class<md.o0> r0 = md.EnumC4570o0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            md.o0 r1 = (md.EnumC4570o0) r1
            return r1
    }

    public static md.EnumC4570o0[] values() {
            md.o0[] r0 = md.EnumC4570o0.$VALUES
            java.lang.Object r0 = r0.clone()
            md.o0[] r0 = (md.EnumC4570o0[]) r0
            return r0
    }

    public final java.lang.String getKey() {
            r3 = this;
            int[] r0 = md.EnumC4570o0.b.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 2
            if (r0 == r1) goto L20
            r2 = 3
            if (r0 == r2) goto L1d
            r2 = 4
            if (r0 != r2) goto L17
            java.lang.String r0 = "Ultra Rare"
            goto L25
        L17:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L1d:
            java.lang.String r0 = "Rare"
            goto L25
        L20:
            java.lang.String r0 = "Elements"
            goto L25
        L23:
            java.lang.String r0 = "Common"
        L25:
            return r0
    }

    public final double getValue() {
            r3 = this;
            int[] r0 = md.EnumC4570o0.b.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L26
            r2 = 3
            if (r0 == r2) goto L20
            r2 = 4
            if (r0 != r2) goto L1a
            r0 = 4658195320699894104(0x40a53bf6c8b43958, double:2717.982)
            goto L31
        L1a:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L20:
            r0 = 4626807698601214476(0x4035b916872b020c, double:21.723)
            goto L31
        L26:
            r0 = 4627140683498663182(0x4036e7ef9db22d0e, double:22.906)
            goto L31
        L2c:
            r0 = 4622635395021432422(0x4026e66666666666, double:11.45)
        L31:
            return r0
    }
}
