package p071e6;

/* renamed from: e6.f */
/* loaded from: classes.dex */
public final class C1531f implements android.os.Parcelable.Creator<p071e6.C1521a> {
    public C1531f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p071e6.C1521a createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = 0
            r9 = 0
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L49
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L37;
                case 5: goto L2d;
                case 6: goto L27;
                case 7: goto L21;
                default: goto L1d;
            }
        L1d:
            p270p6.C5368b.m11709s(r11, r1)
            goto Lc
        L21:
            boolean r1 = p270p6.C5368b.m11700j(r11, r1)
            r9 = r1
            goto Lc
        L27:
            boolean r1 = p270p6.C5368b.m11700j(r11, r1)
            r8 = r1
            goto Lc
        L2d:
            android.os.Parcelable$Creator<e6.e> r2 = p071e6.C1529e.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r11, r1, r2)
            e6.e r1 = (p071e6.C1529e) r1
            r7 = r1
            goto Lc
        L37:
            android.os.IBinder r1 = p270p6.C5368b.m11704n(r11, r1)
            r6 = r1
            goto Lc
        L3d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r5 = r1
            goto Lc
        L43:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r4 = r1
            goto Lc
        L49:
            p270p6.C5368b.m11699i(r11, r0)
            e6.a r11 = new e6.a
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p071e6.C1521a[] newArray(int r1) {
            r0 = this;
            e6.a[] r1 = new p071e6.C1521a[r1]
            return r1
    }
}
