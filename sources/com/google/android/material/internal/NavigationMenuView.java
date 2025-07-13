package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements androidx.appcompat.view.menu.InterfaceC0216j {
    public NavigationMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r3 = 1
            r2.<init>(r3, r0)
            r1.setLayoutManager(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j
    /* renamed from: b */
    public void mo465b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            return
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }
}
