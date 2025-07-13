package p255od;

/* renamed from: od.i */
/* loaded from: classes.dex */
public final class C5207i {
    private static final java.lang.String STRING_ZERO = "000000000000";

    public static final boolean isSHING(p255od.C5194b0 r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = r2.getContract()
            java.lang.String r1 = "t.taco"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.String r2 = r2.getCurrency()
            java.lang.String r0 = "SHING"
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }

    public static final boolean isSimpleassets(p255od.C5194b0 r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r1 = r1.getContract()
            java.lang.String r0 = "simpleassets"
            boolean r1 = p214m2.C4339q.m9702c(r1, r0)
            return r1
    }

    public static final boolean isTACO(p255od.C5194b0 r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = r2.getContract()
            java.lang.String r1 = "t.taco"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.String r2 = r2.getCurrency()
            java.lang.String r0 = "TACO"
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }

    public static final boolean isWAX(p255od.C5194b0 r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = r2.getContract()
            java.lang.String r1 = "eosio.token"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.String r2 = r2.getCurrency()
            java.lang.String r0 = "WAX"
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }
}
