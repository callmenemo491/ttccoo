package p021b4;

/* renamed from: b4.p */
/* loaded from: classes.dex */
public final class C0679p extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: a0 */
    public static final java.util.List<p021b4.C0679p.a> f3854a0 = null;

    /* renamed from: Y */
    public final int f3855Y;

    /* renamed from: Z */
    public boolean f3856Z;

    /* renamed from: b4.p$a */
    public interface a {
        /* renamed from: a */
        void mo2240a(android.database.sqlite.SQLiteDatabase r1);
    }

    static {
            b4.l r0 = p021b4.C0675l.f3850a
            b4.m r1 = p021b4.C0676m.f3851a
            b4.n r2 = p021b4.C0677n.f3852a
            b4.o r3 = p021b4.C0678o.f3853a
            r4 = 4
            b4.p$a[] r4 = new p021b4.C0679p.a[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.List r0 = java.util.Arrays.asList(r4)
            p021b4.C0679p.f3854a0 = r0
            return
    }

    public C0679p(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            r2 = 0
            r1.f3856Z = r2
            r1.f3855Y = r4
            return
    }

    /* renamed from: a */
    public final void m2241a(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
            r4 = this;
            java.util.List<b4.p$a> r0 = p021b4.C0679p.f3854a0
            int r1 = r0.size()
            if (r7 > r1) goto L19
        L8:
            if (r6 >= r7) goto L18
            java.util.List<b4.p$a> r0 = p021b4.C0679p.f3854a0
            java.lang.Object r0 = r0.get(r6)
            b4.p$a r0 = (p021b4.C0679p.a) r0
            r0.mo2240a(r5)
            int r6 = r6 + 1
            goto L8
        L18:
            return
        L19:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Migration from "
            java.lang.String r2 = " to "
            java.lang.String r3 = " was requested, but cannot be performed. Only "
            java.lang.StringBuilder r6 = androidx.recyclerview.widget.C0608s.m2117a(r1, r6, r2, r7, r3)
            int r7 = r0.size()
            r6.append(r7)
            java.lang.String r7 = " migrations are provided"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            r0 = 1
            r3.f3856Z = r0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "PRAGMA busy_timeout=0;"
            android.database.Cursor r1 = r4.rawQuery(r2, r1)
            r1.close()
            r4.setForeignKeyConstraintsEnabled(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            int r0 = r2.f3855Y
            boolean r1 = r2.f3856Z
            if (r1 != 0) goto L9
            r2.onConfigure(r3)
        L9:
            r1 = 0
            r2.m2241a(r3, r1, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE events"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE event_metadata"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE transport_contexts"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r2)
            boolean r2 = r0.f3856Z
            if (r2 != 0) goto L1b
            r0.onConfigure(r1)
        L1b:
            r2 = 0
            r0.m2241a(r1, r2, r3)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            boolean r0 = r1.f3856Z
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f3856Z
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            r1.m2241a(r2, r3, r4)
            return
    }
}
