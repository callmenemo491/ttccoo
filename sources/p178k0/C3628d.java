package p178k0;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public class C3628d {

    /* renamed from: a */
    public static final java.util.Comparator<byte[]> f16010a = null;

    /* renamed from: k0.d$a */
    public class a implements java.util.Comparator<byte[]> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(byte[] r5, byte[] r6) {
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                r2 = 0
                if (r0 == r1) goto Lc
                int r5 = r5.length
                int r6 = r6.length
                goto L1a
            Lc:
                r0 = 0
            Ld:
                int r1 = r5.length
                if (r0 >= r1) goto L20
                r1 = r5[r0]
                r3 = r6[r0]
                if (r1 == r3) goto L1d
                r5 = r5[r0]
                r6 = r6[r0]
            L1a:
                int r2 = r5 - r6
                goto L20
            L1d:
                int r0 = r0 + 1
                goto Ld
            L20:
                return r2
        }
    }

    static {
            k0.d$a r0 = new k0.d$a
            r0.<init>()
            p178k0.C3628d.f16010a = r0
            return
    }

    /* renamed from: a */
    public static p178k0.C3635k m8072a(android.content.Context r20, p178k0.C3629e r21, android.os.CancellationSignal r22) {
            r0 = r21
            android.content.pm.PackageManager r1 = r20.getPackageManager()
            android.content.res.Resources r2 = r20.getResources()
            java.lang.String r3 = r0.f16011a
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L1ad
            java.lang.String r6 = r5.packageName
            java.lang.String r7 = r0.f16012b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L196
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L2d:
            int r7 = r1.length
            if (r6 >= r7) goto L3c
            r7 = r1[r6]
            byte[] r7 = r7.toByteArray()
            r3.add(r7)
            int r6 = r6 + 1
            goto L2d
        L3c:
            java.util.Comparator<byte[]> r1 = p178k0.C3628d.f16010a
            java.util.Collections.sort(r3, r1)
            java.util.List<java.util.List<byte[]>> r1 = r0.f16014d
            if (r1 == 0) goto L46
            goto L4a
        L46:
            java.util.List r1 = p065e0.C1501f.m4079b(r2, r4)
        L4a:
            r2 = 0
        L4b:
            int r6 = r1.size()
            r7 = 0
            r8 = 1
            if (r2 >= r6) goto L93
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r9 = r1.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r6.<init>(r9)
            java.util.Comparator<byte[]> r9 = p178k0.C3628d.f16010a
            java.util.Collections.sort(r6, r9)
            int r9 = r3.size()
            int r10 = r6.size()
            if (r9 == r10) goto L6e
            goto L87
        L6e:
            r9 = 0
        L6f:
            int r10 = r3.size()
            if (r9 >= r10) goto L8c
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r6.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L89
        L87:
            r6 = 0
            goto L8d
        L89:
            int r9 = r9 + 1
            goto L6f
        L8c:
            r6 = 1
        L8d:
            if (r6 == 0) goto L90
            goto L94
        L90:
            int r2 = r2 + 1
            goto L4b
        L93:
            r5 = r7
        L94:
            if (r5 != 0) goto L9c
            k0.k r0 = new k0.k
            r0.<init>(r8, r7)
            return r0
        L9c:
            java.lang.String r1 = r5.authority
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r5 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r5)
            android.net.Uri$Builder r3 = r3.authority(r1)
            android.net.Uri r3 = r3.build()
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            android.net.Uri$Builder r5 = r6.scheme(r5)
            android.net.Uri$Builder r1 = r5.authority(r1)
            java.lang.String r5 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r5)
            android.net.Uri r1 = r1.build()
            java.lang.String r9 = "_id"
            java.lang.String r10 = "file_id"
            java.lang.String r11 = "font_ttc_index"
            java.lang.String r12 = "font_variation_settings"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_italic"
            java.lang.String r15 = "result_code"
            java.lang.String[] r11 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}     // Catch: java.lang.Throwable -> L18f
            android.content.ContentResolver r9 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L18f
            java.lang.String r12 = "query = ?"
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L18f
            java.lang.String r0 = r0.f16013c     // Catch: java.lang.Throwable -> L18f
            r13[r4] = r0     // Catch: java.lang.Throwable -> L18f
            r14 = 0
            r15 = 0
            r10 = r3
            android.database.Cursor r7 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L18f
            if (r7 == 0) goto L17c
            int r0 = r7.getCount()     // Catch: java.lang.Throwable -> L18f
            if (r0 <= 0) goto L17c
            java.lang.String r0 = "result_code"
            int r0 = r7.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L18f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18f
            r2.<init>()     // Catch: java.lang.Throwable -> L18f
            java.lang.String r5 = "_id"
            int r5 = r7.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r6 = "file_id"
            int r6 = r7.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r9 = "font_ttc_index"
            int r9 = r7.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r10 = "font_weight"
            int r10 = r7.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r11 = "font_italic"
            int r11 = r7.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L18f
        L123:
            boolean r12 = r7.moveToNext()     // Catch: java.lang.Throwable -> L18f
            if (r12 == 0) goto L17c
            r12 = -1
            if (r0 == r12) goto L133
            int r13 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L18f
            r19 = r13
            goto L136
        L133:
            r13 = 0
            r19 = 0
        L136:
            if (r9 == r12) goto L13f
            int r13 = r7.getInt(r9)     // Catch: java.lang.Throwable -> L18f
            r16 = r13
            goto L142
        L13f:
            r13 = 0
            r16 = 0
        L142:
            if (r6 != r12) goto L14d
            long r13 = r7.getLong(r5)     // Catch: java.lang.Throwable -> L18f
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r3, r13)     // Catch: java.lang.Throwable -> L18f
            goto L155
        L14d:
            long r13 = r7.getLong(r6)     // Catch: java.lang.Throwable -> L18f
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r1, r13)     // Catch: java.lang.Throwable -> L18f
        L155:
            r15 = r13
            if (r10 == r12) goto L15f
            int r13 = r7.getInt(r10)     // Catch: java.lang.Throwable -> L18f
            r17 = r13
            goto L163
        L15f:
            r13 = 400(0x190, float:5.6E-43)
            r17 = 400(0x190, float:5.6E-43)
        L163:
            if (r11 == r12) goto L16f
            int r12 = r7.getInt(r11)     // Catch: java.lang.Throwable -> L18f
            if (r12 != r8) goto L16f
            r12 = 1
            r18 = 1
            goto L172
        L16f:
            r12 = 0
            r18 = 0
        L172:
            k0.l r12 = new k0.l     // Catch: java.lang.Throwable -> L18f
            r14 = r12
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L18f
            r2.add(r12)     // Catch: java.lang.Throwable -> L18f
            goto L123
        L17c:
            if (r7 == 0) goto L181
            r7.close()
        L181:
            k0.l[] r0 = new p178k0.C3636l[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            k0.l[] r0 = (p178k0.C3636l[]) r0
            k0.k r1 = new k0.k
            r1.<init>(r4, r0)
            return r1
        L18f:
            r0 = move-exception
            if (r7 == 0) goto L195
            r7.close()
        L195:
            throw r0
        L196:
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r2 = "Found content provider "
            java.lang.String r4 = ", but package was not "
            java.lang.StringBuilder r2 = androidx.activity.result.C0196d.m449a(r2, r3, r4)
            java.lang.String r0 = r0.f16012b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L1ad:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r3)
            r0.<init>(r1)
            throw r0
    }
}
