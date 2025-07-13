package p255od;

/* renamed from: od.f0 */
/* loaded from: classes.dex */
public enum EnumC5202f0 extends java.lang.Enum<p255od.EnumC5202f0> {
    private static final /* synthetic */ p255od.EnumC5202f0[] $VALUES = null;

    @p189kb.InterfaceC4079b("common")
    public static final p255od.EnumC5202f0 COMMON = null;

    @p189kb.InterfaceC4079b("epic")
    public static final p255od.EnumC5202f0 EPIC = null;

    @p189kb.InterfaceC4079b("rare")
    public static final p255od.EnumC5202f0 RARE = null;

    @p189kb.InterfaceC4079b("uncommon")
    public static final p255od.EnumC5202f0 UNCOMMON = null;
    private final java.lang.String value;

    /* renamed from: od.f0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                od.f0[] r0 = p255od.EnumC5202f0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                od.f0 r1 = p255od.EnumC5202f0.COMMON
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                od.f0 r1 = p255od.EnumC5202f0.UNCOMMON
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                od.f0 r1 = p255od.EnumC5202f0.RARE
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                od.f0 r1 = p255od.EnumC5202f0.EPIC
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                p255od.EnumC5202f0.a.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ p255od.EnumC5202f0[] $values() {
            r0 = 4
            od.f0[] r0 = new p255od.EnumC5202f0[r0]
            od.f0 r1 = p255od.EnumC5202f0.COMMON
            r2 = 0
            r0[r2] = r1
            od.f0 r1 = p255od.EnumC5202f0.UNCOMMON
            r2 = 1
            r0[r2] = r1
            od.f0 r1 = p255od.EnumC5202f0.RARE
            r2 = 2
            r0[r2] = r1
            od.f0 r1 = p255od.EnumC5202f0.EPIC
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            od.f0 r0 = new od.f0
            java.lang.String r1 = "COMMON"
            r2 = 0
            java.lang.String r3 = "common"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5202f0.COMMON = r0
            od.f0 r0 = new od.f0
            java.lang.String r1 = "UNCOMMON"
            r2 = 1
            java.lang.String r3 = "uncommon"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5202f0.UNCOMMON = r0
            od.f0 r0 = new od.f0
            java.lang.String r1 = "RARE"
            r2 = 2
            java.lang.String r3 = "rare"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5202f0.RARE = r0
            od.f0 r0 = new od.f0
            java.lang.String r1 = "EPIC"
            r2 = 3
            java.lang.String r3 = "epic"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5202f0.EPIC = r0
            od.f0[] r0 = $values()
            p255od.EnumC5202f0.$VALUES = r0
            return
    }

    EnumC5202f0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static p255od.EnumC5202f0 valueOf(java.lang.String r1) {
            java.lang.Class<od.f0> r0 = p255od.EnumC5202f0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            od.f0 r1 = (p255od.EnumC5202f0) r1
            return r1
    }

    public static p255od.EnumC5202f0[] values() {
            od.f0[] r0 = p255od.EnumC5202f0.$VALUES
            java.lang.Object r0 = r0.clone()
            od.f0[] r0 = (p255od.EnumC5202f0[]) r0
            return r0
    }

    public final int getTacoValue() {
            r3 = this;
            int[] r0 = p255od.EnumC5202f0.a.$EnumSwitchMapping$0
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
            r0 = 30
            goto L25
        L17:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L1d:
            r0 = 25
            goto L25
        L20:
            r0 = 20
            goto L25
        L23:
            r0 = 15
        L25:
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
