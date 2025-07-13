package p300r0;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public abstract class AbstractC5760c extends p300r0.AbstractC5758a {

    /* renamed from: g0 */
    public int f22178g0;

    /* renamed from: h0 */
    public int f22179h0;

    /* renamed from: i0 */
    public android.view.LayoutInflater f22180i0;

    @java.lang.Deprecated
    public AbstractC5760c(android.content.Context r1, int r2, android.database.Cursor r3, boolean r4) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r3, r4)
            r0.f22179h0 = r2
            r0.f22178g0 = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.f22180i0 = r1
            return
    }
}
