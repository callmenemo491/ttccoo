package p255od;

/* renamed from: od.a0 */
/* loaded from: classes.dex */
public enum EnumC5192a0 extends java.lang.Enum<p255od.EnumC5192a0> {
    private static final /* synthetic */ p255od.EnumC5192a0[] $VALUES = null;

    @p189kb.InterfaceC4079b("Caponium")
    public static final p255od.EnumC5192a0 CAPONIUM = null;

    @p189kb.InterfaceC4079b("Enefterium")
    public static final p255od.EnumC5192a0 ENEFTERIUM = null;

    @p189kb.InterfaceC4079b("Waxon")
    public static final p255od.EnumC5192a0 WAXON = null;

    @p189kb.InterfaceC4079b("Wecanite")
    public static final p255od.EnumC5192a0 WECANITE = null;
    private final java.lang.String value;

    private static final /* synthetic */ p255od.EnumC5192a0[] $values() {
            r0 = 4
            od.a0[] r0 = new p255od.EnumC5192a0[r0]
            od.a0 r1 = p255od.EnumC5192a0.CAPONIUM
            r2 = 0
            r0[r2] = r1
            od.a0 r1 = p255od.EnumC5192a0.ENEFTERIUM
            r2 = 1
            r0[r2] = r1
            od.a0 r1 = p255od.EnumC5192a0.WAXON
            r2 = 2
            r0[r2] = r1
            od.a0 r1 = p255od.EnumC5192a0.WECANITE
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            od.a0 r0 = new od.a0
            java.lang.String r1 = "CAPONIUM"
            r2 = 0
            java.lang.String r3 = "Caponium"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5192a0.CAPONIUM = r0
            od.a0 r0 = new od.a0
            java.lang.String r1 = "ENEFTERIUM"
            r2 = 1
            java.lang.String r3 = "Enefterium"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5192a0.ENEFTERIUM = r0
            od.a0 r0 = new od.a0
            java.lang.String r1 = "WAXON"
            r2 = 2
            java.lang.String r3 = "Waxon"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5192a0.WAXON = r0
            od.a0 r0 = new od.a0
            java.lang.String r1 = "WECANITE"
            r2 = 3
            java.lang.String r3 = "Wecanite"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5192a0.WECANITE = r0
            od.a0[] r0 = $values()
            p255od.EnumC5192a0.$VALUES = r0
            return
    }

    EnumC5192a0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static p255od.EnumC5192a0 valueOf(java.lang.String r1) {
            java.lang.Class<od.a0> r0 = p255od.EnumC5192a0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            od.a0 r1 = (p255od.EnumC5192a0) r1
            return r1
    }

    public static p255od.EnumC5192a0[] values() {
            od.a0[] r0 = p255od.EnumC5192a0.$VALUES
            java.lang.Object r0 = r0.clone()
            od.a0[] r0 = (p255od.EnumC5192a0[]) r0
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
