package p265p1;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public class C5342a implements p243o1.InterfaceC4871a {

    /* renamed from: Z */
    public static final java.lang.String[] f21239Z = null;

    /* renamed from: Y */
    public final android.database.sqlite.SQLiteDatabase f21240Y;

    /* renamed from: p1.a$a */
    public class a implements android.database.sqlite.SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ p243o1.InterfaceC4875e f21241a;

        public a(p265p1.C5342a r1, p243o1.InterfaceC4875e r2) {
                r0 = this;
                r0.f21241a = r2
                r0.<init>()
                return
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase r2, android.database.sqlite.SQLiteCursorDriver r3, java.lang.String r4, android.database.sqlite.SQLiteQuery r5) {
                r1 = this;
                o1.e r2 = r1.f21241a
                k1.u r0 = new k1.u
                r0.<init>(r5)
                r2.mo818i(r0)
                android.database.sqlite.SQLiteCursor r2 = new android.database.sqlite.SQLiteCursor
                r2.<init>(r3, r4, r5)
                return r2
        }
    }

    /* renamed from: p1.a$b */
    public class b implements android.database.sqlite.SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ p243o1.InterfaceC4875e f21242a;

        public b(p265p1.C5342a r1, p243o1.InterfaceC4875e r2) {
                r0 = this;
                r0.f21242a = r2
                r0.<init>()
                return
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase r2, android.database.sqlite.SQLiteCursorDriver r3, java.lang.String r4, android.database.sqlite.SQLiteQuery r5) {
                r1 = this;
                o1.e r2 = r1.f21242a
                k1.u r0 = new k1.u
                r0.<init>(r5)
                r2.mo818i(r0)
                android.database.sqlite.SQLiteCursor r2 = new android.database.sqlite.SQLiteCursor
                r2.<init>(r3, r4, r5)
                return r2
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            p265p1.C5342a.f21239Z = r0
            return
    }

    public C5342a(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.f21240Y = r1
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: J */
    public java.lang.String mo11006J() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: M */
    public boolean mo11007M() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: T */
    public android.database.Cursor mo11008T(p243o1.InterfaceC4875e r7, android.os.CancellationSignal r8) {
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.f21240Y
            java.lang.String r2 = r7.mo817h()
            java.lang.String[] r3 = p265p1.C5342a.f21239Z
            p1.a$b r1 = new p1.a$b
            r1.<init>(r6, r7)
            r4 = 0
            r5 = r8
            android.database.Cursor r7 = r0.rawQueryWithFactory(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: U */
    public boolean mo11009U() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            boolean r0 = r0.isWriteAheadLoggingEnabled()
            return r0
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: Y */
    public void mo11010Y() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.setTransactionSuccessful()
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: c0 */
    public void mo11011c0() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.beginTransactionNonExclusive()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.close()
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: e0 */
    public android.database.Cursor mo11012e0(p243o1.InterfaceC4875e r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.f21240Y
            p1.a$a r1 = new p1.a$a
            r1.<init>(r4, r5)
            java.lang.String r5 = r5.mo817h()
            java.lang.String[] r2 = p265p1.C5342a.f21239Z
            r3 = 0
            android.database.Cursor r5 = r0.rawQueryWithFactory(r1, r5, r2, r3)
            return r5
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: f */
    public void mo11013f() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.endTransaction()
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: g */
    public void mo11014g() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.beginTransaction()
            return
    }

    @Override // p243o1.InterfaceC4871a
    public boolean isOpen() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: p */
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mo11015p() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            java.util.List r0 = r0.getAttachedDbs()
            return r0
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: r */
    public void mo11016r(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.setVersion(r2)
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: r0 */
    public android.database.Cursor mo11017r0(java.lang.String r2) {
            r1 = this;
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r0.<init>(r2)
            android.database.Cursor r2 = r1.mo11012e0(r0)
            return r2
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: s */
    public void mo11018s(java.lang.String r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f21240Y
            r0.execSQL(r2)
            return
    }

    @Override // p243o1.InterfaceC4871a
    /* renamed from: y */
    public p243o1.InterfaceC4876f mo11019y(java.lang.String r3) {
            r2 = this;
            p1.d r0 = new p1.d
            android.database.sqlite.SQLiteDatabase r1 = r2.f21240Y
            android.database.sqlite.SQLiteStatement r3 = r1.compileStatement(r3)
            r0.<init>(r3)
            return r0
    }
}
