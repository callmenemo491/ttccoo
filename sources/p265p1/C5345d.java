package p265p1;

/* renamed from: p1.d */
/* loaded from: classes.dex */
public class C5345d extends p179k1.C3663u implements p243o1.InterfaceC4876f {

    /* renamed from: a0 */
    public final android.database.sqlite.SQLiteStatement f21255a0;

    public C5345d(android.database.sqlite.SQLiteStatement r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f21255a0 = r1
            return
    }

    @Override // p243o1.InterfaceC4876f
    /* renamed from: q0 */
    public long mo11022q0() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.f21255a0
            long r0 = r0.executeInsert()
            return r0
    }

    @Override // p243o1.InterfaceC4876f
    /* renamed from: x */
    public int mo11023x() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.f21255a0
            int r0 = r0.executeUpdateDelete()
            return r0
    }
}
