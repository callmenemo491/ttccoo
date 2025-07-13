package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.n */
/* loaded from: classes.dex */
public class C1026n extends com.bumptech.glide.load.data.AbstractC1024l<java.io.InputStream> {

    /* renamed from: b0 */
    public static final android.content.UriMatcher f5220b0 = null;

    static {
            android.content.UriMatcher r0 = new android.content.UriMatcher
            r1 = -1
            r0.<init>(r1)
            com.bumptech.glide.load.data.C1026n.f5220b0 = r0
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r2 = "contacts/lookup/*/#"
            r3 = 1
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/lookup/*"
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/photo"
            r3 = 2
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#"
            r3 = 3
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/display_photo"
            r3 = 4
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "phone_lookup/*"
            r3 = 5
            r0.addURI(r1, r2, r3)
            return
    }

    public C1026n(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<java.io.InputStream> mo2786a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: c */
    public void mo2787c(java.io.InputStream r1) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AbstractC1024l
    /* renamed from: d */
    public java.io.InputStream mo2788d(android.net.Uri r4, android.content.ContentResolver r5) {
            r3 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.C1026n.f5220b0
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 5
            if (r0 == r2) goto L19
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L23
        L14:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L23
        L19:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L32
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L23:
            if (r5 == 0) goto L26
            return r5
        L26:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r4 = androidx.appcompat.widget.C0298q0.m776a(r0, r4)
            r5.<init>(r4)
            throw r5
        L32:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
    }
}
