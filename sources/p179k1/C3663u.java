package p179k1;

/* renamed from: k1.u */
/* loaded from: classes.dex */
public class C3663u implements p243o1.InterfaceC4874d {

    /* renamed from: Y */
    public final /* synthetic */ int f16185Y;

    /* renamed from: Z */
    public java.util.List<java.lang.Object> f16186Z;

    public C3663u(android.database.sqlite.SQLiteProgram r2) {
            r1 = this;
            r0 = 1
            r1.f16185Y = r0
            r1.<init>()
            r1.f16186Z = r2
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: B */
    public void mo8103B(int r2) {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            r0 = 0
            r1.m8106a(r2, r0)
            return
        Lb:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindNull(r2)
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: D */
    public void mo8104D(int r2, double r3) {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.m8106a(r2, r3)
            return
        Le:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindDouble(r2, r3)
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: X */
    public void mo8105X(int r2, long r3) {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.m8106a(r2, r3)
            return
        Le:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindLong(r2, r3)
            return
    }

    /* renamed from: a */
    public void m8106a(int r4, java.lang.Object r5) {
            r3 = this;
            int r4 = r4 + (-1)
            java.util.List<java.lang.Object> r0 = r3.f16186Z
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r4 < r0) goto L21
            java.util.List<java.lang.Object> r0 = r3.f16186Z
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
        L14:
            if (r0 > r4) goto L21
            java.util.List<java.lang.Object> r1 = r3.f16186Z
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L14
        L21:
            java.util.List<java.lang.Object> r0 = r3.f16186Z
            java.util.List r0 = (java.util.List) r0
            r0.set(r4, r5)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L7
        L6:
            return
        L7:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.close()
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: g0 */
    public void mo8107g0(int r2, byte[] r3) {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r1.m8106a(r2, r3)
            return
        La:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindBlob(r2, r3)
            return
    }

    @Override // p243o1.InterfaceC4874d
    /* renamed from: u */
    public void mo8108u(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r1.f16185Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r1.m8106a(r2, r3)
            return
        La:
            java.util.List<java.lang.Object> r0 = r1.f16186Z
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindString(r2, r3)
            return
    }
}
