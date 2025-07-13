package p243o1;

/* renamed from: o1.c */
/* loaded from: classes.dex */
public interface InterfaceC4873c extends java.io.Closeable {

    /* renamed from: o1.c$a */
    public static abstract class a {

        /* renamed from: a */
        public final int f19356a;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.f19356a = r1
                return
        }

        /* renamed from: a */
        public final void m11021a(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = ":memory:"
                boolean r0 = r3.equalsIgnoreCase(r0)
                if (r0 != 0) goto L38
                java.lang.String r0 = r3.trim()
                int r0 = r0.length()
                if (r0 != 0) goto L13
                goto L38
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "deleting the database file: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.w(r1, r0)
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L32
                r0.<init>(r3)     // Catch: java.lang.Exception -> L32
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L32
                goto L38
            L32:
                r3 = move-exception
                java.lang.String r0 = "delete failed: "
                android.util.Log.w(r1, r0, r3)
            L38:
                return
        }

        /* renamed from: b */
        public abstract void mo8119b(p243o1.InterfaceC4871a r1);

        /* renamed from: c */
        public abstract void mo8120c(p243o1.InterfaceC4871a r1);

        /* renamed from: d */
        public abstract void mo8121d(p243o1.InterfaceC4871a r1, int r2, int r3);

        /* renamed from: e */
        public abstract void mo8122e(p243o1.InterfaceC4871a r1);

        /* renamed from: f */
        public abstract void mo8123f(p243o1.InterfaceC4871a r1, int r2, int r3);
    }

    /* renamed from: o1.c$b */
    public interface b {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    /* renamed from: o0 */
    p243o1.InterfaceC4871a mo8083o0();

    void setWriteAheadLoggingEnabled(boolean r1);
}
