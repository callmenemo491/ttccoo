package p179k1;

/* renamed from: k1.w */
/* loaded from: classes.dex */
public class C3665w extends p243o1.InterfaceC4873c.a {

    /* renamed from: b */
    public p179k1.C3655m f16209b;

    /* renamed from: c */
    public final p179k1.C3665w.a f16210c;

    /* renamed from: k1.w$a */
    public static abstract class a {

        /* renamed from: a */
        public final int f16211a;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.f16211a = r1
                return
        }

        /* renamed from: a */
        public abstract p179k1.C3665w.b mo7719a(p243o1.InterfaceC4871a r1);
    }

    /* renamed from: k1.w$b */
    public static class b {

        /* renamed from: a */
        public final boolean f16212a;

        /* renamed from: b */
        public final java.lang.String f16213b;

        public b(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f16212a = r1
                r0.f16213b = r2
                return
        }
    }

    public C3665w(p179k1.C3655m r1, p179k1.C3665w.a r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            int r3 = r2.f16211a
            r0.<init>(r3)
            r0.f16209b = r1
            r0.f16210c = r2
            return
    }

    @Override // p243o1.InterfaceC4873c.a
    /* renamed from: b */
    public void mo8119b(p243o1.InterfaceC4871a r1) {
            r0 = this;
            return
    }

    @Override // p243o1.InterfaceC4873c.a
    /* renamed from: c */
    public void mo8120c(p243o1.InterfaceC4871a r6) {
            r5 = this;
            r0 = r6
            p1.a r0 = (p265p1.C5342a) r0
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            r1.<init>(r2)
            android.database.Cursor r0 = r0.mo11012e0(r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            if (r1 == 0) goto L1d
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.close()
            k1.w$a r0 = r5.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r0 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r0
            java.util.Objects.requireNonNull(r0)
            r0 = r6
            p1.a r0 = (p265p1.C5342a) r0
            android.database.sqlite.SQLiteDatabase r3 = r0.f21240Y
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `wallets` (`username` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`username`))"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r0.f21240Y
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `address` TEXT NOT NULL, `name` TEXT NOT NULL)"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r0.f21240Y
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r0 = r0.f21240Y
            java.lang.String r3 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '919611ef948b8ee4a59dd43ad6337e2d')"
            r0.execSQL(r3)
            if (r1 != 0) goto L69
            k1.w$a r0 = r5.f16210c
            k1.w$b r0 = r0.mo7719a(r6)
            boolean r1 = r0.f16212a
            if (r1 == 0) goto L54
            goto L69
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.f16213b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L69:
            r5.m8124g(r6)
            k1.w$a r6 = r5.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r6 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r6
            io.tacocrypto.app.database.AppDatabase_Impl r0 = r6.f14250b
            int r1 = io.tacocrypto.app.database.AppDatabase_Impl.f14247s
            java.util.List<k1.v$b> r0 = r0.f16193g
            if (r0 == 0) goto L8e
            int r0 = r0.size()
        L7c:
            if (r2 >= r0) goto L8e
            io.tacocrypto.app.database.AppDatabase_Impl r1 = r6.f14250b
            java.util.List<k1.v$b> r1 = r1.f16193g
            java.lang.Object r1 = r1.get(r2)
            k1.v$b r1 = (p179k1.AbstractC3664v.b) r1
            java.util.Objects.requireNonNull(r1)
            int r2 = r2 + 1
            goto L7c
        L8e:
            return
        L8f:
            r6 = move-exception
            r0.close()
            throw r6
    }

    @Override // p243o1.InterfaceC4873c.a
    /* renamed from: d */
    public void mo8121d(p243o1.InterfaceC4871a r1, int r2, int r3) {
            r0 = this;
            r0.mo8123f(r1, r2, r3)
            return
    }

    @Override // p243o1.InterfaceC4873c.a
    /* renamed from: e */
    public void mo8122e(p243o1.InterfaceC4871a r8) {
            r7 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r1 = r8
            p1.a r1 = (p265p1.C5342a) r1
            androidx.appcompat.widget.x r2 = new androidx.appcompat.widget.x
            r2.<init>(r0)
            android.database.Cursor r0 = r1.mo11012e0(r2)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lf9
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> Lf9
            if (r1 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L60
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            r4 = r8
            p1.a r4 = (p265p1.C5342a) r4
            android.database.Cursor r1 = r4.mo11012e0(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L3e
            java.lang.String r4 = r1.getString(r2)     // Catch: java.lang.Throwable -> L5b
            goto L3f
        L3e:
            r4 = r0
        L3f:
            r1.close()
            java.lang.String r1 = "919611ef948b8ee4a59dd43ad6337e2d"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L72
            java.lang.String r1 = "9ffdebb490f389286d5564778fa8517d"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L53
            goto L72
        L53:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r8.<init>(r0)
            throw r8
        L5b:
            r8 = move-exception
            r1.close()
            throw r8
        L60:
            k1.w$a r1 = r7.f16210c
            k1.w$b r1 = r1.mo7719a(r8)
            boolean r4 = r1.f16212a
            if (r4 == 0) goto Le4
            k1.w$a r1 = r7.f16210c
            java.util.Objects.requireNonNull(r1)
            r7.m8124g(r8)
        L72:
            k1.w$a r1 = r7.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r1 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r1
            io.tacocrypto.app.database.AppDatabase_Impl r4 = r1.f14250b
            int r5 = io.tacocrypto.app.database.AppDatabase_Impl.f14247s
            r4.f16187a = r8
            io.tacocrypto.app.database.AppDatabase_Impl r4 = r1.f14250b
            k1.t r4 = r4.f16191e
            monitor-enter(r4)
            boolean r5 = r4.f16166f     // Catch: java.lang.Throwable -> Le1
            if (r5 == 0) goto L8d
            java.lang.String r8 = "ROOM"
            java.lang.String r3 = "Invalidation tracker is initialized twice :/."
            android.util.Log.e(r8, r3)     // Catch: java.lang.Throwable -> Le1
            goto Lc1
        L8d:
            java.lang.String r5 = "PRAGMA temp_store = MEMORY;"
            r6 = r8
            p1.a r6 = (p265p1.C5342a) r6     // Catch: java.lang.Throwable -> Le1
            android.database.sqlite.SQLiteDatabase r6 = r6.f21240Y     // Catch: java.lang.Throwable -> Le1
            r6.execSQL(r5)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r5 = "PRAGMA recursive_triggers='ON';"
            r6 = r8
            p1.a r6 = (p265p1.C5342a) r6     // Catch: java.lang.Throwable -> Le1
            android.database.sqlite.SQLiteDatabase r6 = r6.f21240Y     // Catch: java.lang.Throwable -> Le1
            r6.execSQL(r5)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r5 = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            r6 = r8
            p1.a r6 = (p265p1.C5342a) r6     // Catch: java.lang.Throwable -> Le1
            android.database.sqlite.SQLiteDatabase r6 = r6.f21240Y     // Catch: java.lang.Throwable -> Le1
            r6.execSQL(r5)     // Catch: java.lang.Throwable -> Le1
            r4.m8099i(r8)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r5 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "
            p1.a r8 = (p265p1.C5342a) r8     // Catch: java.lang.Throwable -> Le1
            p1.d r6 = new p1.d     // Catch: java.lang.Throwable -> Le1
            android.database.sqlite.SQLiteDatabase r8 = r8.f21240Y     // Catch: java.lang.Throwable -> Le1
            android.database.sqlite.SQLiteStatement r8 = r8.compileStatement(r5)     // Catch: java.lang.Throwable -> Le1
            r6.<init>(r8)     // Catch: java.lang.Throwable -> Le1
            r4.f16167g = r6     // Catch: java.lang.Throwable -> Le1
            r4.f16166f = r3     // Catch: java.lang.Throwable -> Le1
        Lc1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le1
            io.tacocrypto.app.database.AppDatabase_Impl r8 = r1.f14250b
            java.util.List<k1.v$b> r8 = r8.f16193g
            if (r8 == 0) goto Lde
            int r8 = r8.size()
        Lcc:
            if (r2 >= r8) goto Lde
            io.tacocrypto.app.database.AppDatabase_Impl r3 = r1.f14250b
            java.util.List<k1.v$b> r3 = r3.f16193g
            java.lang.Object r3 = r3.get(r2)
            k1.v$b r3 = (p179k1.AbstractC3664v.b) r3
            java.util.Objects.requireNonNull(r3)
            int r2 = r2 + 1
            goto Lcc
        Lde:
            r7.f16209b = r0
            return
        Le1:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le1
            throw r8
        Le4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r1.f16213b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lf9:
            r8 = move-exception
            r0.close()
            throw r8
    }

    @Override // p243o1.InterfaceC4873c.a
    /* renamed from: f */
    public void mo8123f(p243o1.InterfaceC4871a r12, int r13, int r14) {
            r11 = this;
            k1.m r0 = r11.f16209b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L110
            k1.v$c r0 = r0.f16149d
            java.util.Objects.requireNonNull(r0)
            if (r13 != r14) goto L13
            java.util.List r0 = java.util.Collections.emptyList()
            goto L7d
        L13:
            if (r14 <= r13) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L1e:
            if (r3 == 0) goto L23
            if (r5 >= r14) goto L7c
            goto L25
        L23:
            if (r5 <= r14) goto L7c
        L25:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, l1.b>> r6 = r0.f16208a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L35
            goto L78
        L35:
            if (r3 == 0) goto L3c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L40
        L3c:
            java.util.Set r8 = r6.keySet()
        L40:
            java.util.Iterator r8 = r8.iterator()
        L44:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L73
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L5b
            if (r9 > r14) goto L61
            if (r9 <= r5) goto L61
            goto L5f
        L5b:
            if (r9 < r14) goto L61
            if (r9 >= r5) goto L61
        L5f:
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 == 0) goto L44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            l1.b r5 = (p196l1.AbstractC4163b) r5
            r4.add(r5)
            r5 = 1
            goto L76
        L73:
            r6 = 0
            r9 = r5
            r5 = 0
        L76:
            if (r5 != 0) goto L7a
        L78:
            r0 = r7
            goto L7d
        L7a:
            r5 = r9
            goto L1e
        L7c:
            r0 = r4
        L7d:
            if (r0 == 0) goto L110
            k1.w$a r3 = r11.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r3 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r3
            java.util.Objects.requireNonNull(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r4 = r12.mo11017r0(r4)
        L91:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L10b
            if (r5 == 0) goto L9f
            java.lang.String r5 = r4.getString(r1)     // Catch: java.lang.Throwable -> L10b
            r3.add(r5)     // Catch: java.lang.Throwable -> L10b
            goto L91
        L9f:
            r4.close()
            java.util.Iterator r3 = r3.iterator()
        La6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lcf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "room_fts_content_sync_"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "DROP TRIGGER IF EXISTS "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r12.mo11018s(r4)
            goto La6
        Lcf:
            java.util.Iterator r0 = r0.iterator()
        Ld3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le3
            java.lang.Object r3 = r0.next()
            l1.b r3 = (p196l1.AbstractC4163b) r3
            r3.m9222a(r12)
            goto Ld3
        Le3:
            k1.w$a r0 = r11.f16210c
            k1.w$b r0 = r0.mo7719a(r12)
            boolean r3 = r0.f16212a
            if (r3 == 0) goto Lf6
            k1.w$a r0 = r11.f16210c
            java.util.Objects.requireNonNull(r0)
            r11.m8124g(r12)
            goto L111
        Lf6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = android.support.v4.media.C0144c.m256a(r13)
            java.lang.String r14 = r0.f16213b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L10b:
            r12 = move-exception
            r4.close()
            throw r12
        L110:
            r2 = 0
        L111:
            if (r2 != 0) goto L18c
            k1.m r0 = r11.f16209b
            if (r0 == 0) goto L168
            boolean r0 = r0.m8085a(r13, r14)
            if (r0 != 0) goto L168
            k1.w$a r13 = r11.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r13 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r13
            java.util.Objects.requireNonNull(r13)
            java.lang.String r14 = "DROP TABLE IF EXISTS `wallets`"
            r12.mo11018s(r14)
            java.lang.String r14 = "DROP TABLE IF EXISTS `contacts`"
            r12.mo11018s(r14)
            io.tacocrypto.app.database.AppDatabase_Impl r14 = r13.f14250b
            int r0 = io.tacocrypto.app.database.AppDatabase_Impl.f14247s
            java.util.List<k1.v$b> r14 = r14.f16193g
            if (r14 == 0) goto L14c
            int r14 = r14.size()
        L13a:
            if (r1 >= r14) goto L14c
            io.tacocrypto.app.database.AppDatabase_Impl r0 = r13.f14250b
            java.util.List<k1.v$b> r0 = r0.f16193g
            java.lang.Object r0 = r0.get(r1)
            k1.v$b r0 = (p179k1.AbstractC3664v.b) r0
            java.util.Objects.requireNonNull(r0)
            int r1 = r1 + 1
            goto L13a
        L14c:
            k1.w$a r13 = r11.f16210c
            io.tacocrypto.app.database.AppDatabase_Impl$a r13 = (io.tacocrypto.app.database.AppDatabase_Impl.C3200a) r13
            java.util.Objects.requireNonNull(r13)
            java.lang.String r13 = "CREATE TABLE IF NOT EXISTS `wallets` (`username` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`username`))"
            r12.mo11018s(r13)
            java.lang.String r13 = "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `address` TEXT NOT NULL, `name` TEXT NOT NULL)"
            r12.mo11018s(r13)
            java.lang.String r13 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r12.mo11018s(r13)
            java.lang.String r13 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '919611ef948b8ee4a59dd43ad6337e2d')"
            r12.mo11018s(r13)
            goto L18c
        L168:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " to "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L18c:
            return
    }

    /* renamed from: g */
    public final void m8124g(p243o1.InterfaceC4871a r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r2.mo11018s(r0)
            java.lang.String r0 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '919611ef948b8ee4a59dd43ad6337e2d')"
            r2.mo11018s(r0)
            return
    }
}
