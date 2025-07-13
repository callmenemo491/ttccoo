package io.tacocrypto.app.media.library;

/* loaded from: classes.dex */
public final class AlbumArtContentProvider extends android.content.ContentProvider {

    /* renamed from: Y */
    public static final io.tacocrypto.app.media.library.AlbumArtContentProvider f14251Y = null;

    /* renamed from: Z */
    public static final java.util.Map<android.net.Uri, android.net.Uri> f14252Z = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            io.tacocrypto.app.media.library.AlbumArtContentProvider.f14252Z = r0
            return
    }

    public AlbumArtContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            java.lang.String r2 = "uri"
            p214m2.C4339q.m9706k(r1, r2)
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            java.lang.String r0 = "uri"
            p214m2.C4339q.m9706k(r2, r0)
            r2 = 0
            return r2
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.String r2 = "uri"
            p214m2.C4339q.m9706k(r1, r2)
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "uri"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "mode"
            p214m2.C4339q.m9706k(r7, r0)
            android.content.Context r7 = r5.getContext()
            r0 = 0
            if (r7 != 0) goto L12
            return r0
        L12:
            java.util.Map<android.net.Uri, android.net.Uri> r1 = io.tacocrypto.app.media.library.AlbumArtContentProvider.f14252Z
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r6)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L6a
            java.io.File r2 = new java.io.File
            java.io.File r3 = r7.getCacheDir()
            java.lang.String r6 = r6.getPath()
            r2.<init>(r3, r6)
            boolean r6 = r2.exists()
            if (r6 != 0) goto L63
            com.bumptech.glide.j r6 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r7)     // Catch: java.lang.Throwable -> L50
            com.bumptech.glide.i r6 = r6.mo2767p()     // Catch: java.lang.Throwable -> L50
            com.bumptech.glide.i r6 = r6.mo2756S(r1)     // Catch: java.lang.Throwable -> L50
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            c3.c r6 = r6.m2761X(r7, r7)     // Catch: java.lang.Throwable -> L50
            r3 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L50
            c3.f r6 = (p033c3.C0860f) r6     // Catch: java.lang.Throwable -> L50
            java.lang.Object r6 = r6.get(r3, r7)     // Catch: java.lang.Throwable -> L50
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r6 = move-exception
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
        L55:
            boolean r7 = r6 instanceof ch.C0979f.a
            if (r7 == 0) goto L5a
            r6 = r0
        L5a:
            java.io.File r6 = (java.io.File) r6
            if (r6 != 0) goto L5f
            return r0
        L5f:
            r6.renameTo(r2)
            r2 = r6
        L63:
            r6 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r2, r6)
            return r6
        L6a:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r6 = r6.getPath()
            r7.<init>(r6)
            throw r7
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            java.lang.String r2 = "uri"
            p214m2.C4339q.m9706k(r1, r2)
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.String r2 = "uri"
            p214m2.C4339q.m9706k(r1, r2)
            r1 = 0
            return r1
    }
}
