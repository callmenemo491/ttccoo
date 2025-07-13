package p287q7;

/* renamed from: q7.d */
/* loaded from: classes.dex */
public final class C5586d implements android.os.Parcelable.Creator<p287q7.C5584b> {
    public C5586d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p287q7.C5584b createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L36
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L31
            r6 = 2
            if (r5 == r6) goto L2c
            r6 = 3
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r8, r4, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            goto L8
        L2c:
            int r2 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L31:
            int r1 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L36:
            p270p6.C5368b.m11699i(r8, r0)
            q7.b r8 = new q7.b
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p287q7.C5584b[] newArray(int r1) {
            r0 = this;
            q7.b[] r1 = new p287q7.C5584b[r1]
            return r1
    }
}
